package com.coffee.shop.api.repository;

import java.util.List;
import java.util.Optional;

import com.coffee.shop.api.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

	Product findByName(String name);

	Optional<Product> findById(Long ID);

	List<Product> save(List<Product> toAdd);


}
