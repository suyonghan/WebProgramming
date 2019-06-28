package my.spring.springedu;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Servlet implementation class EduServlet
 */
@Controller
public class EduController {

	@RequestMapping("/eduForm")
	protected ModelAndView grade(@RequestParam(value = "name", defaultValue = "이름이 없습니다.") String name,
			@RequestParam(value = "score", defaultValue = "0") int score) {
		System.out.println("hi");
		ModelAndView mav = new ModelAndView();
		switch (score / 10) {
		case 10:
		case 9:
			mav.setViewName("gradeA");
			break;
		case 8:
			mav.setViewName("gradeB");
			break;
		case 7:
			mav.setViewName("gradeC");
			break;
		default:
			mav.setViewName("gradeD");
			break;
		}
		return mav;
	}

}
