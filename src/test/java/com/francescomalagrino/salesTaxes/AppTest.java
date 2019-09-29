package com.francescomalagrino.salesTaxes;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.francescomalagrino.salesTaxes.helpers.DoubleHelperTest;
import com.francescomalagrino.salesTaxes.helpers.StringHelperTest;
import com.francescomalagrino.salesTaxes.services.BillServiceImplTest;
import com.francescomalagrino.salesTaxes.services.TaxServiceImplTest;

import junit.framework.TestCase;

@RunWith(Suite.class)
@Suite.SuiteClasses({ 
	DoubleHelperTest.class, 
	StringHelperTest.class, 
	BillServiceImplTest.class, 
	TaxServiceImplTest.class})

public class AppTest extends TestCase {
	
}
