package org.testng;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginUsingCreateNewAccountPojo extends BaseClass{
	
	public FbLoginUsingCreateNewAccountPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='firstname']")
	 private WebElement firstName;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastName;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	private WebElement mobilNo;
	
	@FindBy(xpath="//input[@name='reg_passwd__']")
	private WebElement passWord;
	
	@FindBy(xpath="//label[text()='Female']")
	private WebElement female;
	
	@FindBy(id="u_0_10_zH")
	private WebElement signUp;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getMobilNo() {
		return mobilNo;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getFemale() {
		return female;
	}

	public WebElement getSignUp() {
		return signUp;
	}
	
	
	
	

}
