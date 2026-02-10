package kr.co.study.member.service.impl;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import kr.co.study.member.dto.ReqLoginDTO;
import kr.co.study.member.dto.ReqRegisterDTO;
import kr.co.study.member.dto.ResLoginDTO;
import kr.co.study.member.entity.Member;
import kr.co.study.member.repository.MemberRepository;
import kr.co.study.member.service.MemberService;
import lombok.RequiredArgsConstructor;


/**
 * MemberService 인터페이스 구현체
 * 	- 회원과 관련된 비즈니스 로직을 처리
 */

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
	
	private final MemberRepository memberRepository;
	private final BCryptPasswordEncoder passwordEncoder;
	
	@Override
	public void register(ReqRegisterDTO request) {
		//1. 비밀번호& 비밀번호 확인 검증
		if(!request.getPassword().equals(request.getPasswordCheck())) {
			System.out.println("비밀번호가 일치하지 않습니다.");
			return;
		}
		
//		2. 아이디 중복체크 
		if(memberRepository.existsByUserId(request.getUserId())) {
			System.out.println("이미 사용중인 아이디 입니다.");
		}
		
//		3. 이메일 중복체크
		if(memberRepository.existsByEmail(request.getEmail())) {
			System.out.println("이미 사용중인 이메일 입니다.");
		}
		
//		4. 비밀번호 암호화 (Sptring Security의 BCrypt 사용)
		String encodedPassword = passwordEncoder.encode(request.getPassword());
		
//		5. Member 엔티티 저장
		Member member = new Member();
		member.setUserId(request.getUserId());
		member.setUserName(request.getUserName());
		member.setEmail(request.getEmail());
		member.setPassword(encodedPassword);
		
//		6.DB저장
		memberRepository.save(member);
	}
	
	@Override
	public ResLoginDTO login(ReqLoginDTO request) {
	Member member = memberRepository.findByUserId(request.getUserId());
		
	if(member == null) {
		return null;
	}
	
	if(!passwordEncoder.matches(request.getPassword(), member.getPassword())) {
		// matches 평문데이터와 .getPassword같은지 확인해주는애 
		return null;
	}
	
	ResLoginDTO response = new ResLoginDTO();
	response.setId(member.getId());
	response.setUserId(member.getUserId());
	response.setUserName(member.getUserName());
	response.setCreatedAt(member.getCreatedAt());
	response.setUpdatedAt(member.getUpdatedAt());
	
	return response;
	}
//		@Override
//		public void login(ReqLoginDTO request) {
////		1. 헤당 ID를 가진 유저를 조회
////			- 존재한다면 해당 정보(SELECT된 결과)를 엔티티에 저장
//			memberRepository.findByUserId(request.getUserId());
////		2. 존재하지 않으면 null 반환
////		3. 사용자가 입려한 비밀번호가 암호화된 비밀번호와 일치하는지 검증
////			- 일치하지 않으면 null반환
////			- 일치하면 응답 객체 반환
//	}

}
