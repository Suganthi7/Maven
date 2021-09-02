package unitj;

import java.util.Date;
import java.util.List;

import org.datadriven.datadriven1.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class RedjUnit  extends BaseClass{
	
	public static RedBusPojoPage1 r1;
	public static RedBusPojoPage2 r2;
	
	@Before
	
   public  void start() {
		System.out.println("Tc  start >>>>>>>>>>>>>>");
		Date d=new Date();
		System.out.println(d);
		
}
	@BeforeClass
public  static void startTc() {
		
		chromeBrowser();
		launchUrl("https://www.redbus.in/");
		maxBrowser();
		
	}
	

	
@Test
public void tc1() throws InterruptedException {
	 r1=new RedBusPojoPage1();
	 WebElement iconClk = r1.getIcon();
	 btnClick(iconClk);
	 WebElement signClk = r1.getSignClk();
	 btnClick(signClk);
	 threadWait();
	 
	}

@Test
public void tc2() throws InterruptedException {
	r2=new RedBusPojoPage2();
	WebElement frame = r2.getFrame();
	frameSwitchWebElm(frame);
	threadWait();
	
	WebElement phNo = r2.getPhNo();
	fillTxtBox(phNo, "9876543210");
	WebElement frame1 = r2.getFrame1();
	
	frameSwitchWebElm(frame1);
	threadWait();
	WebElement captcha = r2.getCaptcha();
	
	btnClick(captcha);
//	WebElement otpClick = r2.getOtpClick();
//	btnClick(otpClick);
	
}

@After
public  void endTc() {
	System.out.println("Tc end>>>>>>>>>>");
	Date d=new Date();
	System.out.println(d);
}

	
	
	

}
