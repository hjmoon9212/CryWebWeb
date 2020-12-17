package springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping("test.do")
	public void testController(){
		System.out.println("test.do 요청받음");
		
	}

}

/*
 *return형이 void인 경우 요청 명으로 view page 자동 지정
 *test.do => test
 *			/WEB-INF/view/ +test + .jsp
 *
 *
 *
 */
 