package org.testngTask;

import org.testng.BaseClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Question5 extends BaseClass{
	
	@Parameters({"Browser"})
	@Test
	private void tc(String browserName) {
		
		if (browserName.equals("Chrome")) {
			chromeBrowser();
			
		} else if(browserName.startsWith("F")) {
			firefoxBrowser();
			

		}
		else {
			internetExplorer();
		}
		
		launchUrl(" http://www.greenstechnologys.com");

	}
	
	
	
	

}
