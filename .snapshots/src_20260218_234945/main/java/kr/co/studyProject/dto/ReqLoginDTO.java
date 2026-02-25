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
@ToString // 모든 필드에 있는 값을 다 보여준다. 
public class ReqLoginDTO {
	private String email;
	private String password;
}
