package unitj;

import java.util.List;

import org.datadriven.datadriven1.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class RedBusPojoPage2 extends BaseClass {
	public RedBusPojoPage2() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//input[@type='number']")
	private WebElement phNo;
	@FindAll({
	@FindBy(id="//div[@class='recaptcha-checkbox-checkmark']"),
	@FindBy(xpath="(//div[@class='recaptcha-checkbox-border'])[1]")
	})
	private WebElement captcha;
	
	@FindBy(id="otp-container")
	private WebElement otpClick;
	
	public WebElement getPhNo() {
		return phNo;
	}
	public WebElement getCaptcha() {
		return captcha;
	}

	public WebElement getOtpClick() {
		return otpClick;
	}

	@FindBy(xpath="//iframe[@class='modalIframe']")
	private WebElement   frame;
    public WebElement getFrame() {
		return frame;
	}
	
	@FindBy(xpath="(//iframe[@title='reCAPTCHA'])[1]")
	private WebElement frame1;

	public WebElement getFrame1() {
		return frame1;
	}
	


}
