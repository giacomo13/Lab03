package it.polito.tdp.spellchecker.model;

public class RichWord {
	private String word;
	private Boolean isCorretta = true;
	
	public RichWord() {
		
	}
	
	public String getWord() {
		return word;
	}


	public Boolean getIsCorretta() {
		return isCorretta;
	}


	public void setIsCorretta(Boolean isCorretta) {
		this.isCorretta = isCorretta;
	}


	public void setWord(String word) {
		this.word = word;
	}
	

}
