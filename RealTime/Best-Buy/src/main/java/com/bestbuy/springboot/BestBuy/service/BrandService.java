package com.bestbuy.springboot.BestBuy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bestbuy.springboot.BestBuy.entity.Brand;
import com.bestbuy.springboot.BestBuy.repository.BrandRepository;

@Service
public class BrandService  {

	@Autowired
	private BrandRepository brandRepository;
	
	public Brand save(Brand brand) {
		return brandRepository.save(brand);
	}
	

	public List<Brand> findAll() {
		return brandRepository.findAll();
	}
	
	
	public Brand findOne(Integer brandId) {
		return brandRepository.findOne(brandId);
		
	}
	
	
	public void delete(Brand brand) {
		brandRepository.delete(brand);
	}
	
	
}
