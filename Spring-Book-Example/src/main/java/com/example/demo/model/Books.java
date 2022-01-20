package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModelProperty;

@Entity
//@Table(name = "tbl_books")
//@EnableTransactionManagement


public class Books {

	@ApiModelProperty(notes = "ID of the Book",name="Id",required=true,value="test Id")
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	//@Column(name = "book_id", columnDefinition = "BINARY(20)")
	private int book_id;

	@ApiModelProperty(notes = "description of the Book",name="description",required=true,value="test description")
		//@Column(name = "description")
	private String description;

@ApiModelProperty(notes = "published year of the Book",name="published year",required=true,value="test published year")
		//@Column(name = "published")
	private int published;

@ApiModelProperty(notes = "title of the Book",name="title",required=true,value="test title")
	//@Column(name = "title")
	private String title;

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPublished() {
		return published;
	}

	public void setPublished(int published) {
		this.published = published;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
