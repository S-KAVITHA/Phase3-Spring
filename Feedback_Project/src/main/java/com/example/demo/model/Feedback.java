package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.transaction.annotation.EnableTransactionManagement;  

//@author Kavitha S

@Entity
@Table(name= "Feedback") 
@EnableTransactionManagement
public class Feedback { 

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id", updatable = false, nullable = false)
	private int Id;
	
	@Column(name = "Comments", length = 75)
	private String Comments;

	public Feedback(int id, String comments) {
		super();
		Id = id;
		Comments = comments;
	}

	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getComments() {
		return Comments;
	}

	public void setComments(String comments) {
		Comments = comments;
	}	
	@Override
	public String toString() {
		return "Feedback [Id=" + Id + ", Comments=" + Comments + "]";
	}

	
}
