package org.datadrive;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utility.BaseClass;

public class AdactinAppUsingPojoClass extends BaseClass {
	public static void main(String[] args) throws IOException, InterruptedException {
		chromeBrowser();
		launchUrl("http://adactinhotelapp.com/");
		maxBrowser();
		pageTitle();
		pageUrl();
		
	    AdactinPage1PojoClass a1=new AdactinPage1PojoClass();
	    
	    WebElement  userTxt= a1.getTxtUserName();
	    fillTxtBox(userTxt,readFromExcel( 1, 0) );
	     threadWait();
		
	     
	     WebElement passTxt = a1.getTxtPassword();
	    fillTxtBox(passTxt,readFromExcel(1,1 ) );
	    threadWait();
	    
	    getScreenShot("Loginexcel");

		WebElement clickBtn = a1.getBtnLogin();
		btnClick(clickBtn);
		
		AdactinPage2PojoClass a2=new AdactinPage2PojoClass();
		
		WebElement selLoc = a2.getSelLoc();
		optionSelect(selLoc, "New York");
		
		
		
		WebElement selHotel = a2.getSelHotel();
		optionSelect(selHotel, "Hotel Sunshine");
		
		
		WebElement selRoomType = a2.getSelRoomType();
		optionSelect(selRoomType, "Standard");
		
		
		WebElement selRoomNo = a2.getSelRoomNo();
		optionSelect(selRoomNo, "6 - Six");
		
		
		WebElement selDateIn = a2.getSelDateIn();
		fillTxtBox(selDateIn, "1/07/2021");
		
		WebElement selDateOut = a2.getSelDateOut();
		fillTxtBox(selDateOut, "7/07/2021");
		
		WebElement selAdltRoom = a2.getAdultRoom();
		optionSelect(selAdltRoom, "2 - Two");
		
		
		WebElement  selChildRoom = a2.getChildRoom();
		optionSelect(selChildRoom, "2 - Two");
		
		getScreenShot("Data Room");
		threadWait();
		
		WebElement btnSubmit = a2.getClickSearch();
		btnClick(btnSubmit);
		
		AdactinPage3PojoClass a3=new AdactinPage3PojoClass();
		WebElement clickRadio = a3.getClickRadio();
		btnClick(clickRadio);
		
		threadWait();
		WebElement clickContinue = a3.getClickContinue();
		getScreenShot("Click");
		btnClick(clickContinue);
		

        AdactinPage4PojoClass a4=new AdactinPage4PojoClass();
        WebElement firstName = a4.getFirstName();
		fillTxtBox(firstName, readFromExcel(1, 2));
		
		
		WebElement lastName = a4.getLastName();
		fillTxtBox(lastName, readFromExcel(1, 3));
		
		WebElement addrs = a4.getAddress();
		fillTxtBox(addrs, readFromExcel(1,4));
	
		
		WebElement cardNo = a4.getCcNum();
		fillTxtBox(cardNo, readFromExcel(1, 5));
		
		
		WebElement selCardType = a4.getCardType();
		optionSelect(selCardType, "Master Card");
		
		
		WebElement selMonth = a4.getCardExpMonth();
		optionSelect(selMonth, "March");
		
		
		WebElement selYear  = a4.getCardExpYear();
		optionSelect(selYear, "2022");
		
		
		WebElement cvvNo = a4.getCvvNumber();
		fillTxtBox(cvvNo, readFromExcel(1, 6));
		
		WebElement bookNow = a4.getBookNow();
		btnClick(bookNow);
		getScreenShot("Personal Details");
		threadWait();
		
		writeFromExcel(0, 7,"Order No");

        AdactinPage5PojoClass a5=new AdactinPage5PojoClass();

		WebElement orderNo = a5.getOrderNo();
		System.out.println("\nGreen Technology \nOrder No\n");
		attributeGet(orderNo, "value");
		getScreenShot("Order No");
		
		writeFromExcel(1, 7, attributeGet(orderNo, "value"));
		
		threadWait();
		closeBrowser();

	}

}
