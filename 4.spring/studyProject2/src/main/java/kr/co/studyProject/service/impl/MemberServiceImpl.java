package kr.co.studyProject.service.impl;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.studyProject.dto.ReqRegisterDTO;
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
	public void register(ReqRegisterDTO request) {
		if(memberRepository.existsByEmail(request.getEmail()){
			throw new RuntimeException("이미 사용중인 이메일입니다.");
		};
		
		String encodedPassword = passwordEncoder.encode(request.getPassword());
		
		Member member = new Member();
		member.setEmail(request.getEmail());
		member.setPassword(encodedPassword);
		member.setUserName(request.getUserName());
		member.setNickName(request.getNickName());
		
		memberRepository.save(member);
	}
}
