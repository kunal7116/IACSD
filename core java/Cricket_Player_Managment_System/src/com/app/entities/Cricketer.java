package com.app.entities;

import java.util.Objects;

public class Cricketer {
	 private String name;
	 private int age;
	 private String emailId;
	 private String phone;
	 private int rating;
	 private Speciality sp;
	
	 
	 public Cricketer(String name, int age, String emailId, String phone, int rating ,Speciality sp) {
		super();
		this.name = name;
		this.age = age;
		this.emailId = emailId;
		this.phone = phone;
		this.rating = rating;
		this.sp=sp;
	}


	public Cricketer(String email) {
	this.emailId=email;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}
	


	public Speciality getSp() {
		return sp;
	}


	public void setSp(Speciality sp) {
		this.sp = sp;
	}


	

	@Override
	public String toString() {
		return "Cricketer [name=" + name + ", age=" + age + ", emailId=" + emailId + ", phone=" + phone + ", rating="
				+ rating + ", sp=" + sp + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(emailId);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Cricketer)) {
			return false;
		}
		Cricketer other = (Cricketer) obj;
		return Objects.equals(emailId, other.emailId);
	}
	 
	 
	 
	
	
	
}
