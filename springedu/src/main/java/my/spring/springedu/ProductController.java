package my.spring.springedu;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import vo.ProductVO;

/**
 * Servlet implementation class EduServlet
 */
@Controller
@SessionAttributes(value = "product")
public class ProductController {
	@RequestMapping("/cart")
	protected ModelAndView getProduct(@RequestParam(value = "pid") String pid, HttpSession session) {
		ModelAndView mav;
		if (session.getAttribute("product") == null)
			session.setAttribute("product", new ProductVO());

		if (pid.equals("null")) {
			session.removeAttribute("product");
			mav = new ModelAndView();
			mav.setViewName("productView");
		} else {
			System.out.println(pid);
			ProductVO vo = (ProductVO) session.getAttribute("product");
			vo.setInfo(pid, 1);
			session.setAttribute("product", vo);
			mav = new ModelAndView();
			mav.setViewName("productView");
		}
		return mav;
	}

	@RequestMapping(value = "/cart/clear", produces = "application/xml; charset=utf-8")
	@ResponseBody
	public String test(SessionStatus s) {
		s.setComplete();
		return "{\"result\" : \" ¾ø¾î¿ä\"}";
	}

}
