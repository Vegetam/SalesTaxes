package com.francescomalagrino.salesTaxes.helpers;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import com.francescomalagrino.salesTaxes.exceptions.IOStringException;

public class DoubleHelper {

	/*
	 * Format the value as Money x.yz
	 * 
	 * @param value	the value
	 * 
	 * @return		the formatted value
	 */
	public static String formatForMoney(double value) throws IOStringException  {

		double d = Math.round((double) value * 100.0) / 100.0;

		DecimalFormat df = (DecimalFormat) NumberFormat.getCurrencyInstance(Locale.ENGLISH);
		try {
			df.applyPattern("#,##0.00");
		} catch(NullPointerException e) {
			e.printStackTrace();
			throw new IOStringException("Incorrect money value");
		} catch(IllegalArgumentException e) {
			e.printStackTrace();
			throw new IOStringException("Incorrect money value");
		}
		return df.format(d);
	}

	/*
	 * The rounding rules for sales tax are that for a tax rate of n%, 
	 * a shelf price of p contains (np/100 rounded up to the nearest 0.05) 
	 * amount of sales tax
	 * 
	 * @param value	the tax value
	 * 
	 * @return		the rounded value
	 */
	public static double roundForTax(double value) {
		
		long valueCint = Math.round((double) value * 100.0);
		while (valueCint % 5 != 0) {
			valueCint += 1;
		}

		value = (double) valueCint / 100;

		return value;
	}
}
