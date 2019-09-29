package com.francescomalagrino.salesTaxes;

import com.francescomalagrino.salesTaxes.exceptions.IOStringException;
import com.francescomalagrino.salesTaxes.exceptions.WordsFileException;
import com.francescomalagrino.salesTaxes.services.BillService;
import com.francescomalagrino.salesTaxes.services.BillServiceImpl;

public class App {

	public static void main(String[] args) throws IOStringException, WordsFileException {

		BillService billService = new BillServiceImpl();

		String input1 = getProductsText1();

		String output1 = billService.createBillFromInput(input1);
		
		String input2 = getProductsText2();

		String output2 = billService.createBillFromInput(input2);
		
		String input3 = getProductsText3();

		String output3 = billService.createBillFromInput(input3);
		
		System.out.println("INPUT 1\n");
		System.out.println(input1);
		System.out.println("\nOUTPUT 1\n");
		System.out.println(output1);
		System.out.println("\nINPUT 2\n");
		System.out.println(input2);
		System.out.println("\nOUTPUT 2\n");
		System.out.println(output2);
		System.out.println("\nINPUT 3\n");
		System.out.println(input3);
		System.out.println("\nOUTPUT 3\n");
		System.out.println(output3);

	}

	private static String getProductsText1() {

		return "1 book at 12.49\n1 music CD at 14.99\n1 chocolate bar at 0.85\n";
	}

	private static String getProductsText2() {

		return "1 imported box of chocolates at 10.00\n1 imported bottle of perfume at 47.50\n";
	}

	private static String getProductsText3() {
	
		return "1 imported bottle of perfume at 27.99\n1 bottle of perfume at 18.99\n1 packet of headache pills at 9.75\n1 box of imported chocolates at 11.25";
	}
}
