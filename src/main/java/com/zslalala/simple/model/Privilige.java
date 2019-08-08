package com.zslalala.simple.model;

public class Privilige {

	//权限ID
	private Long priviligeID;
	//权限名
	private String priviligeName;
	//权限URL
	private String priviligeURL;
	
	@Override
	public String toString() {
		return "Privilige [priviligeID=" + priviligeID + ", priviligeName=" + priviligeName + ", priviligeURL="
				+ priviligeURL + "]";
	}
	public Long getPriviligeID() {
		return priviligeID;
	}
	public void setPriviligeID(Long priviligeID) {
		this.priviligeID = priviligeID;
	}
	public String getPriviligeName() {
		return priviligeName;
	}
	public void setPriviligeName(String priviligeName) {
		this.priviligeName = priviligeName;
	}
	public String getPriviligeURL() {
		return priviligeURL;
	}
	public void setPriviligeURL(String priviligeURL) {
		this.priviligeURL = priviligeURL;
	}
}
