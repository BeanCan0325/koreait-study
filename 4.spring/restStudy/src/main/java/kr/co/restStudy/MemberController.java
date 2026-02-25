//package kr.co.restStudy;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import io.swagger.v3.oas.annotations.Operation;
//import io.swagger.v3.oas.annotations.tags.Tag;
//
//@RestController //@Controller + @ResponseBody
//@RequestMapping("/api")
//@Tag(name="Member", description="회원API")
//public class MemberController {
//	
//	@GetMapping("/{id}")
//	@Operation(summary="회원찾기", description="회원을 조회합니다.")
//	public ResponseEntity findMember(@PathVariable("id") Long id) {
//		Member m  = new Member();
//		m.setId(id);
//		m.setName("홍길동");
//		m.setAddr("부산");
//		
//		return new ResponseEntity(m, HttpStatus.NOT_FOUND);
//	}
//	
//	@PostMapping
//	public ResponseEntity<String> register(ReqMemberDTO request){
//		System.out.println(request.getEmail());
//		
//		return new ResponseEntity<String>("회원가입 성공", HttpStatus.OK);
//		
//	}
//
//}
