package com.francescomalagrino.salesTaxes.services;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.francescomalagrino.salesTaxes.entities.Product;
import com.francescomalagrino.salesTaxes.enumerations.CategoryEnum;
import com.francescomalagrino.salesTaxes.exceptions.WordsFileException;
import com.francescomalagrino.salesTaxes.services.TaxService;
import com.francescomalagrino.salesTaxes.services.TaxServiceImpl;

@SuppressWarnings("serial")
public class TaxServiceImplTest {
	
	private TaxService taxService;
	
	public TaxServiceImplTest() throws WordsFileException {
		taxService = new TaxServiceImpl();
	}
	
	@Test
	public void getCategoriesFromProductTest() {
		
		Product product = new Product(1, "imported pills", 10.0);
		
		List<CategoryEnum> categories = new ArrayList<CategoryEnum>() {{
			add(CategoryEnum.MEDICAL);
		}};
		
		List<CategoryEnum> categoriesProduct = taxService.getCategoriesFromProduct(product);
		
		assertEquals(categories, categoriesProduct);
	}
	
	@Test
	public void getCategoriesFromProductTest2() {
		
		Product product = new Product(1, "imported pillar", 10.0);
		
		List<CategoryEnum> categories = new ArrayList<CategoryEnum>() {{ }};
		
		List<CategoryEnum> categoriesProduct = taxService.getCategoriesFromProduct(product);
		
		assertEquals(categories, categoriesProduct);
	}
	
	@Test
	public void getIsImportedFromProductTest() {
		
		Product product = new Product(1, "imported chocolate", 10.0);
		
		boolean isImported = taxService.getIsImportedFromProduct(product);
		
		assertEquals(isImported, true);
	}
	
	@Test
	public void getIsImportedFromProductTest2() {
		
		Product product = new Product(1, " of imported chocolate", 10.0);
		
		boolean isImported = taxService.getIsImportedFromProduct(product);
		
		assertEquals(isImported, true);
	}
	
	@Test
	public void getIsImportedFromProductTest3() {
		
		Product product = new Product(1, " of importedae chocolate", 10.0);
		
		boolean isImported = taxService.getIsImportedFromProduct(product);
		
		assertEquals(isImported, false);
	}
	
	@Test
	public void calculateTaxForCategoriesTest() {
		
		Product product = new Product(1, "imported pills", 10.0);
		product.setCategories(taxService.getCategoriesFromProduct(product));
		product.setImported(taxService.getIsImportedFromProduct(product));
		
		double tax = taxService.calculateTaxForCategories(product);
		
		assertEquals(tax, 0.0, 0);
	}
	
	@Test
	public void calculateTaxForCategoriesTest1() {
		
		Product product = new Product(1, "imported tv", 10.0);
		product.setCategories(taxService.getCategoriesFromProduct(product));
		product.setImported(taxService.getIsImportedFromProduct(product));
		
		double tax = taxService.calculateTaxForCategories(product);
		
		assertEquals(tax, 1.0, 0);
	}
	
	@Test
	public void calculateTaxForImported() {
		
		Product product = new Product(1, "imported pills", 10.0);
		product.setCategories(taxService.getCategoriesFromProduct(product));
		product.setImported(taxService.getIsImportedFromProduct(product));
		
		double tax = taxService.calculateTaxForImported(product);
		
		assertEquals(tax, 0.5, 0);
	}
	
	@Test
	public void calculateTaxForImported1() {
		
		Product product = new Product(1, "tv", 10.0);
		product.setCategories(taxService.getCategoriesFromProduct(product));
		product.setImported(taxService.getIsImportedFromProduct(product));
		
		double tax = taxService.calculateTaxForImported(product);
		
		assertEquals(tax, 0.0, 0);
	}
}
