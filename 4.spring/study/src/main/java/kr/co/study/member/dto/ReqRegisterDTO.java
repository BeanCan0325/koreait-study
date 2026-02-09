package kr.co.study.member.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter //Getter생성
@Setter //Setter 생성   -> 나중에는 이거쓰는거 왠만하면 지양. email정도만 
@NoArgsConstructor //기본생성자
@AllArgsConstructor //모든 필드가 다 있는 생성자
@ToString // 모든 필드에 있는 값을 다 보여준다. 
@Data //@권장하지 않음 /getter+setter+toString  이것저것 다 합쳐진 어노테이션 
public class ReqRegisterDTO {
	/**
	 * 회원가입 요청을 받는 DTO입니다.
	 * 회원가입에 필요한 정보(id,name,password...)를 받습니다. 
	 * 앞으로 요청DTO와 응답DTO 나눠서 관리
	 */
	private String userName; 
	private String userId;
	private String email;
	private String password;
	private String passwordCheck;
	

}
