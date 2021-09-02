package org.junitassert;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;



public class RedBusAssert extends BaseClass{
	RedBusPojo r=new RedBusPojo();
	Robot r1;
	
	@BeforeClass
	public static void start() {
		chromeBrowser();
		launchUrl("https://www.redbus.in/");
		maxBrowser();
		

	}
	
	@Test
	public void tc1() throws IOException, AWTException, InterruptedException {
		r=new RedBusPojo();
		
		
		WebElement fromTxt = r.getFromTxt();
		fillTxtBox(fromTxt, readFromExcel(6, 0));
		enter();
		String from = fromTxt.getAttribute("value");
		Assert.assertEquals("verifying From", "Chennai", from);
		
		WebElement toTxt = r.getToTxt();
		fillTxtBox(toTxt, readFromExcel(6, 1));
		enter();
		String to = toTxt.getAttribute("value");
		Assert.assertEquals("Veifying To","Madurai",to);
		
		threadWait();
		
	WebElement dateRed = r.getDateRed();
	btnClick(dateRed);
	
	WebElement date15 = r.getDate15();
	btnClick(date15);
	
	WebElement btnSrch = r.getBtnSrch();
	btnClick(btnSrch);
	
	
	
		
		

	}

	

}
