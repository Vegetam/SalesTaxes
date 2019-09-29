package com.francescomalagrino.salesTaxes.services;

import java.util.List;

import com.francescomalagrino.salesTaxes.entities.Product;
import com.francescomalagrino.salesTaxes.enumerations.CategoryEnum;

public interface TaxService extends Service {

	/*
	 * Get categories from the product 
	 * 
	 * @param product	the product where to get categories 
	 * 
	 * @return			the list of categories
	 */
	public List<CategoryEnum> getCategoriesFromProduct(Product product);
	
	/*
	 * Check if product is imported
	 * 
	 * @param product	the product where get if is imported
	 * 
	 * @return			true if it is imported, false instead
	 */
	public boolean getIsImportedFromProduct(Product product);
	
	/*
	 * Get current tax of categories from products
	 * 
	 * @param product	the product object
	 * 
	 * @return			the quantity of tax relative to categories by product
	 */
	public double calculateTaxForCategories(Product product);
	
	/*
	 * Get current tax of import from products 
	 * 
	 * @param product	the product object
	 * 
	 * @return			the quantity of tax relative to import by product
	 */
	public double calculateTaxForImported(Product product);
}
