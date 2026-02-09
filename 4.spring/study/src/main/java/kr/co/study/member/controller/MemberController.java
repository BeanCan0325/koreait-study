package kr.co.study.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.study.member.dto.ReqRegisterDTO;
import kr.co.study.member.service.MemberService;
import lombok.RequiredArgsConstructor;

@Controller	//컨트롤러임을 선언하는 어노테이션
@RequestMapping("/member")  //URL 매핑(GET+POST)
@RequiredArgsConstructor // final이 붙은 필드에 대한 생성자만 만든다.
public class MemberController {
	
//		@AutoWired (필드주입방식) <--> 우리는 생성자 주입방식 사용 @RequiredArgsCons-
//			spring이 알아서 넣어주는데, 권장하지 않는 방식

		private final MemberService memberService;
	
	
		
//			localhost:8080/member/register/form(GET)으로 오면 실행
			@GetMapping("/register/form")
				public String registerForm(){//get요청만 받음
				return "pages/member/register";
//				/** enter -> 메모
				/**
				 * 회원가입 페이지로 이동할 때 사용되는 메서드 입니다.
				 * localhost:8080/member/register/form(GET)으로 오면 실행됩니다.
				 *	@return
				 */
			}
			
			@PostMapping("/register")
			public String register(ReqRegisterDTO request) {
				memberService.register(request);
				return "pages/member/login";
			}
	}


