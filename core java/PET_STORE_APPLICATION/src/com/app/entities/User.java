package com.app.entities;

public class User {
	
	//Data Members
	private String email;
	private String password;
	private UserType userType;
	private boolean admin;
	
	//Constructor
	public User(String email, String password, UserType userType) {
		super();
		this.email = email;
		this.password = password;
		this.userType = userType;
		this.admin=false;
	}

	public User(String email2, String pass) {
		this.email=email2;
		this.password=pass;
	}

	//Getter & Setter
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public UserType getUserType() {
		return userType;
	}


	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	
	
	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", userType=" + userType + ", admin=" + admin + "]";
	}

	
	
}
