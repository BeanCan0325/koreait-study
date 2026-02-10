package kr.co.studyProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.studyProject.entity.Member;

public interface memberRepository extends JpaRepository<Member, Long>{

}
