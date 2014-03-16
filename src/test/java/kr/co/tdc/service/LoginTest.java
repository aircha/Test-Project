package kr.co.tdc.service;

import static org.junit.Assert.assertNotNull;
import kr.co.tdc.common.AbstractTestSetting;
import kr.co.tdc.model.Login;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginTest extends AbstractTestSetting {
	
	@Autowired
	LoginService loginService;
	
	@Test
	@Ignore
	public void testLoginProc() {
		Login login = new Login();
		login.setEmail("aircha@gmail.com");
		
		login = loginService.loginProc(login);
		assertNotNull("testLoginProc login user return", login.getUserName());
	}
}
