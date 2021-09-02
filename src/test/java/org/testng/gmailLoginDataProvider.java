package org.testng;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class gmailLoginDataProvider extends BaseClass {
	
	public static gmailLoginPojo g;
	@BeforeClass
	private void setUp() {
		firefoxBrowser();
		launchUrl(" https://mail.google.com/");
		maxBrowser();
		applyWaitForAllLocators(20);

	}
	@BeforeMethod
	private void startTc() {
		getDate();

	}
	
	@AfterMethod
	private void endTc() {
		getDate();
		
	}
	
	@Test(dataProvider="GmailLogin")
	private void tc1(String emailText) {
		launchUrl(" https://mail.google.com/");
		 g=new gmailLoginPojo();
		
		WebElement emailTxt = g.getEmailTxt();
		fillTxtBox(emailTxt, emailText);
		
		WebElement btnNext = g.getBtnNext();
		btnClick(btnNext);
				
		
		
	}
	@Test
	private void tc3() {
gmailLoginPojo1 g1=new gmailLoginPojo1();
		
		WebElement learnMore = g1.getLearnMore();
		btnClick(learnMore);
		

	}
	
	@Test
	private void tc1() throws InterruptedException {
		gmailLoginPojo2 g2=new gmailLoginPojo2();
		
		   threadWait();
	       WebElement signBtn = g2.getSignBtn();
	       btnClick(signBtn);


	}
	
	
	@Test(dataProvider="GmailLogin")
	private void tc4(String emailText,String passText) {
		 g=new gmailLoginPojo();
		 WebElement emailTxt = g.getEmailTxt();
			fillTxtBox(emailTxt, emailText);
			
			WebElement btnNext = g.getBtnNext();
			btnClick(btnNext);
					
		WebElement passTxt = g.getPassTxt();
		fillTxtBox(passTxt, passText);
		
		
		WebElement btnNext2 = g.getBtnNext();
		btnClick(btnNext2);

	}
	@DataProvider(name="GmailLogin")
	public Object[][] loginGmail() {
	
		return new Object[][] {
			{"suganthijayaraj2011@gmail.com","123456"},
			//{"suganthistar2011@gmail.com","123456"},
			//{"suganthinagarajan2017@gmail.com","1234567"}
		};

	}
	
	
	@AfterClass
	private void end() {
	//closeBrowser();

	}

}
