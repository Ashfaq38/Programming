package com.bestbuy.springboot.BestBuy.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.bestbuy.springboot.BestBuy.entity.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer>, CrudRepository<Brand, Integer>{

	
}




