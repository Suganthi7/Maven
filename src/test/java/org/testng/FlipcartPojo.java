package org.testng;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipcartPojo extends BaseClass {
	public FlipcartPojo() {
		PageFactory.initElements(driver, this);
	} 
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement emailTxt;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement passTxt;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement btnLogin;

	public WebElement getEmailTxt() {
		return emailTxt;
	}

	public WebElement getPassTxt() {
		return passTxt;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	

}
