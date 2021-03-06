package com.github.bobbylough.characterdemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class FictionalCharacter {
	
	@Id
    @GeneratedValue
    private Long id;
	private String name;

	public FictionalCharacter() {
		
	}
	
	public FictionalCharacter(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
