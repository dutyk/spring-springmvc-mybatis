package com.yuankang.model;

public class User {
	private long id;
	private String username;
	private String password;
	
	public User(long id, String username, String password)
	{
		this.id = id;
		this.username = username;
		this.password = password;
	}
	
	public long getId(){
		return this.id;
	}
	public void setId(long id){
		this.id= id;
	}
	
	public String getUsername(){
		return this.username;
	}
	public void setUsername(String username){
		this.username = username;
	}
	
	public String getPassword(){
		return this.password;
	}
	public void setPassword(String password){
		this.password = password;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("[%ld,%s,%s]", this.id, this.username,this.password);
	}

}
