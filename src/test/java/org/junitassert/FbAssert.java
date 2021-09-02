package org.junitassert;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class FbAssert extends BaseClass {
	
	@BeforeClass
	public static void start() {
		chromeBrowser();
		launchUrl("https://en-gb.facebook.com/");
		maxBrowser();
}
	@Before
	public void startTc() {
		getDate();
		

	}
	
	
	
	@Test
	public void tc1() {
		FbLoginPojo f=new FbLoginPojo();
		WebElement userTxt = f.getUserTxt();
		userTxt.sendKeys("Greens");
		String  user = userTxt.getAttribute("value");
		Assert.assertEquals("Verifiyng User Name", "Greens", user);
		
		WebElement passTxt = f.getPassTxt();
		passTxt.sendKeys("12345");
		String pass = passTxt.getAttribute("value");
		Assert.assertEquals("Verifying password ", "12345", pass);
		
		
		

	}

}
