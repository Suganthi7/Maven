package org.testng;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class A {
	@Test(priority=-1)
	private void tc1() {
		System.out.println("tc1");
		

	}
	@Test
	private void tc2() {
		System.out.println("tc2");
		

	}
	@Test(priority=2,invocationCount=2)
	private void tc3() {
		System.out.println("tc3");
		

	}



}
