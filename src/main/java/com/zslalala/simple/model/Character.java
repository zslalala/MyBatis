package com.zslalala.simple.model;

import java.util.Date;

public class Character {

	//角色ID
	private Long characterID;
	//角色名
	private String characterName;
	//有效
	private Integer vaild;
	//创建者
	private String createror;
	//时间
	private Date date;
	
	public Long getCharacterID() {
		return characterID;
	}
	public void setCharacterID(Long characterID) {
		this.characterID = characterID;
	}
	public String getCharacterName() {
		return characterName;
	}
	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}
	public Integer getVaild() {
		return vaild;
	}
	public void setVaild(Integer vaild) {
		this.vaild = vaild;
	}
	public String getCreateror() {
		return createror;
	}
	public void setCreateror(String createror) {
		this.createror = createror;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Character [characterID=" + characterID + ", characterName=" + characterName + ", vaild=" + vaild
				+ ", createror=" + createror + ", date=" + date + "]";
	}
}
