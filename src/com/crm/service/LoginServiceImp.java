package com.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.crm.dao.LoginMapper;
import com.crm.entity.Users;

public class LoginServiceImp implements LoginService{
	@Autowired
    private LoginMapper loginMapper;
	@Override
	public List<Users> selectUsers(Users users) {
		// TODO Auto-generated method stub
		return loginMapper.selectUsers(users);
	}

}
