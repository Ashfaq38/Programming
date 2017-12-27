package com.bestbuy.springboot.BestBuy.controller;

import java.math.BigDecimal;
import java.util.Date;
import java.util.logging.Logger;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bestbuy.springboot.BestBuy.entity.Product;
import com.bestbuy.springboot.BestBuy.entity.Brand;

import com.bestbuy.springboot.BestBuy.repository.ProductRepository;



@RestController
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping(value="/pro/{id}",produces="application/json")
	public @ResponseBody ResponseEntity<Product> fetchProductById(@PathVariable("id") Integer id){
		
		Product product = productRepository.findOne(id);
		
		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@PostMapping(value="/pro/{product_id}/{product_name}/{product_desc}/{createdate}/{brand_id}",produces="application/json")
	public @ResponseBody ResponseEntity<Product> saveOrder(@PathVariable("product_id") Integer product_id, 
															@PathVariable("product_name") String product_name, 
															@PathVariable("product_desc") String product_desc,
															@PathVariable("product_createdate") Date product_createdate){
		Product product = new Product();
		
		product.setProduct_id(product_id);
		product.setProduct_name(product_name);
		product.setProduct_desc(product_desc);
		product.setProduct_createdate(product_createdate);
		
		
		Product product2 = productRepository.save(product);
				
		return new ResponseEntity<Product>(product2, HttpStatus.OK);
	}

	@DeleteMapping(value="/prodel/{id}",produces="application/json")
	public @ResponseBody void deleteProduct(@PathVariable("id") Integer id){
		productRepository.delete(id);	 
	}
	
	/*@PutMapping(value="/proput/{id}/{name}",produces="application/json")
	public @ResponseBody void updateProduct(@PathVariable("id") Integer id, 
									@PathVariable("name") String name) {
		
		productRepository.updateName(id, name);
		
	}*/
}
