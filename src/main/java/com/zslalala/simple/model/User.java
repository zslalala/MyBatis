package com.zslalala.simple.model;

import java.util.Arrays;
import java.util.Date;

public class User {
	
	//用户名ID
	private Long userID;
	//用户名
	private String userName;
	//密码
	private String keyWord;
	//邮箱
	private String email;
	//描述
	private String userInfo;
	//头像
	private Byte[] icon;
	//时间
	private Date date;
	
	public Long getUserID() {
		return userID;
	}
	public void setUserID(Long userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getKeyWord() {
		return keyWord;
	}
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
	}
	public Byte[] getIcon() {
		return icon;
	}
	public void setIcon(Byte[] icon) {
		this.icon = icon;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	//ToString
	@Override
	public String toString() {
		return "User [userID=" + userID + ", userName=" + userName + ", keyWord=" + keyWord + ", email=" + email
				+ ", userInfo=" + userInfo + ", icon=" + Arrays.toString(icon) + ", date=" + date + "]";
	}
}
