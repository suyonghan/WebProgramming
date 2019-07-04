package my.spring.springedu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import vo.MemberVO;

/**
 * Servlet implementation class EduServlet
 */
@Controller
public class MemberController {

	@RequestMapping(value = "/logins")
	protected ModelAndView logippn(@RequestParam(value = "name", defaultValue = "null") String name,
			@RequestParam(value = "id", defaultValue = "없음") String id,
			@RequestParam(value = "phone", defaultValue = "없음") String phone,
			@RequestParam(value = "password", defaultValue = "없음") String password) {
		ModelAndView mav = new ModelAndView();
		MemberVO vo = new MemberVO();
		vo.setId(id);
		vo.setName(name);
		vo.setPassword(password);
		vo.setPhone(phone);
		mav.addObject("mv", vo);
		mav.setViewName("memberView");
		return mav;
	}

}
