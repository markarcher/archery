package com.archeryApplication.mark.domain;


public class Archer {
	
	private String lname;
	private String fname;
	private String emailAddress;
	private String contactNumber;
	private int archerId;
	private String club;
	
	public Archer() {
		
	}
	

	public Archer(String lname, String fname, String emailAddress, String contactNumber, String club){
		this.lname = lname;
		this.fname = fname;
		this.emailAddress = emailAddress;
		this.contactNumber = contactNumber;
		this.club = club;
	}

	
	public int getArcherId() {
		return archerId;
	}

	public void setArcherId(int archerId) {
		this.archerId = archerId;
	}
	
	
	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	
	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}
}
