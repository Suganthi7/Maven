package org.sample;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utility.BaseClass;

public class MainClass extends BaseClass {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		
		chromeBrowser();
		launchUrl("https://en-gb.facebook.com/");
		maxBrowser();
		
		pageTitle();
		pageUrl();
//pass Value		
		
		WebElement txtUser = driver.findElement(By.id("email"));
		fillTxtBox(txtUser, "GreenTechnology");
		WebElement txtPass = driver.findElement(By.id("pass"));
		fillTxtBox(txtPass, "123456");
		threadWait();

//copy,paste,doubleclick
		
		clickDouble(txtUser);
		copy();
		nextTab();
		paste();
		threadWait();
		
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnClick(btnLogin);
		threadWait();

		closeBrowser();
		
		chromeBrowser();
		launchUrl("http://greenstech.in/selenium-course-content.html");
		maxBrowser();
//JavaScript		
		
		WebElement  trainer = driver.findElement(By.xpath("//span[text()='Trainer']"));
		scrollUpDown(trainer, true);
		threadWait();
		WebElement contactUs = driver.findElement(By.xpath("(//a[text()='Contact Us'])[2]"));
		scrollUpDown(contactUs, false);
		threadWait();
		closeBrowser();
		
//Alert		
		chromeBrowser();
		launchUrl("http://demo.automationtesting.in/Alerts.html");
		maxBrowser();
		threadWait();
		
		
		WebElement simpleAlrt = driver.findElement(By.xpath("//a[text()='Alert with OK ']"));
		WebElement alertBOx = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		
		btnClick(simpleAlrt);
		btnClick(alertBOx);
		
		acceptAlert();
		threadWait();
		
		
		WebElement confirmAlert = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		WebElement confirmBOx = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		btnClick(confirmAlert);
		btnClick(confirmBOx);
		
		dismissAlert();
		threadWait();
		
		WebElement promptAlert = driver.findElement(By.xpath("//a[text()='Alert with Textbox '] "));
		WebElement promptBOx = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		btnClick(promptAlert);
		btnClick(promptBOx);
		
		passTextAlert("java");
		threadWait();
		closeBrowser();
//Select
		chromeBrowser();
		launchUrl("  http://output.jsbin.com/osebed/2");
		maxBrowser();
		WebElement  selFruit = driver.findElement(By.xpath("//select[@id='fruits'] "));
		optionSelect(selFruit, "Grape");
//screenshot		
		getScreenShot("Select");
		
		
		threadWait();
		closeBrowser();
}
	}
