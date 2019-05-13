package com.crm.service;

import java.util.List;

import com.crm.entity.Users;

public interface LoginService {
	List<Users> selectUsers(Users users);
}
