package org.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sample extends BaseClass{
	public static void main(String[] args) {
		
		chromeBrowser();
       launchUrl("https://en-gb.facebook.com/");
       maxBrowser();
       
       pageTitle();
       pageUrl();
       WebElement emailTxt = driver.findElement(By.id("email"));
       fillTxtBox(emailTxt, "Green");
       WebElement txtPass = driver.findElement(By.id("pass"));
       fillTxtBox(txtPass, "green");
       WebElement btnLogin = driver.findElement(By.name("login"));
       btnClick(btnLogin);
       textGet(btnLogin);
       
       
	}
	

}
