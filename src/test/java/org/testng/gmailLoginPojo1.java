package org.testng;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class gmailLoginPojo1 extends BaseClass{
	public gmailLoginPojo1() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Learn more']")
	private WebElement learnMore;

	public WebElement getLearnMore() {
		return learnMore;
	}
	

}
