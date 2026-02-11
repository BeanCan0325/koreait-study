package kr.co.studyProject.service;

import kr.co.studyProject.dto.ReqLoginDTO;
import kr.co.studyProject.dto.ReqRegisterDTO;

public interface MemberService {
	void register(ReqRegisterDTO request);
     ResLoginDTO login(ReqLoginDTO request);
}
