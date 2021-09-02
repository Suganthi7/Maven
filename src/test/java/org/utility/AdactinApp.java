package org.utility;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinApp extends BaseClass{
	public static void main(String[] args) throws InterruptedException, IOException {
		
	chromeBrowser();
	launchUrl("http://adactinhotelapp.com/");
	maxBrowser();
	pageTitle();
	pageUrl();
	
    WebElement userTxt = driver.findElement(By.xpath("//input[@id='username']"));
     fillTxtBox(userTxt, "renurenu");
	WebElement passTxt = driver.findElement(By.xpath("//input[@id='password']"));
    fillTxtBox(passTxt, "renurenu");
    threadWait();
    getScreenShot("Login");

	
	WebElement clickbtn = driver.findElement(By.xpath("//input[@id='login']"));
    btnClick(clickbtn);
	
	WebElement selLoc = driver.findElement(By.xpath("//select[@id='location']"));
	optionSelect(selLoc, "New York");
	
	WebElement selHotel = driver.findElement(By.xpath("//select[@id='hotels']"));
	optionSelect(selHotel, "Hotel Sunshine");
	
	
	WebElement selRoomType = driver.findElement(By.xpath("//select[@id='room_type']"));
	optionSelect(selRoomType, "Standard");
	
	
	WebElement selRoomNo = driver.findElement(By.xpath("//select[@id='room_nos']"));
	optionSelect(selRoomNo, "6 - Six");
	
	
	WebElement dateIn = driver.findElement(By.xpath("//input[@id='datepick_in']"));
	fillTxtBox(dateIn, "1/07/2021");
	
	WebElement dateOut = driver.findElement(By.xpath("//input[@id='datepick_out']"));
	fillTxtBox(dateOut, "7/07/2021");
	
	WebElement selAdltRoom = driver.findElement(By.xpath("//select[@id='adult_room']"));
	optionSelect(selAdltRoom, "2 - Two");
	
	
	WebElement SelChildRoom = driver.findElement(By.xpath("//select[@id='child_room']"));
	optionSelect(SelChildRoom, "2 - Two");
	getScreenShot("Data Room");
	
	threadWait();
	
	WebElement  btnSubmit = driver.findElement(By.xpath("//input[@id='Submit']"));
	btnClick(btnSubmit);
	
	WebElement clikRadio = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
	btnClick(clikRadio);
	
	threadWait();
	
	WebElement clkContue= driver.findElement(By.xpath("//input[@id='continue']"));
	getScreenShot("Click");
	btnClick(clkContue);
	
	WebElement frstName = driver.findElement(By.xpath("//input[@id='first_name']"));
	fillTxtBox(frstName, "Green");
	
	
	WebElement lastName = driver.findElement(By.xpath("//input[@id='last_name']"));
	fillTxtBox(lastName, "Technology");
	
	WebElement addrs = driver.findElement(By.xpath("//textarea[@id='address']"));
	fillTxtBox(addrs, "Perumbakkam");
	
	
	WebElement cardNo = driver.findElement(By.xpath("//input[@id='cc_num']"));
	fillTxtBox(cardNo, "9876543212342345");
	
	
	WebElement selCardType = driver.findElement(By.xpath("//select[@id='cc_type']"));
	optionSelect(selCardType, "Master Card");
	
	
	WebElement selMonth = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
	optionSelect(selMonth, "March");
	
	
	WebElement selYear = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
	optionSelect(selYear, "2022");
	
	
	WebElement cvvNo = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
	fillTxtBox(cvvNo, "777");
	
	WebElement bookNow = driver.findElement(By.xpath("//input[@id='book_now']"));
	btnClick(bookNow);
	getScreenShot("Personal Details");
	threadWait();


	WebElement text = driver.findElement(By.xpath("//input[@id='order_no']"));
	System.out.println("\nGreen Technology \nOrder No\n");
	attributeGet(text, "value");
	
	//String attribute = text.getAttribute("value");
	//System.out.println(attribute);
	
	getScreenShot("Order No");
	threadWait();
	closeBrowser();
	
	

}}

	