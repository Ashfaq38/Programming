package com.bestbuy.springboot.BestBuy.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.bestbuy.springboot.BestBuy.entity.Product;


public interface ProductRepository extends CrudRepository<Product,Integer>{

	/*@Transactional
	@Modifying(clearAutomatically = true)
	@Query("UPDATE Product p SET p.product_name = :name WHERE p.product_id = :id")
	public void updateName(@Param("product_id") Integer id, @Param("product_name") String name);
*/
}






	
	
