package org.unitjtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class FbLoginPojo extends BaseClass{
	
	public FbLoginPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement userTxt;
	
	@FindBy(id="pass")
	private WebElement passTxt;;
	
	
	
	@FindBy(name="login")
	private WebElement clkBtn;



	public WebElement getUserTxt() {
		return userTxt;
	}



	public WebElement getPassTxt() {
		return passTxt;
	}



	public WebElement getClkBtn() {
		return clkBtn;
	}
	
	
	
	

}
