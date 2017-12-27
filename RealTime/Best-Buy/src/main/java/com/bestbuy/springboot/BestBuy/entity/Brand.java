package com.bestbuy.springboot.BestBuy.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="brand")
public class Brand {

	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="brand_id")
	@NotNull(message = "Id should not be null")
	private int brand_id;
	
	@Column(name="brand_name")
	private String brand_name;
	
	@Column(name="brand_desc")
	private String brand_desc;
	
	@Column(name="brand_createdate")
	private Date brand_createdate;

	
	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getBrand_id() {
		return brand_id;
	}

	public void setBrand_id(int brand_id) {
		this.brand_id = brand_id;
	}

	public String getBrand_name() {
		return brand_name;
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

	public String getBrand_desc() {
		return brand_desc;
	}

	public void setBrand_desc(String brand_desc) {
		this.brand_desc = brand_desc;
	}

	public Date getBrand_createdate() {
		return brand_createdate;
	}

	public void setBrand_createdate(Date brand_createdate) {
		this.brand_createdate = brand_createdate;
	}
	
	
}