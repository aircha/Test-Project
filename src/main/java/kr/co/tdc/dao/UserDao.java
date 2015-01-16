package kr.co.tdc.dao;

import kr.co.tdc.model.User;

import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
	User userInfo(User login);
}
