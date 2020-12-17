package springMVC.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReturnTypeController {
	//[참고] 뷰페이지지 지정
	/*	1. ModelAndView 이용
	 * 2. void 리턴형 -> 자동지정
	 * 3. String 리턴형 -> 뷰페이지명 리턴
	 */
	
	
	
	/*****************************
	 * 컨트롤러에서 뷰단으로 데이터 전달방식
	 *  1. ModelAndView 리턴
	 *  2. Map 리턴(ex. HashMap)
	 *  2. Model 이용 (return하지 않음??)
	 * 
	 */
	
	@RequestMapping("map.do")
	public Map map() {
		Map map = new HashMap();
		map.put("message","오늘도 무사히");
		map.put("id","홍길자");
		return map;
	}
	
	
	
	/******************************
	 * 
	 */
	
	@RequestMapping("model.do")
	public String model(Model m) {
		m.addAttribute("message","우리조 화이팅");
		m.addAttribute("pm","김혜인");
		return "modelType";
	}
}
