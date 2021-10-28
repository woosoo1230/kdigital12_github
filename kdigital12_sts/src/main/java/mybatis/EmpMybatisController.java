package mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpMybatisController {

	@Autowired
	EmpService service;
	
	@RequestMapping("/emplist")
	public ModelAndView emplist() {
		ModelAndView mv = new ModelAndView();
		List<EmpVO> list = service.getEmpList();
		mv.addObject("emplist", list);
		mv.setViewName("/mybatis/emplist");
		return mv;
	}
	
	
	//1. "/empdeptlist:get방식"  checkbox 형태 10,20,...,100 나열 복수개 선택 폼 보여주는 뷰 생성 메소드 - 모델없고 mybatis/empdeptform.jsp
	//2. "/empdeptlist:post방식"  1번 선택 요소 배열로 전달받아서 부서원의 이름 부서코드 급여 정보 모델 - mybatis/empdeptlist.jsp
	
	@RequestMapping(value = "/empdeptlist", method = RequestMethod.GET)
	public String empDeptForm() {
		return "/mybatis/empdeptform";
	}
	
	@RequestMapping(value = "/empdeptlist", method = RequestMethod.POST)
	public ModelAndView empDeptList(int[] dept) {
		List<EmpVO> list = service.empDeptlist(dept);
		ModelAndView mv = new ModelAndView();
		mv.addObject("empdeptlist", list);
		mv.setViewName("mybatis/empdeptlist");
		return mv;
	}
	
}
