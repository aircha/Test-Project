package kr.co.tdc.controller;

import kr.co.tdc.model.Login;
import kr.co.tdc.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@Autowired
	LoginService loginService;
	
	@RequestMapping("/")
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping(value="/loginProc", method=RequestMethod.POST)
	public ModelAndView loginProc(ModelAndView mav, Login login) {
		login = loginService.loginProc(login);
		if (login.getUserName() == null || login.getUserName().equals("")) {
			return mav;
		}
		mav.addObject("userInfo", login);
		mav.setViewName("/sample");
		return mav;
	}
}
