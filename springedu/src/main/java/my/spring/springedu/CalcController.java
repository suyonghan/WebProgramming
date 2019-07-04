package my.spring.springedu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Servlet implementation class EduServlet
 */
@Controller
public class CalcController {

	@RequestMapping("/calc")
	protected ModelAndView grade(@RequestParam(value = "num1", defaultValue = "0") int num1,
			@RequestParam(value = "num2", defaultValue = "0") int num2,
			@RequestParam(value = "op", defaultValue = "+") String op) {
		ModelAndView mav = new ModelAndView();
		if (num2 == 0 && op.equals("/"))
			mav.setViewName("errorResult");
		else
			mav.setViewName("calcResult");
		return mav;
	}

}
