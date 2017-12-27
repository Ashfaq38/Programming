package com.bestbuy.springboot.BestBuy.controller;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bestbuy.springboot.BestBuy.entity.Brand;
import com.bestbuy.springboot.BestBuy.entity.Product;
import com.bestbuy.springboot.BestBuy.repository.BrandRepository;
import com.bestbuy.springboot.BestBuy.service.BrandService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value ="/brand")
public class BrandController {
	
	@Autowired
	private BrandService brandService;
	
	
	//To get all entries from db
	@GetMapping(value="/getall",produces="application/json")
	@ApiOperation(value="Fetch all Brands", response = Brand.class)
	public List<Brand> getAll(){
		return brandService.findAll();
	
	}
	
	//To get single entry from db by id
	@GetMapping(value="/brandId/{id}", produces="application/json")
	public ResponseEntity<Brand> getBrandById(@PathVariable(value = "id") Integer brandId) {
	    Brand brand = brandService.findOne(brandId);
	    if(brand == null) {
	        return ResponseEntity.notFound().build();
	    }
	    return ResponseEntity.ok().body(brand);
	}
		
	
	//To post a new entry in db
	@PostMapping(value="/load",produces="application/json")
	public List<Brand> persist(@Validated @RequestBody   Brand brand){
		brandService.save(brand);
		return brandService.findAll();
	}
	
	
	// To update an existing entry in db 
	@PutMapping("/update/{id}")
	public ResponseEntity<Brand> updateBrand(@PathVariable(value = "id") Integer brandId, 
	                                       @Valid @RequestBody Brand brandDetails) {
	    Brand brand = brandService.findOne(brandId);
	    if(brand == null) {
	        return ResponseEntity.notFound().build();
	    }
	    brand.setBrand_name(brandDetails.getBrand_name());
	    brand.setBrand_desc(brandDetails.getBrand_desc());

	    Brand updatedBrand = brandService.save(brand);
	    return ResponseEntity.ok(updatedBrand);
	}
	
	
	//To delete an entry from db based on id
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Brand> deleteBrand(@PathVariable(value = "id") Integer brandId) {
	    Brand brand = brandService.findOne(brandId);
	    if(brand == null) {
	        return ResponseEntity.notFound().build();
	    }

	    brandService.delete(brand);
	    return ResponseEntity.ok().build();
	}

	
	
}
