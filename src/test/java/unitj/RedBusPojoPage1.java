package unitj;

import org.datadriven.datadriven1.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedBusPojoPage1 extends BaseClass {
	public RedBusPojoPage1() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="i-icon-profile")
	private WebElement icon;
	
	@FindBy(id="signInLink")
	private WebElement signClk;
	
	
	public WebElement getIcon() {
		return icon;
	}

	
	public WebElement getSignClk() {
		return signClk;
	}

	
	
	

}
