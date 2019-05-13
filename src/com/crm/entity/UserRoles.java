package com.crm.entity;

public class UserRoles {
private Integer urid;
private Integer userId;
private Integer roleId;
public Integer getUrid() {
	return urid;
}
public void setUrid(Integer urid) {
	this.urid = urid;
}
public Integer getUserId() {
	return userId;
}
public void setUserId(Integer userId) {
	this.userId = userId;
}
public Integer getRoleId() {
	return roleId;
}
public void setRoleId(Integer roleId) {
	this.roleId = roleId;
}
@Override
public String toString() {
	return "UserRoles [urid=" + urid + ", userId=" + userId + ", roleId=" + roleId + "]";
}
}
