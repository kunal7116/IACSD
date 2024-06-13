package com.app.contact;

import java.time.LocalDate;
import java.util.Objects;

public class Contact {
	private String phNum;
	private String name;
	private LocalDate dob;
	private String email;
	
public Contact(String phNum,String name,LocalDate dob,String email) {
	super();
	this.phNum=phNum;
	this.name=name;
	this.dob=dob;
	this.email=email;
}

public Contact(String name,LocalDate dob) {
	this.name=name;
	this.dob=dob;
}
//
//public String getEmail() {
//	return email;
//}

public String getName() {
	return name;
}

public LocalDate getDob() {
	return dob;
}

public String toString() {
	return "Phone Number-"+this.phNum+" Name-"+this.name+" Date Of Birth-"+this.dob+" Email-"+this.email;
}


//override equals method for name and dob
public boolean equals(Object o)	
{
	if (o instanceof Contact) {
		Contact c = (Contact) o;
		return this.name.equals(c.name) && this.dob.equals(c.dob);	
	}
	return false;
}

//override hasecode for name and dob
public int hashCode() {
	System.out.println("in hashcode");
	return Objects.hash(name,dob);
}

}
