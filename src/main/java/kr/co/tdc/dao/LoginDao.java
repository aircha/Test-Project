package kr.co.tdc.dao;

import kr.co.tdc.model.Login;

import org.springframework.stereotype.Repository;

@Repository
public interface LoginDao {
	Login userInfo(Login login);
}
