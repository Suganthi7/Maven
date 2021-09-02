package org.testng;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class FbCreateNewAccGroup extends BaseClass {
	@Test(groups="regression")
	private void tc() throws IOException, InterruptedException {
		chromeBrowser();
		launchUrl("https://en-gb.facebook.com/");
		maxBrowser();
		FbLoginPojo f=new FbLoginPojo();
		WebElement createNewAccount = f.getCreateNewAccount();
		btnClick(createNewAccount);
		threadWait();
		
		FbLoginUsingCreateNewAccountPojo f1=new FbLoginUsingCreateNewAccountPojo();
		WebElement firstName = f1.getFirstName();
		fillTxtBox(firstName, readFromExcel(1, 2));
		
		WebElement lastName = f1.getLastName();
		fillTxtBox(lastName, readFromExcel(1, 3));
		
		
	    WebElement mobilNo = f1.getMobilNo();
	    fillTxtBox(mobilNo, "9751512487");
	    
	    WebElement passWord = f1.getPassWord();
	    fillTxtBox(passWord, readFromExcel(1, 1));
	    
	    
	    WebElement female = f1.getFemale();
	    btnClick(female);
	    
	    
	    
	    WebElement signUp = f1.getSignUp();
	    btnClick(signUp);
	    

		
		
		

	}

}
