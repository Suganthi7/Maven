package org.testng;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FbLoginUsingParameterXML extends BaseClass {
	@BeforeClass
	private void launch() {
      chromeBrowser();
      launchUrl("https://en-gb.facebook.com/");
      maxBrowser();
      applyWaitForAllLocators(10);

	}
	
	
	@BeforeMethod
	private void startTc() {
	
		getDate();

	}
	@Parameters({"UserName","Password"})
	@Test
	private void tc(String green1,String green2) {
		FbLoginPojo f=new FbLoginPojo();
		WebElement userTxt = f.getUserTxt();
		fillTxtBox(userTxt,green1);
		WebElement passTxt = f.getPassTxt();
		fillTxtBox(passTxt, green2);
		



	}
	
	
	@AfterMethod
	private void endTc() {
		
		getDate();

	}
	@AfterClass
	private void end() {
		closeBrowser();

	}
	

}
