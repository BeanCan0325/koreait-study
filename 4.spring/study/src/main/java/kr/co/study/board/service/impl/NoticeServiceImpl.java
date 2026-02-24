package kr.co.study.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import kr.co.study.board.dto.ReqBoardDTO;
import kr.co.study.board.dto.ResBoardDTO;
import kr.co.study.board.entity.Board;
import kr.co.study.board.repository.BoardRepository;
import kr.co.study.board.service.BoardService;
import kr.co.study.member.entity.Member;
import kr.co.study.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class NoticeServiceImpl implements BoardService {

    private final BoardRepository boardRepository;
    private final MemberRepository memberRepository;

    @Override
    public void write(ReqBoardDTO request, Long writerId) {
        // 1. 작성자 조회
        Member writer = memberRepository.findById(writerId).orElse(null);

        if (writer == null) {
            System.out.println("유효하지 않은 사용자입니다.");
            return; // ★중요: 사용자가 없으면 여기서 멈춰야 아래 코드가 실행 안 됨!
        }

        // 2. Board 엔티티 생성 (이 부분이 write 메서드 안으로 들어와야 함)
        Board board = new Board();
        board.setBoardType("NOTICE");
        board.setCategory(request.getCategory());
        board.setTitle(request.getTitle());
        board.setContent(request.getContent());
        board.setWriterId(writer);
        board.setViewCount(0);

        // 3. DB 저장
        boardRepository.save(board);
    } // write 메서드 끝

    @Override
    public List<ResBoardDTO> getBoardList() {
        // 1. 공지사항 게시글 전체 조회 (id 내림차순)
        List<Board> boardList = boardRepository.findByBoardTypeOrderByIdDesc("NOTICE");

        // 2. Entity 리스트를 DTO 리스트로 변환 (반환 타입에 맞춰줘야 함)
        // (ResBoardDTO에 생성자가 있다고 가정)
//        return boardList.stream()
//                .map(board -> new ResBoardDTO(board)) 
//                .collect(Collectors.toList());
        
        List<ResBoardDTO> list = new ArrayList<>();
        
        for(Board b : boardList) {
        	ResBoardDTO response = new ResBoardDTO();
        	
        	response.setId(b.getId());
        	response.setCategory(b.getCategory());
        	
        	response.setTitle(b.getTitle());
        	response.setContent(b.getContent());
        	response.setWriterName(b.getWriterId().getUserName());
        	response.setCreatedAt(b.getCreatedAt());
        	
        	list.add(response);
        	
        }
        
        //3. 응답객체(Response DTO) 반환
        return list;
    }
}