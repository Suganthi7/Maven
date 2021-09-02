package org.testng;

import org.openqa.selenium.By;
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
	private WebElement calendr;
	
	public WebElement getCalendr() {
		return calendr;
	}
	
	@FindBy(xpath="//td[@class='current day']")
	private WebElement date;
	
	public WebElement getDateRed() {
		return date;
	}

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
