package service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public LoginService() {
		System.out.println("LogIn 객체생성");
	}
	public boolean getLoginResult(String id, String passwd) {
		return ("spring".equals(id) && "@1234".equals(passwd)) ? true : false;
	}
}
