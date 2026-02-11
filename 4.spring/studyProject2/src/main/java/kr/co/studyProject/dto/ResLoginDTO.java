package kr.co.studyProject.dto;

import lombok.Data;

@Data
public class ResLoginDTO {
		// 로그인 성공 후 돌려줄 정보들 
		private String email;  //"이 이메일로 로그인 성공함"
		private String nickname; // "환영합니다. 00님" 할때 쓸 닉네임
		
	
}
