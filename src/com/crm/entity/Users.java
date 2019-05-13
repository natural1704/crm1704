package com.crm.entity;

import org.springframework.stereotype.Component;

@Component
public class Users {
private Integer uid;
private String LoginName;
private String password;
private Integer uweight;
private Integer isLock;
private String createTime;
private String lastLoginTime;
private String email;
private Integer mtel;
private Integer isqiandao;
private String qiandaoTime;
public Integer getUid() {
	return uid;
}
public void setUid(Integer uid) {
	this.uid = uid;
}
public String getLoginName() {
	return LoginName;
}
public void setLoginName(String loginName) {
	LoginName = loginName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Integer getUweight() {
	return uweight;
}
public void setUweight(Integer uweight) {
	this.uweight = uweight;
}
public Integer getIsLock() {
	return isLock;
}
public void setIsLock(Integer isLock) {
	this.isLock = isLock;
}
public String getCreateTime() {
	return createTime;
}
public void setCreateTime(String createTime) {
	this.createTime = createTime;
}
public String getLastLoginTime() {
	return lastLoginTime;
}
public void setLastLoginTime(String lastLoginTime) {
	this.lastLoginTime = lastLoginTime;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Integer getMtel() {
	return mtel;
}
public void setMtel(Integer mtel) {
	this.mtel = mtel;
}
public Integer getIsqiandao() {
	return isqiandao;
}
public void setIsqiandao(Integer isqiandao) {
	this.isqiandao = isqiandao;
}
public String getQiandaoTime() {
	return qiandaoTime;
}
public void setQiandaoTime(String qiandaoTime) {
	this.qiandaoTime = qiandaoTime;
}
@Override
public String toString() {
	return "Users [uid=" + uid + ", LoginName=" + LoginName + ", password=" + password + ", uweight=" + uweight
			+ ", isLock=" + isLock + ", createTime=" + createTime + ", lastLoginTime=" + lastLoginTime + ", email="
			+ email + ", mtel=" + mtel + ", isqiandao=" + isqiandao + ", qiandaoTime=" + qiandaoTime + "]";
}
}
