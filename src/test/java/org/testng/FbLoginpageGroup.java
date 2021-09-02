package org.testng;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

public class FbLoginpageGroup extends BaseClass{
	FbLoginPojo f;
	
	@Test(groups= {"smoke","sanity"})
	private void tc1() throws IOException {
		
		 chromeBrowser();
			launchUrl("https://en-gb.facebook.com/");
			maxBrowser();
			applyWaitForAllLocators(10);
		f=new FbLoginPojo();
		WebElement userTxt = f.getUserTxt();
		fillTxtBox(userTxt, readFromExcel(0, 0));
	}
	@Test(groups= {"smoke"})
	private void tc2() throws IOException {
		f=new FbLoginPojo();
		WebElement passTxt = f.getPassTxt();
		fillTxtBox(passTxt, readFromExcel(0, 1));

	}
	
	@Test(groups= {"smoke"})
	private void tc3() {
		f=new FbLoginPojo();
		WebElement clkBtn = f.getClkBtn();
		btnClick(clkBtn);

	}
	
	
	

}
