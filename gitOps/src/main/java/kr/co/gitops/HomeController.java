package kr.co.gitops;

@RestController
public class HomeController {

	 @GetMapping("/")
	 public String home() {
		 return "버전 1.0 -cicd 테스트 입니다."
	 }
}
