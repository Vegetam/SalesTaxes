package com.francescomalagrino.salesTaxes.entities;

import java.util.ArrayList;
import java.util.List;

import com.francescomalagrino.salesTaxes.enumerations.CategoryEnum;

public class Product {

	private Integer quantity;
	private String name;
	private Double price;
	
	private Double tax;
	
	private List<CategoryEnum> categories;
	
	private boolean isImported;
	
	public Product(Integer quantity, String name, Double price) {
		
		this.quantity = quantity;
		this.name = name;
		this.price = price;
		
		this.tax = 0d;
		
		this.categories = new ArrayList<CategoryEnum>();
		this.isImported = false;
	}

	public Integer getQuantity() {
		return this.quantity;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Double getPrice() {
		return this.price;
	}

	public List<CategoryEnum> getCategories() {
		return this.categories;
	}
	
	public void setCategories(List<CategoryEnum> categories) {
		this.categories = categories;
	}

	public boolean isImported() {
		return isImported;
	}

	public void setImported(boolean isImported) {
		this.isImported = isImported;
	}
	
	public Double getTax() {
		return tax;
	}
	
	public void addTax(Double tax) {
		this.tax += tax;
	}
	
	public Double getPriceTaxIncluded() {
		return this.price + this.tax;
	}
}
