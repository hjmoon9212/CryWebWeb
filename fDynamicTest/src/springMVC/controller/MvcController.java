package springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MvcController {
	
	@RequestMapping("kosmo.do")
	public ModelAndView test() {
		//1. 컨트롤러까지 왔는지 확인
		System.out.println("main 요청, controller");
		
		//2. 데이터 & 뷰 지정
		ModelAndView mv = new ModelAndView();
		mv.setViewName("end"); //view 페이지 지정

		return mv;
		
	}
}
