package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static TakesScreenshot tk;
	public static JavascriptExecutor js;
	public static Alert al;
	public static Select s;

	public static void chromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void launchBrowser(String url) {

		driver.get(url);

	}

	public static void pageTitle() {
		String title = driver.getTitle();
		System.out.println("Title of Current page" + title);

	}

	public static void pageUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("URL of Current Page" + currentUrl);

	}

	public static void maxBrowser() {
		driver.manage().window().maximize();
	}

	public static void refreshPage() {
		driver.navigate().refresh();

	}

	public static void waitImplicit(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

	}

	public static void closeBrowser() {
		driver.close();

	}

	public static void quitBrowser() {
		driver.quit();

	}

	public static void filltxtBox(WebElement ref, String val) {
		ref.sendKeys(val);
	}

	public static void btnclick(WebElement ele) {
		ele.click();

	}

	public static void textGet(WebElement ref) {

		String text = ref.getText();
		System.out.println("WebElement Text" + text);

	}

	public static String textAttribute(WebElement ref, String val) {
		String attributevalue = ref.getAttribute(val);
		System.out.println("Attribute Value :" + attributevalue);
		return attributevalue;

	}

	public static void threadWait(int m) throws InterruptedException {
		Thread.sleep(m);

	}

	public static void elementMove(WebElement ele) {
		a = new Actions(driver);
		a.moveToElement(ele).perform();

	}

	public static void dropAndDrag(WebElement src, WebElement des) {
		a = new Actions(driver);
		a.dragAndDrop(src, des).perform();

	}

	public static void rightClick() {
		a = new Actions(driver);
		a.contextClick().perform();

	}

	public static void clickDouble() {
		a = new Actions(driver);
		a.doubleClick().perform();

	}

	public static void keyUpDown(WebElement ele, String val) {
		a = new Actions(driver);
		a.keyDown(Keys.SHIFT).sendKeys(ele, val).keyUp(Keys.SHIFT).perform();

	}

	public static void copy() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);

	}

	public static void takeScreenShot(String name) throws IOException {
		tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\admin\\eclipse-workspace\\MavenProject\\ScreenShot\\" + name + ".png");
		FileUtils.copyFile(src, des);

	}

	public static void frameSwitchUsingId(String id) {
		driver.switchTo().frame(id);

	}

	public static void frameSwitchUsingName(String name) {
		driver.switchTo().frame(name);

	}

	public static void frameSwitchUsingWebElement(WebElement ele) {
		driver.switchTo().frame(ele);

	}

	public static void frameSwitchUsingIndex(int index) {
		driver.switchTo().frame(index);

	}

	public static void parentFrame() {
		driver.switchTo().parentFrame();

	}

	public static void mainFrame() {

		driver.switchTo().defaultContent();

	}

	public static void totalFrame() {
		List<WebElement> allFrames = driver.findElements(By.tagName("iframe"));
		int totFrame = allFrames.size();
		System.out.println(totFrame);

	}

	public static void scrollUpDown(boolean name, WebElement ref) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(" + name + ")", ref);

	}

	public static void attributeSet(String name, WebElement ele) {

		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + name + "')", ele);
	}

	public static void attributeGet(String name, WebElement ele) {

		js = (JavascriptExecutor) driver;
		Object o1 = js.executeScript("return arguments[0].getAttribute('" + name + "')", ele);
		System.out.println(o1);

	}

	public static void javaScriptClick(WebElement ele) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click", ele);

	}

	public static void alertAccept() {
		al = driver.switchTo().alert();
		al.accept();

	}

	public static void alertDismiss() {

		al = driver.switchTo().alert();
		al.dismiss();
	}

	public static void alertSendkys(String name) throws InterruptedException {
		al = driver.switchTo().alert();
		al.sendKeys(name);
		threadWait(20);
		al.accept();
	}

	public static void alertGetText() {
		al = driver.switchTo().alert();
		String text = al.getText();
		System.out.println("Alert Text" + text);
	}

	public static void selectUsingIndex(WebElement ele, int index) {
		 s = new Select(ele);
		s.selectByIndex(index);

	}
	public static void deSelectUsingIndex(WebElement ele, int index) {
		 s = new Select(ele);
		s.deselectByIndex(index);

	}
	
	
	

	public static void selectUsingVisibleText(WebElement ele, String name) {

		 s = new Select(ele);
		s.selectByVisibleText(name);

	}
	public static void deSelectUsingVisibleText(WebElement ele, String name) {

		 s = new Select(ele);
		s.deselectByVisibleText(name);

	}
	

	public static void selectUsingvalue(WebElement ele, String name) {
		 s = new Select(ele);
		s.selectByValue(name);

	}
	

	public static void deSelectUsingvalue(WebElement ele, String name) {
		 s = new Select(ele);
		s.deselectByValue(name);

	}

	public static void multipleSelectOption(WebElement ele) {
		 s = new Select(ele);
		if (s.isMultiple()) {
			System.out.println("More than option Can be Selected");

		} else {
			System.out.println("Only one Option can be selected");

		}

	}

	public static void optionGetUsingSelect(WebElement ele) {
		 s = new Select(ele);
		List<WebElement> options = s.getOptions();

		System.out.println("All option using EnhancedForLoop");
		
		

		for (WebElement eachOption : options) {
			System.out.println(eachOption.getText());
		}

		System.out.println("All option using Normal ForLoop");

		for (int i = 0; i < options.size(); i++) {
			WebElement eachOption = options.get(i);
			System.out.println(eachOption.getText());

		}

	}

	public static void allSelectedOption(WebElement ele) {
		 s = new Select(ele);

		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();

		System.out.println("All selected option using Enhanced ForLoop");
		
		for (WebElement eachOption : allSelectedOptions) {
			System.out.println(eachOption.getText());
		}

		System.out.println("All selected option using Normal ForLoop");

		for (int i = 0; i < allSelectedOptions.size(); i++) {
			WebElement eachOption = allSelectedOptions.get(i);
			System.out.println(eachOption.getText());

		}

	}

	public static void firstSelectedOption(WebElement ele) {

		 s = new Select(ele);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println("FirstSelected Option " + firstSelectedOption);

	}

	public static void nonSelectedOptionInselect(WebElement ele) {
		 s = new Select(ele);
		List<WebElement> allOptions = s.getOptions();
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		allOptions.removeAll(allSelectedOptions);
		
		System.out.println("Normal Forloop");
		
		
		for (int i = 0; i < allOptions.size(); i++) {
			WebElement each = allOptions.get(i);
			System.out.println(each.getText());
		}
		System.out.println("Enhanced  Forloop");
		for (WebElement each : allSelectedOptions) {
			System.out.println(each.getText());

		}
	}
	 public static void allDeselect(WebElement ele) {
		 s=new Select(ele);
		 s.deselectAll();
		
	}
	 
	 public static void switchtoWindow(String urlTitleWindowsId) {
		driver.switchTo().window(urlTitleWindowsId);
		}
	 
	
	 
	 public static void WindowsId() {
		 String parId = driver.getWindowHandle();
		 System.out.println("Parent window Id:"+parId);
		 
		 Set<String>  allwindsId = driver.getWindowHandles();
		 System.out.println("All Windows Id "+allwindsId);
		                       
		 for (String eachId : allwindsId) {
			 if (!parId.equals(eachId)) {
				 
				 driver.switchTo().window(eachId);
				
			}}}
	
	 
	 
	 
	 
	

	
	
	
	public static String readFromExcel(String name, int rowNo, String shName, int cellNo) throws IOException {
		File f = new File("C:\\Users\\admin\\eclipse-workspace\\MavenProject\\Excel Sheet\\" + name + ".xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fin);
		Sheet sh = book.getSheet(shName);
		Row r = sh.getRow(rowNo);
		Cell c = r.getCell(cellNo);
		int cellType = c.getCellType();
		
		String data;
		if (cellType == 1) {
			
			 data = c.getStringCellValue();

		} else if (DateUtil.isCellDateFormatted(c)) {
			Date date = c.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyyy");
			 data = sim.format(date);
		}else {
			double d = c.getNumericCellValue();
			long l=(long)d;
			 data = String.valueOf(l);
			
		}
		return data;
	

	}

}