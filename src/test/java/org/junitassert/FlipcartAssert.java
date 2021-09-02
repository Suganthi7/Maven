package org.junitassert;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartAssert extends BaseClass {
	FlipcartPojo f=new FlipcartPojo();
	@BeforeClass
    public static void start() {
		chromeBrowser();
		launchUrl("https://www.flipkart.com/account/login");
		maxBrowser();
	}
	@Before
	public void startTc() {
		System.out.println("Tc Started>>>>>>>>>>>>>>>>>>>>");
		getDate();
		

	}
	@Test
	public void tc1() throws IOException, InterruptedException {
		f=new FlipcartPojo();
		WebElement emailTxt = f.getEmailTxt();
		fillTxtBox(emailTxt, readFromExcel(4, 0));
		threadWait();
		String email = emailTxt.getAttribute("value");
		Assert.assertEquals("Verifying Email","Suganthi" , email);
		
		WebElement passTxt = f.getPassTxt();
		fillTxtBox(passTxt, readFromExcel(4, 1));
		threadWait();
		String  pass = passTxt.getAttribute("value");
		Assert.assertEquals("Verifying password", "Suganthi", pass);
		
}
	
	@Test
	public void tc2() {
		f=new FlipcartPojo();
		WebElement btnLogin = f.getBtnLogin();
		btnClick(btnLogin);
		

	}
	
	@After
	public void endTc() {
		System.out.println("Tc end>>>>>>>>>>>>>>>>>>>>>");
		getDate();
		

	}
	
	
	@AfterClass
	public static void end() {
		closeBrowser();
		

	}
	
	

}
