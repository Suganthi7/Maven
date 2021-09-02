package org.testngTask;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.BaseClass;
import org.testng.FbLoginPojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Question1 extends BaseClass{
	SoftAssert s;
	
	@BeforeClass
	private void start() {
		chromeBrowser();
		launchUrl("https://en-gb.facebook.com/ ");
		maxBrowser();
		applyWaitForAllLocators(10);

	}
	
	@BeforeMethod
	private void startTc() {
		getDate();

	}
	
	private void endTc() {
		getDate();

	}
	
	@Test
	private void tc1() {
		s=new SoftAssert();
		String pageTitle = pageTitle();
		s.assertTrue(pageTitle.contains("Face"), "Verify the Title");
		String pageUrl = pageUrl();
		s.assertTrue(pageUrl.startsWith("https"), "Verify Url");
		s.assertAll();
		

	}
	
	@Test
	private void tc2() throws IOException {
		s=new SoftAssert();
		FbLoginPojo f=new FbLoginPojo();
		WebElement userTxt = f.getUserTxt();
		fillTxtBox(userTxt, readFromExcel(0, 0));
		s.assertEquals(userTxt.getAttribute("value"), "UserName", "check Email Address");
		WebElement passTxt = f.getPassTxt();
		fillTxtBox(passTxt, readFromExcel(0, 1));
		s.assertEquals(passTxt.getAttribute("value"), "Password", "Chaeck Password");
		s.assertAll();
		
		

	}
	
	@AfterClass
	private void end() {
		
		closeBrowser();

	}
	

}
