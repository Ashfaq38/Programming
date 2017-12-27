package com.bestbuy.springboot.BestBuy.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.bestbuy.springboot.BestBuy.entity.Brand;
import com.bestbuy.springboot.BestBuy.entity.Product;
import com.bestbuy.springboot.BestBuy.repository.ProductRepository;

public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Product save(Product product) {
		return productRepository.save(product);
	}
	
	public void delete(int id) {
		 productRepository.delete(id);
	}
	
	/*public void update(int id, String name) {
		productRepository.updateName(id, name);
	}*/
}
