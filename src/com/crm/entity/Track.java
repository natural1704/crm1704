package com.crm.entity;

public class Track {
private Integer tid;
private Integer stuid;
private Integer tracks;
private String trackTime;
private Integer isTrack;
private String trackWays;
private String trackContent;
private String nextTrackTime;
public Integer getTid() {
	return tid;
}
public void setTid(Integer tid) {
	this.tid = tid;
}
public Integer getStuid() {
	return stuid;
}
public void setStuid(Integer stuid) {
	this.stuid = stuid;
}
public Integer getTracks() {
	return tracks;
}
public void setTracks(Integer tracks) {
	this.tracks = tracks;
}
public String getTrackTime() {
	return trackTime;
}
public void setTrackTime(String trackTime) {
	this.trackTime = trackTime;
}
public Integer getIsTrack() {
	return isTrack;
}
public void setIsTrack(Integer isTrack) {
	this.isTrack = isTrack;
}
public String getTrackWays() {
	return trackWays;
}
public void setTrackWays(String trackWays) {
	this.trackWays = trackWays;
}
public String getTrackContent() {
	return trackContent;
}
public void setTrackContent(String trackContent) {
	this.trackContent = trackContent;
}
public String getNextTrackTime() {
	return nextTrackTime;
}
public void setNextTrackTime(String nextTrackTime) {
	this.nextTrackTime = nextTrackTime;
}
@Override
public String toString() {
	return "Track [tid=" + tid + ", stuid=" + stuid + ", tracks=" + tracks + ", trackTime=" + trackTime + ", isTrack="
			+ isTrack + ", trackWays=" + trackWays + ", trackContent=" + trackContent + ", nextTrackTime="
			+ nextTrackTime + "]";
}
}
