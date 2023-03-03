package com.nirav.lms.Admin;

public class Admin {

	public String a_mail;
	public String getA_mail() {
		return a_mail;
	}
	public void setA_mail(String a_mail) {
		this.a_mail = a_mail;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(String a_mail, String a_pass) {
		super();
		this.a_mail = a_mail;
		this.a_pass = a_pass;
	}
	public String a_pass;
	public String getA_pass() {
		return a_pass;
	}
	public void setA_pass(String a_pass) {
		this.a_pass = a_pass;
	}
}
