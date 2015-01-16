package kr.co.tdc.service;

import static org.junit.Assert.assertNotNull;
import kr.co.tdc.common.AbstractTestSetting;
import kr.co.tdc.model.User;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginTest extends AbstractTestSetting {
	
	@Autowired
	LoginService loginService;
	
	@Test
	@Ignore
	public void testLoginProc() {
		User login = new User();
		login.setUser_email("aircha@gmail.com");
		
		login = loginService.loginProc(login);
		assertNotNull("testLoginProc login user return", login.getUser_name());
	}
}
