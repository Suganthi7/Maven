package org.testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

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
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
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

	public static void firefoxBrowser() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

	}

	public static void internetExplorer() {
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();

	}

	public static void launchUrl(String url) {
		driver.get(url);

	}

	public static void maxBrowser() {
		driver.manage().window().maximize();

	}

	public static void applyWaitForAllLocators(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

	}

	public static String pageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		return title;

	}

	public static String pageUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		return currentUrl;

	}

	public static void fillTxtBox(WebElement ref, String data) {
		ref.sendKeys(data);
	}

	public static void btnClick(WebElement ele) {
		ele.click();

	}

	public static void textGet(WebElement ref) {
		String text = ref.getText();
		System.out.println("Text :" + text);

	}

	public static void getDate() {
		System.out.println("Tc started>>>>>>>>>>>>");
		Date d = new Date();
		System.out.println(d);
		System.out.println("Tc End>>>>>>>>>>>>>>>>>");

	}

	public static void moveHover(WebElement ref) {
		a = new Actions(driver);
		a.moveToElement(ref).perform();

	}

	public static void elementDropDrag(WebElement src, WebElement des) {
		a = new Actions(driver);
		a.dragAndDrop(src, des).perform();

	}

	public static void clickDouble(WebElement el) {
		a = new Actions(driver);
		a.doubleClick(el).perform();
	}

	public static void rightClick(WebElement el) {
		a = new Actions(driver);
		a.contextClick(el).perform();
	}

	public static void keyUpDown(WebElement ref, String value) {
		a = new Actions(driver);
		a.keyDown(Keys.SHIFT).sendKeys(ref, value).keyUp(Keys.SHIFT).perform();

	}

	public static void enter() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void copy() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);

	}

	public static void nextTab() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

	}

	public static void down() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

	}

	public static void paste() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}

	public static void threadWait() throws InterruptedException {
		Thread.sleep(5000);

	}

	public static void scrollUpDown(WebElement ref, boolean name) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(" + name + ")", ref);

	}

	public static void attributeSet(WebElement ele, String value) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttibute('value','" + value + "')", ele);

	}

	public static void attributeget(WebElement ele, String value) {
		js = (JavascriptExecutor) driver;
		js.executeScript("return arguments[0].getAttibute('" + value + "')", ele);

	}

	public static void javascrptClick(WebElement ele) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele);

	}

	public static void getScreenShot(String name) throws IOException {
		tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\admin\\eclipse-workspace\\MavenProject\\ScreenShot\\" + name + ".png");
		FileUtils.copyFile(src, des);

	}

	public static void acceptAlert() {
		al = driver.switchTo().alert();
		al.accept();

	}

	public static void dismissAlert() {
		al = driver.switchTo().alert();
		al.dismiss();

	}

	public static void passTextAlert(String name) throws InterruptedException {
		al = driver.switchTo().alert();

		al.sendKeys(name);

		al.accept();

	}

	public static void getTextAlert() {
		System.out.println(al.getText());

	}

	public static void frameSwitchWebElm(WebElement ele) {
		driver.switchTo().frame(ele);
	}

	public static void frameSwitchStng(String name) {
		driver.switchTo().frame(name);
	}

	public static void frameSwitchIndex(int index) {
		driver.switchTo().frame(index);
	}

	public static void totalFrame() {
		List<WebElement> allFrames = driver.findElements(By.tagName("iframe"));
		int framesCount = allFrames.size();
		System.out.println("No of Frames:" + framesCount);
	}

	public static void comeParentFrame() {
		driver.switchTo().parentFrame();
	}

	public static void comeMainFrame() {
		driver.switchTo().defaultContent();

	}

	public static void optionSelect(WebElement selEle, String txt) {
		s = new Select(selEle);
		s.selectByVisibleText(txt);

	}

	public static void optionSelectIndex(WebElement selEle, int index) {
		s = new Select(selEle);
		s.selectByIndex(index);
	}

	public static void optionSelectValue(WebElement selEle, String value) {
		s = new Select(selEle);
		s.selectByValue(value);
	}

	public static void checkMultiple(WebElement ele) {
		s = new Select(ele);
		if (s.isMultiple()) {
			System.out.println("More than one option can be selected");

		} else {
			System.out.println("only one option can be selected");

		}
	}

	public static void allOption(WebElement ele) {
		s = new Select(ele);
		System.out.println("All Option :");
		List<WebElement> list = s.getOptions();
		for (WebElement each : list) {
			System.out.println(each);

		}
	}

	public static void allSelectedOption(WebElement ele) {
		s = new Select(ele);
		System.out.println("All Selected Option :");
		List<WebElement> list = s.getAllSelectedOptions();
		for (WebElement each : list) {
			System.out.println(each);

		}
	}

	public static void firstSelectedOption(WebElement ele) {
		s = new Select(ele);

		WebElement firstSel = s.getFirstSelectedOption();
		System.out.println("First Selected Option :" + firstSel);
	}

	public static void deSelectByIndex(WebElement ele, int index) {
		s = new Select(ele);
		s.deselectByIndex(index);
	}

	public static void deSelectByValue(WebElement ele, String Value) {
		s = new Select(ele);
		s.deselectByValue(Value);
	}

	public static void deSelectByVisibleText(WebElement ele, String Value) {
		s = new Select(ele);
		s.deselectByVisibleText(Value);
	}

	public static void deSelectAll(WebElement ele) {
		s = new Select(ele);
		s.deselectAll();

	}

	public static void handleWindow(String UrlOrTitleOrWindowsId) {
		driver.switchTo().window(UrlOrTitleOrWindowsId);

	}

	public static void windowId() {
		String parId = driver.getWindowHandle();
		System.out.println("parent ID " + parId);
		Set<String> allWinID = driver.getWindowHandles();
		System.out.println("All Window Id  " + allWinID);
		for (String eachId : allWinID) {
			if (!parId.equals(allWinID)) {
				driver.switchTo().window(eachId);

			}
		}
	}

	public static List<WebElement> table(String id) {
		WebElement head = driver.findElement(By.className(id));

		List<WebElement> allTable = driver.findElements(By.tagName("table"));
		int tableSize = allTable.size();
		System.out.println("\n\nTable " + tableSize);
		List<WebElement> allRow = head.findElements(By.tagName("tr"));
		int rowSize = allRow.size();
		for (WebElement row : allRow) {
			List<WebElement> allData = row.findElements(By.tagName("td"));
			for (WebElement data : allData) {
				System.out.println(data.getText());

			}
			
		}
		
		

		return allRow;

	}
	
	
	public static void fetchSingleDataTable(String id) {
		
		WebElement findElement = driver.findElement(By.id(id));
		

	}

	public static String readFromExcel(int rowNo, int cellNo) throws IOException {
		File f = new File("C:\\Users\\admin\\eclipse-workspace\\MavenProject\\Excel Sheet\\excelworkread.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fin);
		Sheet sh = book.getSheet("Sheet1");
		Row row = sh.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		int cellType = cell.getCellType();
		String data = "";
		if (cellType == 1) {
			data = cell.getStringCellValue();

		} else if (DateUtil.isCellDateFormatted(cell)) {
			Date date = cell.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd//MM/yyyy");
			data = sim.format(date);

		} else {
			double dou = cell.getNumericCellValue();
			long l = (long) dou;
			data = String.valueOf(l);

		}
		return data;

	}

	public static String attributeGet(WebElement ref, String name) {
		String attribute = ref.getAttribute(name);
		System.out.println("Atrribute Value :" + attribute);
		return attribute;

	}

	public static void writeFromExcel(int rowNo, int cellNo, String name) throws IOException {
		File f = new File("C:\\Users\\admin\\eclipse-workspace\\MavenProject\\Excel Sheet\\excelworkread.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fin);
		Sheet sh = book.getSheet("Sheet1");
		Row r = sh.getRow(rowNo);
		Cell c = r.createCell(cellNo);
		c.setCellValue(name);
		FileOutputStream fo = new FileOutputStream(f);
		book.write(fo);

	}

	public void refrsh() {
		driver.navigate().refresh();
	}

	public static void quitBrowser() {
		driver.quit();

	}

	public static void closeBrowser() {
		driver.close();

	}

}
