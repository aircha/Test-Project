package kr.co.tdc.controller;

import kr.co.tdc.model.User;
import kr.co.tdc.service.LoginService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
   
   private static final Logger logger = LogManager.getLogger(LoginController.class);
   
	@Autowired
	LoginService loginService;
	
	@RequestMapping("/")
	public String loginPage() {
	   logger.info("login page");
		return "login";
	}
	
	@RequestMapping(value="/loginProc", method=RequestMethod.POST)
	public ModelAndView loginProc(ModelAndView mav, User login) {
		login = loginService.loginProc(login);
		if (login.getUser_name() == null || login.getUser_name().equals("")) {
			return mav;
		}
		mav.addObject("userInfo", login);
		mav.setViewName("/sample");
		return mav;
	}
}
