package org.junitassert;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedBusPojo extends BaseClass {
	public RedBusPojo() {
	PageFactory.initElements(driver, this);
	}
	@FindBy(id="src")
	private WebElement fromTxt;
	
	@FindBy(id="dest")
	private WebElement toTxt;
	
	@FindBy(xpath="//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")
	private WebElement date;
	
	public WebElement getDateRed() {
		return date;
	}

	public WebElement getDate15() {
		return date15;
	}

	@FindBy(xpath="//td[text()='15']")
	private WebElement date15;
	
	@FindBy(id="search_btn")
	private WebElement btnSrch;

	public WebElement getFromTxt() {
		return fromTxt;
	}

	public WebElement getToTxt() {
		return toTxt;
	}

	

	public WebElement getBtnSrch() {
		return btnSrch;
	}
	
	

}
