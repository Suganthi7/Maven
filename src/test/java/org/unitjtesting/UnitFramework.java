package org.unitjtesting;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utility.BaseClass;

public class UnitFramework extends BaseClass {
	
	public static WebDriver driver;
	@BeforeClass
	public static void start() {
		chromeBrowser();
		launchUrl("https://en-gb.facebook.com/");
		maxBrowser();
		}
	@Before
	public  void starTc() {
		System.out.println("Tc started>>>>>>>>>");
		Date d=new Date();
		System.out.println(d);
		}
	@Test
    public void tc1() {
		pageTitle();
	}

	@Test
	public void tc2() {
		pageUrl();
}@Test
	public void tc3() throws IOException, InterruptedException {
		FbLoginPojo f=new FbLoginPojo();
		WebElement userTxt = f.getUserTxt();
		fillTxtBox(userTxt, readFromExcel(4, 0));
		
		WebElement passTxt = f.getPassTxt();
		fillTxtBox(passTxt, readFromExcel(4, 1));
		threadWait();
		WebElement clkBtn = f.getClkBtn();
		btnClick(clkBtn);
	}
	@After
	public void endTc() {
		System.out.println("Tc end>>>>>>>>>");
		Date d=new Date();
		System.out.println(d);
		}
	
	@AfterClass
	public static void end() {
		closeBrowser();
		}}
