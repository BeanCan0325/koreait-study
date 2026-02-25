package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;

import java.util.Optional;

public class MemberService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    /**
     * 회원가입
     */
    public long join(Member member) {

//        같은이름 중복회원 x
//        memberRepository.findByName(member.getName());
//         -> ctrl+alt+v
        Optional<Member> result =memberRepository.findByName(member.getName());
        result.ifPresent(m -> {throw new IllegalStateException("이미 존재하는 회원입니다.")});

        memberRepository.save(member);
        return member.getId();
    }
}
