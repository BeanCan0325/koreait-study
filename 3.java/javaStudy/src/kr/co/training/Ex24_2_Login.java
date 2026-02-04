package kr.co.training;

public class Ex24_2_Login  implements Ex24_2_LoginInterface{
	
	private String memberId;
	private Integer memberPwd;
	
	@Override
	public String login() {
		return getMemberId();
	}
	
//	--- setter/getter
	void setMemberId(String inputId) {
		memberId = inputId;
	}
	
	String getMemberId() {
		return memberId;
	}
//	---
	void setMemberPwd(int inputPw) {
		memberPwd = inputPw;
	}
	
	Integer getMemberPwd() {
		return memberPwd;
	}
//	---

}
