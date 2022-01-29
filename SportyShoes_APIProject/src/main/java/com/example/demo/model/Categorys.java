package com.example.demo.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ecategorys")
public class Categorys {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private int category_Id;

	@Column(name = "name")
	private String name;

	@OneToMany(mappedBy = "category", fetch = FetchType.EAGER,cascade = CascadeType.ALL, orphanRemoval = true)
	// @OneToMany(fetch = FetchType.LAZY, mappedBy = "category", cascade =
	// CascadeType.ALL)
	private Set<Product> products = new HashSet<Product>();

	
	
	public Categorys() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categorys(int category_Id, String name, Set<Product> products) {
		super();
		this.category_Id = category_Id;
		this.name = name;
		this.products = products;
	}

	public int getCategory_Id() {
		return category_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	public void setCategory_Id(int category_Id) {
		this.category_Id = category_Id;
	}

	
	  @Override public String toString() { return "Categorys [category_Id=" +
	  category_Id + ", name=" + name + ", products=" + products + "]"; }
	 
}
