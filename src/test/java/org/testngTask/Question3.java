package org.testngTask;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.BaseClass;
import org.testng.FlipcartPojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Question3 extends BaseClass{
	SoftAssert s;
	
	@BeforeClass
	private void start() {
		chromeBrowser();
		launchUrl(" https://www.flipkart.com/account/login");
		maxBrowser();
		applyWaitForAllLocators(10);

	}
	
	@BeforeMethod
	private void startTc() {
		getDate();

	}
	
	@AfterMethod
	private void endTc() {
		getDate();

	}
	
	@Test
	private void tc1() throws IOException {
		s=new SoftAssert();
		
		FlipcartPojo f=new FlipcartPojo();
		WebElement emailTxt = f.getEmailTxt();
		fillTxtBox(emailTxt, readFromExcel(4, 0));
		s.assertEquals(emailTxt.getAttribute("value"), "Suganthi", "checking email");
		WebElement passTxt = f.getPassTxt();
		fillTxtBox(passTxt, readFromExcel(4, 1));
		s.assertEquals(passTxt.getAttribute("value"), "Suganthi", "checking Password");
		
		WebElement btnLogin = f.getBtnLogin();
		btnClick(btnLogin);
		s.assertAll();
		
	
		
		
		

	}
	
	@AfterClass
	private void end() {
		closeBrowser();

	}

}
