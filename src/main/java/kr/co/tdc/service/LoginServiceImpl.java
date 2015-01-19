package kr.co.tdc.service;

import kr.co.tdc.dao.UserDao;
import kr.co.tdc.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	UserDao loginDao;

	@Override
	public User userInfo(User login) {
		return loginDao.userInfo(login);
	}

}
