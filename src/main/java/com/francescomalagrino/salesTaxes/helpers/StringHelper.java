package com.francescomalagrino.salesTaxes.helpers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringHelper {

	public static boolean isIntersectionNotEmpty(String[] array1, String[] array2) {
		return isIntersectionNotEmpty(Arrays.asList(array1), Arrays.asList(array2));
	}
	
	public static boolean isIntersectionNotEmpty(String[] array, List<String> list) {
		return isIntersectionNotEmpty(Arrays.asList(array), list);
	}
	public static boolean isIntersectionNotEmpty(List<String> list, String[] array) {
		return isIntersectionNotEmpty(list, Arrays.asList(array));
	}
	
	/*
	 * Check if 2 arrays have at least one equal element
	 * 
	 * @param list1	the first list
	 * @param list2	the second list
	 * 
	 * @return		true if have at least one equal element, false instead
	 */
	public static boolean isIntersectionNotEmpty(List<String> list1, List<String> list2) {
		
		for (String item1 : list1) {
			for (String item2 : list2) {
				if (item1 == null && item2 == null 
						|| item1 != null && item1.equalsIgnoreCase(item2)) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public static List<String> getListStringFromText(String productsStringText) {
		
		List<String> returnValue = new ArrayList<String>();
		
		for (String line : productsStringText.split("(\r\n|\r|\n)")) {
			
			if (line != null && !line.isEmpty()) {
				returnValue.add(line);
			}
		}
		
		return returnValue;
	}
}
