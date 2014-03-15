package kr.co.tdc.service;

import kr.co.tdc.dao.LoginDao;
import kr.co.tdc.model.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	LoginDao loginDao;

	@Override
	public Login loginProc(Login login) {
		return loginDao.userInfo(login);
	}

}
