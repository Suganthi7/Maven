package org.testngTask;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.BaseClass;
import org.testng.FlipcartPojo;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Question7 extends BaseClass {
	
	@Parameters ({"Browser"})
	@Test
	private void tc(String browserName ) throws IOException {
		if (browserName.equals("Chrome")) {
			chromeBrowser();
			
		} else if (browserName.contains("FF")) {
			firefoxBrowser();
			
		} else{
			internetExplorer();
	}
		
		launchUrl("https://www.flipkart.com/account/login");
		FlipcartPojo f=new FlipcartPojo();
		WebElement emailTxt = f.getEmailTxt();
		fillTxtBox(emailTxt, readFromExcel(4, 0));
		WebElement passTxt = f.getPassTxt();
		fillTxtBox(passTxt, readFromExcel(4, 1));
		WebElement btnLogin = f.getBtnLogin();
		btnClick(btnLogin);

	}

}
