package org.testng;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FbForgetPasswdGroup extends BaseClass{
	
	@Test(groups="sanity")
	private void tc() {
		 chromeBrowser();
			launchUrl("https://en-gb.facebook.com/");
			maxBrowser();
		
		FbLoginPojo f=new FbLoginPojo();
		WebElement forgetPassword = f.getForgetPassword();
		btnClick(forgetPassword);
		FbLoginUseForgetPasswordPojo f1=new FbLoginUseForgetPasswordPojo();
		WebElement phNo = f1.getPhNo();
		fillTxtBox(phNo, "9751512487");
		WebElement element = f1.getSearch();
		btnClick(element);
	

	}
	
	

}
