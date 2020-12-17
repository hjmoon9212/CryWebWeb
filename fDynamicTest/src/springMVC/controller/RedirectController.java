package springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {

	
	@RequestMapping("select.do")
	public void select(Model m) {////////////여기가 view로 넘어가는 것
		System.out.println("select.do 요청");
		m.addAttribute("info","추후 디비값");
		
		
	}
	
	@RequestMapping("insert.do")
	public String insert() {
		System.out.println("insert.do 요청");
		//입력 후에 목록보기 페이지 전환하기
		//return "select"; 출력 페이지만 지정(값은 가지고 오지 않음)
		return "redirect:select.do"; //*****리다이렉트
	}
	
	
}
