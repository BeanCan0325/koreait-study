package kr.co.study;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //Handler == Controller
public class HomeController {
	@RequestMapping("/")
//					/ 뒤에 붙는것에 따라 다르게 받음 
//					다른예 /board -> @RequestMappint("/board)
//					일치하면 어노테이션에 붙은 메서드 실행
	public String goHome(Model model) {
		model.addAttribute("name", "홍길동");
//							키 value라고 생각하면됨 "name"이 키고 -> "홍길동"ㄴ
		model.addAttribute("message", "<strong>안녕하세요</strong>");
		
		
		List<String> items = Arrays.asList("item1","item2","item3");
		model.addAttribute("items",items);
//		서버사이드 문서(?) html을 동적으로 꺼낼 수 있는거 
		return "index";
		
	}
}
