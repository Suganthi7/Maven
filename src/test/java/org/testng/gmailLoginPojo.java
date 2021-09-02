package org.testng;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class gmailLoginPojo extends BaseClass {
	public gmailLoginPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="identifierId")
	private WebElement emailTxt;
	
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement btnNext;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement passTxt;

	public WebElement getEmailTxt() {
		return emailTxt;
	}

	public WebElement getBtnNext() {
		return btnNext;
	}

	public WebElement getPassTxt() {
		return passTxt;
	}
	

	
	
	




}
