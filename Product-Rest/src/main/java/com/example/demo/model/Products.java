package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Products {
		@Id
		private int pid;
		private String prod_name;
		private float price;
		
		
		public Products() {
			super();
		}

		public Products(int pid, String prod_name, float price) {
			super();
			this.pid = pid;
			this.prod_name = prod_name;
			this.price = price;
		}
		
		public int getPid() {
			return pid;
		}
		public void setPid(int pid) {
			this.pid = pid;
		}
		public String getProd_name() {
			return prod_name;
		}
		public void setProd_name(String prod_name) {
			this.prod_name = prod_name;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}

		@Override
		public String toString() {
			return "Products [pid=" + pid + ", prod_name=" + prod_name + ", price=" + price + "]";
		}
		
		
	}


