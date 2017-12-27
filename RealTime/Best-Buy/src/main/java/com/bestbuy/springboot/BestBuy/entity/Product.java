package com.bestbuy.springboot.BestBuy.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@Column(name="product_id")
	private int product_id;
	@Column(name="product_name")
	private String product_name;
	@Column(name="product_desc")
	private String product_desc;
	@Column(name="product_createdate")
	private Date product_createdate;
	
	
		public Product() {
		// TODO Auto-generated constructor stub
	}

		public int getProduct_id() {
			return product_id;
		}

		public void setProduct_id(int product_id) {
			this.product_id = product_id;
		}

		public String getProduct_name() {
			return product_name;
		}

		public void setProduct_name(String product_name) {
			this.product_name = product_name;
		}

		public String getProduct_desc() {
			return product_desc;
		}

		public void setProduct_desc(String product_desc) {
			this.product_desc = product_desc;
		}

		public Date getProduct_createdate() {
			return product_createdate;
		}

		public void setProduct_createdate(Date product_createdate) {
			this.product_createdate = product_createdate;
		}

		
}

