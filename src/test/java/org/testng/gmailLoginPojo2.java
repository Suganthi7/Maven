package org.testng;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class gmailLoginPojo2 extends BaseClass {
	public gmailLoginPojo2() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@data-label='header']")
	private WebElement signBtn;

	public WebElement getSignBtn() {
		return signBtn;
	}
}
