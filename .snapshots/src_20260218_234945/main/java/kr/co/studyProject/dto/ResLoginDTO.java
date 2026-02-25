package kr.co.studyProject.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter //Getter생성
@Setter //Setter 생성   -> 나중에는 이거쓰는거 왠만하면 지양. email정도만 
@NoArgsConstructor //기본생성자
@AllArgsConstructor //모든 필드가 다 있는 생성자
@ToString
public class ResLoginDTO {
		// 로그인 성공 후 돌려줄 정보들 
		private String email;  //"이 이메일로 로그인 성공함"
		private String userName;
		private String nickName; // "환영합니다. 00님" 할때 쓸 닉네임
		
	
}
