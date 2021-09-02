package org.testngTask;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.BaseClass;
import org.testng.RedBusPojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Question2 extends BaseClass{
	SoftAssert s;
	@BeforeClass
	private void start() {
		
		chromeBrowser();
		launchUrl(" https://www.redbus.in/");
		maxBrowser();
		applyWaitForAllLocators(10);
		
	}
	
	@BeforeMethod
	private void startTc() {
		getDate();

	}
	@Test
	private void tc1() throws IOException, AWTException, InterruptedException {
		s=new SoftAssert();
		RedBusPojo r=new RedBusPojo();
		WebElement fromTxt = r.getFromTxt();
		fillTxtBox(fromTxt, readFromExcel(6, 0));
		enter();
		s.assertEquals(fromTxt.getAttribute("value"), "Chennai", "Validating from");
		
		WebElement toTxt = r.getToTxt();
		fillTxtBox(toTxt, readFromExcel(6, 1));
		enter();
		s.assertEquals(toTxt.getAttribute("value"), "Madurai", "Validating To");
		threadWait();
		
		WebElement calendr = r.getCalendr();
	    btnClick(calendr);
		WebElement dateRed = r.getDateRed();
		btnClick(dateRed);
		
	    WebElement btnSrch = r.getBtnSrch();
		btnClick(btnSrch);
		s.assertAll();
		
}
	
	@AfterMethod
	private void endTc() {
		getDate();

	}
	@AfterClass
	private void end() throws InterruptedException {
		threadWait();
		closeBrowser();

	}

	

}
