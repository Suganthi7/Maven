package org.rerun;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example {
	@Test
	private void tc1() {
		Assert.assertTrue(false, "Checking Tc1");
		System.out.println("tc1");

	}
	
	@Test(retryAnalyzer=Failed.class)
	private void tc3() {
		Assert.assertTrue(false);
		System.out.println("test3");
		
	}
	
	@Test(retryAnalyzer=Failed.class)
	private void tc2() {
		System.out.println("tc2");

	}

}
