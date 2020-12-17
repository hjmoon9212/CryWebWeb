package springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import springMVC.model.MemberVO;
import springMVC.model.MemberVOList;

@Controller
public class ListController {

	@RequestMapping("multiInsert.do")
	public void testList(MemberVOList list) {
		System.out.println("multiInsert.do 요청");
		
		for(MemberVO vo : list.getList()) {
			System.out.println(vo.isState() + "/" + vo.getId() + "/" + vo.getName() + "/" + vo.getAge());
		}
	}
	
}
