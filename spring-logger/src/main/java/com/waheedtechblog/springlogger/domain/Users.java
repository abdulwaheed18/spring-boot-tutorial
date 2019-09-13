package com.waheedtechblog.springlogger.domain;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

public class Users {

	private String id;

	@NotNull
	private String fisrtName;
	
	private String lastName;
	private String email;

	@Past
	private LocalDate dob;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFisrtName() {
		return fisrtName;
	}

	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", fisrtName=" + fisrtName + ", lastName=" + lastName + ", email=" + email + ", dob="
				+ dob + "]";
	}
}
