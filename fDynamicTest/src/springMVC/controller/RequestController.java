package springMVC.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springMVC.model.MemberVO;

@Controller
@RequestMapping("/board")
public class RequestController {
	
	@RequestMapping(value="/c.do", params={"id=kim"})
	public void xx() {
		System.out.println("c.do 요청");
		//view page가 어떻게 잡힐까?
		/*
		 * /WEB-INF/views/ + /board + /c + .jsp
		 */
	}
   
	@RequestMapping(value = {"/a.do","/b.do"})
	public String test() {
	System.out.println("a.do 요청과 b.do 요청 받음");	
		return "end";
	}
	/*
	 * ***********************************
	 * return형이 String인 경우
	 * 			문자열을 반환하는 것이 아님(절대로)
	 * 			view page명을 지정
	 * 
	 */
	
	
   @RequestMapping(value="/request.do",method = RequestMethod.POST)
   public void requestConte(MemberVO vo)
   {
      System.out.println("request.do 요청");
      
      /*
       *  함수의 리턴혀이 void 인 경우
       * 뷰페이지가 자동으로 지정된다.
       * prefix suffix가 자동으로 붙은곳으로 감.
       * 
       * 
       * requst.do ->
       * /WEB-INF/views/ + request + .jsp
       *
       * /WEB-INF/views/ + /board + /request + .jsp
       */
     }
   
   
   
}

