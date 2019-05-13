package com.crm.entity;

public class RoleModules {
private Integer rmid;
private Integer roleId;
private Integer moduleId;
public Integer getRmid() {
	return rmid;
}
public void setRmid(Integer rmid) {
	this.rmid = rmid;
}
public Integer getRoleId() {
	return roleId;
}
public void setRoleId(Integer roleId) {
	this.roleId = roleId;
}
public Integer getModuleId() {
	return moduleId;
}
public void setModuleId(Integer moduleId) {
	this.moduleId = moduleId;
}
@Override
public String toString() {
	return "RoleModules [rmid=" + rmid + ", roleId=" + roleId + ", moduleId=" + moduleId + "]";
}
}
