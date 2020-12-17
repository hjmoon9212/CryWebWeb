package springMVC.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springMVC.model.User;

@Controller
public class ParamController {
	
	@RequestMapping("param.do")
	public void param(@RequestParam("cate") String ct, @RequestParam("kind") String kd) {
		//이름을 안 맞추면 값을 받아오지 않는다
		System.out.println("param.do 요청");
		System.out.println(ct);
		System.out.println(kd);
	}
	
	//login.do 요청시 받을 파라미터 지정
	@RequestMapping("login.do")
//	public void login(String id, String password) {
	public void login(User user, HttpSession session) {
		
		System.out.println(user.getId());
		System.out.println(user.getPassword());
		
		//DB 회원 테이블의 값이라 지정
		String dbId= "java";
		String dbPassword="1234";
		
		if(user.getId().equals(dbId) && user.getPassword().equals(dbPassword)) {
			//session에 로그인 정보 저장
			session.setAttribute("login", dbId);
		}
		
		/*
		 * session이 필요할 때 HttpSession session을 매개변수에 지정
		 */
	}

}
