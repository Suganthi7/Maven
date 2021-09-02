package org.datadrive;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class AdactinPage3PojoClass extends BaseClass {
	public AdactinPage3PojoClass() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="radiobutton_0")
	private WebElement clickRadio;
	
	@FindBy(id="continue")
    private WebElement clickContinue;

	public WebElement getClickRadio() {
		return clickRadio;
	}

	public WebElement getClickContinue() {
		return clickContinue;
	}
	
	
}
