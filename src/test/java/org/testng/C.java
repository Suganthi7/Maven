package org.testng;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class C {
	@Test(priority=-4)
	private void tc111() {
		System.out.println("tc111");
		

	}
	@Test(enabled=false)
	private void tc222() {
		System.out.println("tc222");
		

	}
	@Test(priority=8)
	private void tc333() {
		System.out.println("tc333");
		

	}

}
