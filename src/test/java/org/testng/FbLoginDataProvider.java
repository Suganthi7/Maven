package org.testng;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FbLoginDataProvider extends BaseClass {
	@BeforeClass
	private void start() {
		chromeBrowser();
		launchUrl("https://en-gb.facebook.com/");
		maxBrowser();

	}
@AfterMethod
private void startTc() {

getDate();
}
private void endTc() {
	getDate();

}
@AfterClass
private void end() {
        closeBrowser();

}
@Test(dataProvider="FacebookLogin")
private void tc1(String emailTxt,String pass) throws InterruptedException {
	launchUrl("https://en-gb.facebook.com/");
	FbLoginPojo f=new FbLoginPojo();
	
	WebElement userTxt = f.getUserTxt();
	fillTxtBox(userTxt, emailTxt);
	WebElement passTxt = f.getPassTxt();
	fillTxtBox(passTxt, pass);
	
	
	WebElement clkBtn = f.getClkBtn();
	btnClick(clkBtn);
	threadWait();

	
	

}
@DataProvider(name="FacebookLogin")
public Object[][] login() {
	return new Object[][] {
		{"Greens","Greens"},
		{"suga","suga"},
		{"Tech","Tech"}
	};

}
}
