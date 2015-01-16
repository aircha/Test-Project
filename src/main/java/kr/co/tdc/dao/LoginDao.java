package kr.co.tdc.dao;

import kr.co.tdc.model.User;

import org.springframework.stereotype.Repository;

@Repository
public interface LoginDao {
	User userInfo(User login);
}
