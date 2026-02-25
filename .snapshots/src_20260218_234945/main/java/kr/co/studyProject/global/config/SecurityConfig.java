package kr.co.studyProject.global.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


	// 스프링 실행 시점에 스프링 컨테이너가 관리할 빈(Bean) 객체들을 
	// 자바기반 설정으로 등록 및 설정하는 클래스임을 정의 
	@Configuration
public class SecurityConfig {
		
		@Bean //이 메서들을 빈(객체)로 관리하겠다.
		public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
			http.csrf(csrf -> csrf.disable()) //CSRF 비활성화
			.authorizeHttpRequests(auth -> auth.anyRequest().permitAll());
//			모든 요청을 허용하겠다. : 다 열어둔거 
			return http.build();
		}

		@Bean
		public BCryptPasswordEncoder passwordEncoder() {
			return new BCryptPasswordEncoder();
		}
	}


