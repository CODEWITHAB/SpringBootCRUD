package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Student 
{
	@Id
	private int id;
	
	private String uname;
	
	private String pass;
	
	private String name;
	
	private String mobno;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobno() {
		return mobno;
	}

	public void setMobno(String mobno) {
		this.mobno = mobno;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", uname=" + uname + ", pass=" + pass + ", name=" + name + ", mobno=" + mobno
				+ "]";
	}
	

}
