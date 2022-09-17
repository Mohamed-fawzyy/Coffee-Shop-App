package com.coffee.shop.api.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="products")

public class Product {
	@Id
	@GeneratedValue
	private Long ID;
	private String name;
	private Long price;
	private String image; 
	private Long size;
	private Long sugar;
	private Long additions;

	private Long isAddedToCart;
	private Long boughtItemsCount;
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Long getSize() {
		return size;
	}
	public void setSize(Long size) {
		this.size = size;
	}
	public Long getSugar() {
		return sugar;
	}
	public void setSugar(Long sugar) {
		this.sugar = sugar;
	}
	public Long getAdditions() {
		return additions;
	}
	public void setAdditions(Long additions) {
		this.additions = additions;
	}
	public Long getIsAddedToCart() {
		return isAddedToCart;
	}
	public void setIsAddedToCart(Long isAddedToCart) {
		this.isAddedToCart = isAddedToCart;
	}
	public Long getBoughtItemsCount() {
		return boughtItemsCount;
	}
	public void setBoughtItemsCount(Long boughtItemsCount) {
		this.boughtItemsCount = boughtItemsCount;
	}
	
	
	
}
