package kr.co.studyProject.dto;

import lombok.Data;

@Data
public class ReqRegisterDTO {
	private String email;
	private String password;
	
	private String name;
	private String nickName;
	private String phone;

}
