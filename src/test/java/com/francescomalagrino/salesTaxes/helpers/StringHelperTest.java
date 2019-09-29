package com.francescomalagrino.salesTaxes.helpers;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.francescomalagrino.salesTaxes.helpers.StringHelper;

@SuppressWarnings("serial")
public class StringHelperTest {

	@Test
	public void isIntersectionNotEmpty1() {
		
		List<String> list1 = new ArrayList<String>() {{
			add("A");
			add("B");
		}};
		
		List<String> list2 = new ArrayList<String>() {{
			add("A");
			add("C");
		}};
		
		boolean notEmpty = StringHelper.isIntersectionNotEmpty(list1, list2);
		assertEquals(notEmpty, true);
	}
	
	@Test
	public void isIntersectionNotEmpty2() {
		
		List<String> list1 = new ArrayList<String>() {{
			add("A");
			add("B");
		}};
		
		List<String> list2 = new ArrayList<String>() {{
			add("A");
		}};
		
		boolean notEmpty = StringHelper.isIntersectionNotEmpty(list1, list2);
		assertEquals(notEmpty, true);
	}
	
	@Test
	public void isIntersectionNotEmpty3() {
		
		List<String> list1 = new ArrayList<String>() {{
			add("A");
			add("B");
		}};
		
		List<String> list2 = new ArrayList<String>() {{}};
		
		boolean notEmpty = StringHelper.isIntersectionNotEmpty(list1, list2);
		assertEquals(notEmpty, false);
	}
	
	@Test
	public void isIntersectionNotEmpty4() {
		
		List<String> list1 = new ArrayList<String>() {{
			add("A");
		}};
		
		List<String> list2 = new ArrayList<String>() {{
			add("A");
			add("B");
		}};
		
		boolean notEmpty = StringHelper.isIntersectionNotEmpty(list1, list2);
		assertEquals(notEmpty, true);
	}
	
	@Test
	public void isIntersectionNotEmpty5() {
		
		List<String> list1 = new ArrayList<String>() {{
			add("A");
		}};
		
		List<String> list2 = new ArrayList<String>() {{
			add("B");
		}};
		
		boolean notEmpty = StringHelper.isIntersectionNotEmpty(list1, list2);
		assertEquals(notEmpty, false);
	}
}
