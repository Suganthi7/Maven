package org.testng;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginUseForgetPasswordPojo extends BaseClass {
	
	
	public FbLoginUseForgetPasswordPojo() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="identify_email")
	private WebElement phNo;
	
	@FindBy(id="did_submit")
	private WebElement search;

	public WebElement getPhNo() {
		return phNo;
	}

	public WebElement getSearch() {
		return search;
	}
	
	

}
