package org.datadrive;
import java.io.IOException;

import org.datadrive.FbLoginPojoClass;
import org.openqa.selenium.WebElement;
import org.utility.BaseClass;

public class FbLoginUsingPojoClass extends BaseClass{
	public static void main(String[] args) throws IOException {
		chromeBrowser();
		launchUrl("https://en-gb.facebook.com/");
		maxBrowser();
		 FbLoginPojoClass f=new FbLoginPojoClass();
		 
		 WebElement txtEmail = f.getTxtEmail();
		 fillTxtBox(txtEmail,readFromExcel(4, 0));
		 
		 
		 WebElement txtPassword = f.getTxtPassword();
		 fillTxtBox(txtPassword,readFromExcel(4, 1));
		 
		 
		 WebElement btnLogin = f.getBtnLogin();
		btnClick(btnLogin);
	}

}
