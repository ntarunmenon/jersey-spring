package org.codingpedia.demo.rest;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Name {

	public Name() {
	}
	
	@Id
	private Long id;
	
	private String firstName;
	
	private String lastName;

	public Name(String string, String string2) {
		this.firstName = string;
		this.lastName = string2;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
