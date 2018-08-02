package com.deloitte.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class TextEditor {
	private SpellChecker spellChecker;
	private String name;
	
	public void getName() {
		System.out.println("name: "+name);
	}

	@Required
	public void setName(String name) {
		this.name = name;
	}

	public TextEditor() {
		System.out.println("TxtEdit default const.");
	}
	
	public TextEditor(SpellChecker spellChecker) {
		System.out.println("TextEditor const.");
		this.spellChecker= spellChecker;
	}
	
	public void spellCheck() {
		spellChecker.checkSpelling();
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	@Autowired
	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("setSpellChecker");
		this.spellChecker = spellChecker;
	}

}
