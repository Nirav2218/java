package com.nirav.lms.User;

public class User {
	public String u_mail;
	public User(String u_mail, String u_name, String u_password) {
		super();
		this.u_mail = u_mail;
		this.u_name = u_name;
		this.u_password = u_password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String u_name;
	public String u_password;
	public String getU_mail() {
		return u_mail;
	}
	public void setU_mail(String u_mail) {
		this.u_mail = u_mail;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public String getU_password() {
		return u_password;
	}
	public void setU_password(String u_password) {
		this.u_password = u_password;
	}

}
