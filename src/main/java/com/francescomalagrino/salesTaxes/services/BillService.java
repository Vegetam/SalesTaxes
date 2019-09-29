package com.francescomalagrino.salesTaxes.services;

import java.util.List;

import com.francescomalagrino.salesTaxes.entities.Bill;
import com.francescomalagrino.salesTaxes.entities.Product;
import com.francescomalagrino.salesTaxes.exceptions.IOStringException;

public interface BillService extends Service {
	
	/*
	 * Create an object bill from a list of products as string form
	 * 
	 * @param input	the list of products as string
	 * 
	 * @return		the bill as string
	 */
	public String createBillFromInput(String input) throws IOStringException;
	
	/*
	 * Create an object bill from a list of products
	 * 
	 * @param products	the list of products 
	 * 
	 * @return			the bill object
	 */
	public Bill createBill(List<Product> products) throws IOStringException;
	
}
