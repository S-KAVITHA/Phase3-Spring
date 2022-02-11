package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;  


@Entity
@Table(name= "admin")   
public class Admin { 


	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private long ID;
	
	@Column(name = "adminId")
	private String adminId;
	
	@Column(name = "adminpwd")
	private String adminpwd;

	@Override
	public String toString() {
		return "Admin [ID=" + ID + ", adminId=" + adminId + ", adminpwd=" + adminpwd + "]";
	}

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getAdminpwd() {
		return adminpwd;
	}

	public void setAdminpwd(String adminpwd) {
		this.adminpwd = adminpwd;
	}

	public Admin(long iD, String adminId, String adminpwd) {
		super();
		ID = iD;
		this.adminId = adminId;
		this.adminpwd = adminpwd;
	}

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
