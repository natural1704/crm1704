package com.crm.dao;

import java.util.List;

import com.crm.entity.Users;

public interface LoginMapper {
	List<Users> selectUsers(Users users);
}
