package my.spring.springedu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import service.LoginService;
import vo.ResultVO;

@Controller
public class LoginController {
	@Autowired
	LoginService login;

	@RequestMapping(value = "/login", produces = "application/json; charset=utf-8")
	@ResponseBody
	public ResultVO getLogin(String id, String passwd) {
		ResultVO rvo = new ResultVO();
		boolean result = login.getLoginResult(id, passwd);
		if (result) {
			rvo.setResult("ok");
		} else
			rvo.setResult("fail");
		System.out.println(result);
		System.out.println(id + " " + passwd);
		System.out.println(rvo.getResult());
		return rvo;
	}
}
