package com.zslalala.simple.model;

public class UserAndCharacter {
	
	//用户ID
	private Long userID;
	//角色ID
	private Long characterID;
	
	public Long getUserID() {
		return userID;
	}
	public void setUserID(Long userID) {
		this.userID = userID;
	}
	public Long getCharacterID() {
		return characterID;
	}
	public void setCharacterID(Long characterID) {
		this.characterID = characterID;
	}
	@Override
	public String toString() {
		return "UserAndCharacter [userID=" + userID + ", characterID=" + characterID + "]";
	}
}
