package kr.co.study.board.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import kr.co.study.member.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Board {
	
	@Id //pk 지정
	@GeneratedValue(strategy=GenerationType.IDENTITY)//auto_increment로 생각하면됨
	private Long id;
	// 게시판 종류 구분
//		-NOTICE : 공지사항
//		-FREE : 자유게시판
	private String boardType;
	
	private String category;
	
	private Integer viewCount;
	
	private String title;
	
	@Lob //대용량 데이터   데이터베이스에서 text는 대용량 본문 .실제로는 태그들이 같이 들어와서 사용자가 쓰는것보다 길게 들어오기 때문
	private String content;
	
	@ManyToOne //N:1관계 
	@JoinColumn(name="writer_id")
	private Member writerId;
	
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	
	
	// 저장되기 전 자동 호출
	@PrePersist
	public void prePersist() {
		this.createdAt = LocalDateTime.now();
		this.updatedAt = LocalDateTime.now();
	}
	
	//수정되기 전
	@PreUpdate
	   public void preUpdate() {
	      this.updatedAt = LocalDateTime.now();
	   }
}
