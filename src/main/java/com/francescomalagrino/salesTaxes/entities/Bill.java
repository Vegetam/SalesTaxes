package com.francescomalagrino.salesTaxes.entities;

import java.util.List;

public class Bill {

	private List<Product> products;
	
	private Double tax;
	private Double total;
	
	public Bill(List<Product> products) {
		
		this.products = products;
		this.tax = 0d;
		this.total = 0d;
		
		for (Product product : products) {
			this.tax += product.getQuantity() * product.getTax();
			this.total += product.getQuantity() * product.getPriceTaxIncluded();
		}
	}
	
	public List<Product> getProducts() {
		return this.products;
	}
	
	public Double getTax() {
		return this.tax;
	}
	
	public Double getTotal() {
		return this.total;
	}
}
