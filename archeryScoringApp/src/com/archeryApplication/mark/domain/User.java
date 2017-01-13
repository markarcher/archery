package com.archeryApplication.mark.domain;




public class User {
	private String userName;
	private String password;
	private String role;
	private int userId;

	
	public User() {
				
	}

	public User(String userName, String password, String role) {
		
		this.userName = userName;
		this.password = password;
		this.role = role;
	
	}

	
	public int getId() {
		return userId;
	}

	public void setId(int id) {
		this.userId = id;
	}
    
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setRole(String role){
		this.role= role;
	}
	
	public String getRole(){
		return role;
	}

}
