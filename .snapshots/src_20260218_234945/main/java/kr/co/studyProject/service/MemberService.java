package kr.co.studyProject.service;

import kr.co.studyProject.dto.ReqLoginDTO;
import kr.co.studyProject.dto.ReqRegisterDTO;
import kr.co.studyProject.dto.ResLoginDTO;

public interface MemberService {
	String register(ReqRegisterDTO request);
	
     ResLoginDTO login(ReqLoginDTO request);
}
