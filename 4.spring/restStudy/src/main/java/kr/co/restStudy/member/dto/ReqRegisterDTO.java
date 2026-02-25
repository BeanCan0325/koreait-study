package kr.co.restStudy.member.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter  // Getter 생성
@Setter	 // Setter 생성
@NoArgsConstructor  // 기본 생성자
@AllArgsConstructor // 모든 필드가 다 있는 생성자
@ToString // 모든 필드에 있는 값을 문자열 형태로 반환
@Data // (권장하지 않음) Getter+Setter+ToString+, ... 이것저것 다 합쳐진 어노테이션
@Schema(description="로그인 요청 DTO")
public class ReqRegisterDTO {
	
	@Schema(description="유저 이름", example="홍길동")
	private String userName;
	
	@Schema(description="유저 아이디", example="test")
	private String userId;
	@Schema(description="유저 이메일", example="test@naver.com")
	private String email; 
	@Schema(description="비밀번호", example="qwer1234!")
	private String password;
	@Schema(description="비밀번호 확인", example="qwer1234!")
	private String passwordCheck;
}







