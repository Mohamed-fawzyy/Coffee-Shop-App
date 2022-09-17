package com.coffee.shop.api.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coffee.shop.api.entity.Product;
import com.coffee.shop.api.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository productRepo;

	public List<Product> getAllItems() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}
	
	public String deleteProduct(int ID) {
		productRepo.deleteById((long) ID);
		return "Deleted" ;
	}
	

	public Product addProduct(Product toAdd) {
		return productRepo.save(toAdd);
	}
	
	public String incProduct(int ID) {
		Product p= productRepo.findById((long)ID).get();
		p.setBoughtItemsCount(p.getBoughtItemsCount()+1);
		productRepo.save(p);
		return "Increment Done";
	}
	
	public String decProduct(int ID) {
		Product p= productRepo.findById((long)ID).get();
		p.setBoughtItemsCount(p.getBoughtItemsCount()-1);
		productRepo.save(p);
		return "Decrement Done";
		
	}
	
	public String sugar(int ID, int quantity) {
		Product p= productRepo.findById((long)ID).get();
		p.setSugar((long)quantity);
		productRepo.save(p);
		return "Sugar Done";
		
	}

	public String addition(int ID, int quantity) {
		Product p= productRepo.findById((long)ID).get();
		p.setAdditions((long)quantity);
		productRepo.save(p);
		return "Addition Done";
	}
	
}
