package com.francescomalagrino.salesTaxes.services;

import com.francescomalagrino.salesTaxes.entities.Bill;
import com.francescomalagrino.salesTaxes.entities.Product;
import com.francescomalagrino.salesTaxes.exceptions.IOStringException;

public interface IOStringService extends Service {
	
	/*
	 * Create an object product from string
	 * 
	 * @param productString	the product as string
	 * 
	 * @return				the product object
	 */
	public Product createProduct(String productString) throws IOStringException;

	/*
	 * Print a bill
	 * 
	 * @param bill	the bill object to print
	 * 
	 * @return		the bill as string
	 */
	public String printBill(Bill bill) throws IOStringException;
	
}
