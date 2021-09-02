package org.testng;

import java.io.IOException;



import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class FbLoginTestng extends BaseClass{
	FbLoginPojo f;
	@BeforeClass
	private void startClass() {
		chromeBrowser();
		launchUrl("https://en-gb.facebook.com/");
		maxBrowser();
}
	@BeforeMethod
	private void startMethod() {
		getDate();
}
	
	@Test
	private void tc1() throws IOException {
		 f=new FbLoginPojo();
		WebElement userTxt = f.getUserTxt();
		fillTxtBox(userTxt,readFromExcel(4, 0));
	}
	@Test
	private void tc2() throws IOException {
	 f=new FbLoginPojo();
		WebElement passTxt = f.getPassTxt();
		fillTxtBox(passTxt,readFromExcel(4, 1));
}
	@Test
	private void tc3() {
		 f=new FbLoginPojo();
		WebElement clkBtn = f.getClkBtn();
		btnClick(clkBtn);
}
	
	@AfterMethod
	private void endMethod() {
		getDate();

	}
	
	
	

}
