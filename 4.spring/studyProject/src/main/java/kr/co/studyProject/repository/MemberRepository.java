package kr.co.studyProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.studyProject.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long>{
		boolean existsByEmail(String email);
		Member findByEmail(String email);
}

