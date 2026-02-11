package kr.co.studyProject.dto;

import lombok.Data;

@Data //Getter, Setter 자동생성
public class ReqLoginDTO {
	private String email;
	private String password;
}
