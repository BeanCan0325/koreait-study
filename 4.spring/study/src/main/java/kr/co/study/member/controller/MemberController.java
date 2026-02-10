package kr.co.study.member.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
import kr.co.study.member.dto.ReqLoginDTO;
import kr.co.study.member.dto.ReqRegisterDTO;
import kr.co.study.member.dto.ResLoginDTO;
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
			
			/**
			 * 회원가입 요청을 처리할 때 사용되는 메서드 입니다.
			 * localhost:8080/member/register로 POST 요청이 오면 처리합니다.
			 * 
			 * 요청 데이터의 이름(userName, userId, ...) 과 ReqResisterDTO의 변수명이 일치해야합니다.
			 * 
			 * @param request 회원가입 요청 데이터를 담은 DTO
			 * @return /src/resources/templates/pages/member/login.html
			 */
			@PostMapping("/register")
			public String register(ReqRegisterDTO request) {
				memberService.register(request);
				return "redirect:/member/login/form";
//						redirect를 붙이면 해당 경로를 Spring에게 다시 요청
//						 	- 쉽게는 컨트롤러가 컨트롤러를 다시 호출할 때 주로 사용 (스프링 자기자신에게) 
			}
			
			@GetMapping("/login/form")
				public String loginForm() {
					return "pages/member/login";
				}
			
			/**
			 * 로그인 요청을 처리하는 메서드 입니다.
			 * 
			 * @param request 사용자가 입력한 로그인 정보
			 * @return
			 */
			@PostMapping("/login")
			  	public String login(ReqLoginDTO request, HttpSession session) {
				ResLoginDTO response = memberService.login(request);
				
				if (response == null) {
					return "redirect:/member/login/form";
				}
				
//				로그인이 성공할 경우
				session.setAttribute("LOGIN_USER", response);
				return "redirect:/"; //메인 페이지로 이동
			}
			
			
			/**
			 * 로그아웃 처리하는 메서드입니다.
			 * 세션을 무효화한 후 메인 페이지로 이동
			 * 
			 * @param session 현재 사용자의 세션
			 * @return /로 리다이렉트(메인 페이지)
			 */
			@GetMapping("/logout")
			public String logout(HttpSession session) {
				
				session.invalidate();// 세션 무효화 
				return "redirect:/";
			}
				
			
	}


