package springMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import springMVC.model.MemberVO;

@Controller
public class AutoScanController {
	
	@Autowired
	private MemberVO memberVo;

	@RequestMapping("autoScan.do")
	public ModelAndView xxxx() {
		System.out.println("autoScan.do 요청받음");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("autoScan");
		//->/WEB-INF/view/autoScan.jsp
		
		mv.addObject("memVO",memberVo);//이름은 바꿔도 상관 없지만 헷갈린다..
		return mv;
	}
}
