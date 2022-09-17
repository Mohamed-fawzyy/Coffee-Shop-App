package com.coffee.shop.api.controller;

import java.util.*;

import com.coffee.shop.api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.coffee.shop.api.entity.Product;

@RestController
@RequestMapping(path = "/api/v1/product")
public class ProductController {
	ProductService productService;

	@Autowired
	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@GetMapping()
	public List<Product> getAllProducts(){
		return productService.getAllItems();
	}
	
	@DeleteMapping(value = "/{ID}")
	public String deleteProduct(@PathVariable int ID) {
		return productService.deleteProduct(ID);
	}
	
	@PostMapping()
	public Product addProduct(@RequestBody Product toAdd) {
		return productService.addProduct(toAdd);
	}
	
	@PutMapping(value = "/inc/{ID}")
	public String increment(@PathVariable int ID) {
		return productService.incProduct(ID);
	}
	
	@PutMapping(value = "/dec/{ID}")
	public String decrement(@PathVariable int ID) {
		return productService.decProduct(ID);
	}
	
	@PutMapping(value = "/sugar/{ID}/{quantity}")
	public String sugar(@PathVariable int ID,@PathVariable int quantity) {
		return productService.sugar(ID,quantity);
	}
	
	@PutMapping(value = "/addition/{ID}/{quantity}")
	public String addition(@PathVariable int ID,@PathVariable int quantity) {
		return productService.addition(ID,quantity);
	}
}


