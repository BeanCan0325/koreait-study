package kr.co.studyProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpSession;
import kr.co.studyProject.dto.ReqLoginDTO;
import kr.co.studyProject.dto.ReqRegisterDTO;
import kr.co.studyProject.dto.ResLoginDTO;
import kr.co.studyProject.service.MemberService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MemberController {

	private final MemberService memberService;

	@GetMapping("/signup")
	public String signupForm() {
		return "signup";
		// openClaw용 메세지 추가 
	}
	
	
	
	
	@PostMapping("/signup")
	public String register(ReqRegisterDTO register) {
		try {
			memberService.register(register);
			return "redirect:/login";
		} catch (Exception e){
			e.printStackTrace();
			return "redirect:/signup";
	    }
	}
	
	
	@PostMapping("/login")
	public String login(ReqLoginDTO request, HttpSession session) {
		
		ResLoginDTO response = memberService.login(request);
		if (request == null) {
			return "redirect:/login/form";
	}
		session.setAttribute("LOGIN_USER", response);
		return "redirect:/";
}
}