package unitj;

import java.io.IOException;
import java.util.Date;

import org.datadriven.datadriven1.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class FlipcartJunit extends BaseClass {
   FlipcartPojo f;
	@BeforeClass()
	public static void start() {
		chromeBrowser();
		launchUrl("https://www.flipkart.com/account/login");
		maxBrowser();
}
	@Before
	public void startTc() {
		System.out.println("Tc Started>>>>>>>>>>>>>>");
		Date d=new  Date();
		System.out.println(d);
	}
	@Test
	public void tc1() throws IOException {
		 f=new FlipcartPojo();
		WebElement userTxt = f.getUserTxt();
	    fillTxtBox(userTxt, readFromExcel(1, 0));
	}
	@Test
	public void tc2() throws IOException {
		f=new FlipcartPojo();
		WebElement passTxt = f.getPassTxt();
		fillTxtBox(passTxt, readFromExcel(1, 1));
	}
	@Test
	
	public  void tc3() {
		f=new FlipcartPojo();
		WebElement clicklogin = f.getClicklogin();
		btnClick(clicklogin);
		

	}
	
	
	@After
	public void endTc() {
		System.out.println("Tc End>>>>>>>>>>>>>>");
		Date d=new  Date();
		System.out.println(d);
	}
	
	@AfterClass
	public  static void end() throws InterruptedException {
		threadWait();
		closeBrowser();
		

	}

}
