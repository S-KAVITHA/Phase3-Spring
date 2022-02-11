package com.example.demo.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;  


@Entity
@Table(name= "shoe_users")   
public class User { 


	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int ID;
	
	@Column(name = "emailId")
	private String emailId;
	
	@Column(name = "password")
	private String password;
	
	
	@Column(name = "fname")
	private String fname;
	
	@Column(name = "lname")
	private String lname;
	
	@Column(name = "address")
	private String address;

	@Column(name = "city")
	private String city;


	@Column(name = "zipcode")
	private long zipcode;

	@Column(name = "state")
	private String state;

	
	@Column(name = "country")
	private String country;

	@Column(name = "age")
	private int age;

	@Column(name = "contactNo")
	private long contactNo;

	
	@Enumerated(EnumType.STRING)
	private IdentityType identitytype;
	
	private long IdentityNo;

	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getID() {
		return ID;
	}



	public void setID(int iD) {
		ID = iD;
	}


	public String getEmailId() {
		return emailId;
	}



	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getFname() {
		return fname;
	}



	public void setFname(String fname) {
		this.fname = fname;
	}



	public String getLname() {
		return lname;
	}



	public void setLname(String lname) {
		this.lname = lname;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public long getZipcode() {
		return zipcode;
	}



	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public long getContactNo() {
		return contactNo;
	}



	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}



	public IdentityType getIdentitytype() {
		return identitytype;
	}



	public void setIdentitytype(IdentityType identitytype) {
		this.identitytype = identitytype;
	}



	public long getIdentityNo() {
		return IdentityNo;
	}



	public void setIdentityNo(long identityNo) {
		IdentityNo = identityNo;
	}



	public User(int iD,  String emailId, String password, String fname, String lname, String address,
			String city, long zipcode, String state, String country, int age, long contactNo, IdentityType identitytype,
			long identityNo) {
		super();
		ID = iD;
		
		this.emailId = emailId;
		this.password = password;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.city = city;
		this.zipcode = zipcode;
		this.state = state;
		this.country = country;
		this.age = age;
		this.contactNo = contactNo;
		this.identitytype = identitytype;
		IdentityNo = identityNo;
	}



	@Override
	public String toString() {
		return "User [ID=" + ID +  ", emailId=" + emailId + ", password=" + password
				+ ", fname=" + fname + ", lname=" + lname + ", address=" + address + ", city=" + city + ", zipcode="
				+ zipcode + ", state=" + state + ", country=" + country + ", age=" + age + ", contactNo=" + contactNo
				+ ", identitytype=" + identitytype + ", IdentityNo=" + IdentityNo + "]";
	}

	
	
		

}
