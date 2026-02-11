package kr.co.studyProject.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // 나 웨이터야 하고 명찰을 다는 것.
@PostMapping("/api/member") // 회원가입하실 분은 이쪽 창구로 오세요. 하고 펫말을 거는것. 
@RequestBody
public class MemberController {

		private final MemberService memberService;
	
}
