package kr.co.studyProject.service.impl;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.studyProject.dto.ReqLoginDTO;
import kr.co.studyProject.dto.ReqRegisterDTO;
import kr.co.studyProject.dto.ResLoginDTO;
import kr.co.studyProject.entity.Member;
import kr.co.studyProject.repository.MemberRepository;
import kr.co.studyProject.service.MemberService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService  {
		
	private final MemberRepository memberRepository;
	private final BCryptPasswordEncoder passwordEncoder;
	

	@Override
	@Transactional
	public String register(ReqRegisterDTO request) {
			
		Member mem = new Member();
//		1. 비밀번호 확인 검증
		if(!request.getPassword().equals(request.getPasswordCheck())) {
			throw new IllegalStateException("비밀번호가 일치하지 않습니다.");
		}
		
//		2. 이메일 중복체크
		if(memberRepository.existsByEmail(request.getEmail())) {
			throw new IllegalStateException("이미 사용중인 이메일 입니다.");
		}
		
		
		mem.setEmail(request.getEmail());
		mem.setPassword(request.getPassword());
		mem.setUserName(request.getUserName());
		mem.setNickName(request.getNickName());
		mem.setPhoneNumber(request.getPhone());
		
		String encodedPassword = passwordEncoder.encode(request.getPassword());
		mem.setPassword(encodedPassword);
		
		memberRepository.save(mem);
		
		return mem.getUserName()+"님 가입 성공";
		
	}
	
	@Override
	public ResLoginDTO login(ReqLoginDTO request) {
		Member member = memberRepository.findByEmail(request.getEmail());
		if(member == null) {
			return null;
		}
		
		if(!passwordEncoder.matches(request.getPassword(), member.getPassword())) {
			// matches 평문데이터와 .getPassword같은지 확인해주는애 
			return null;
		}
		
		ResLoginDTO response = new ResLoginDTO();
		response.setEmail(member.getEmail());
		response.setUserName(member.getUserName());
		
		return null;
	}
}
