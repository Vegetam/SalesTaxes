package com.francescomalagrino.salesTaxes.helpers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.francescomalagrino.salesTaxes.exceptions.IOStringException;
import com.francescomalagrino.salesTaxes.helpers.DoubleHelper;

public class DoubleHelperTest {

	@Test
	public void approssimateForTax1() {
		
		double tax1 = DoubleHelper.roundForTax(12.40d);
		assertEquals(tax1, 12.40d, 0);
	}
	
	@Test
	public void approssimateForTax2() {
		
		double tax = DoubleHelper.roundForTax(12.4001d);
		assertEquals(tax, 12.40d, 0);
	}
	
	@Test
	public void approssimateForTax3() {
		
		double tax = DoubleHelper.roundForTax(12.3999d);
		assertEquals(tax, 12.40d, 0);
	}
	
	@Test
	public void approssimateForTax4() {
		
		double tax = DoubleHelper.roundForTax(12.359d);
		assertEquals(tax, 12.40d, 0);
	}
	
	@Test
	public void formatForMoney1() throws IOStringException {
		
		String money = DoubleHelper.formatForMoney(12.50);
		assertEquals(money, "12.50");
	}
	
	@Test
	public void formatForMoney2() throws IOStringException {
		
		String money = DoubleHelper.formatForMoney(12.5000001);
		assertEquals(money, "12.50");
	}
	
	@Test
	public void formatForMoney3() throws IOStringException {
		
		String money = DoubleHelper.formatForMoney(12.5499999);
		assertEquals(money, "12.55");
	}
	
	@Test
	public void formatForMoney4() throws IOStringException {
		
		String money = DoubleHelper.formatForMoney(12d);
		assertEquals(money, "12.00");
	}
}
