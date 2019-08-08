package com.zslalala.simple.model;

public class CharacterAndPrivilige {
	
	private Long characterID;
	
	private Long priviligeID;

	@Override
	public String toString() {
		return "CharacterAndPrivilige [characterID=" + characterID + ", priviligeID=" + priviligeID + "]";
	}

	public Long getCharacterID() {
		return characterID;
	}

	public void setCharacterID(Long characterID) {
		this.characterID = characterID;
	}

	public Long getPriviligeID() {
		return priviligeID;
	}

	public void setPriviligeID(Long priviligeID) {
		this.priviligeID = priviligeID;
	}

}
