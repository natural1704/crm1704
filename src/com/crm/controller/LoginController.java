package com.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.crm.entity.Users;
import com.crm.service.LoginService;

public class LoginController {
	@Autowired
	private LoginService loginService;
	public List<Users> selectUsers(Users users) {
		// TODO Auto-generated method stub
		return loginService.selectUsers(users);
	}
}
