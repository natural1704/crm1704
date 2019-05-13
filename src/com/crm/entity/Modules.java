package com.crm.entity;

public class Modules {
private Integer mid;
private String mname;
private Integer mparentId;
private String mpath;
private Integer mweight;
public Integer getMid() {
	return mid;
}
public void setMid(Integer mid) {
	this.mid = mid;
}
public String getMname() {
	return mname;
}
public void setMname(String mname) {
	this.mname = mname;
}
public Integer getMparentId() {
	return mparentId;
}
public void setMparentId(Integer mparentId) {
	this.mparentId = mparentId;
}
public String getMpath() {
	return mpath;
}
public void setMpath(String mpath) {
	this.mpath = mpath;
}
public Integer getMweight() {
	return mweight;
}
public void setMweight(Integer mweight) {
	this.mweight = mweight;
}
@Override
public String toString() {
	return "Modules [mid=" + mid + ", mname=" + mname + ", mparentId=" + mparentId + ", mpath=" + mpath + ", mweight="
			+ mweight + "]";
}
}
