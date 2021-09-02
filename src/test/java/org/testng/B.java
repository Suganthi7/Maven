package org.testng;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class B {
	@Test(priority=-7,invocationCount=3)
	private void tc11() {
		System.out.println("tc11");
		

	}
	@Test(enabled=false)
	private void tc22() {
		System.out.println("tc22");
		

	}
	@Test(priority=-7)
	private void tc33() {
		System.out.println("tc33");
		

	}


}
