package com.adactin.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	public static WebDriver driver;
	public static WebDriver browserLaunch(String browser) {
			
			try {
				if (browser.equalsIgnoreCase("chrome")) {
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\91999\\eclipse-workspace\\Automation\\driver\\chromedriver.exe");
					driver = new ChromeDriver();
					
				}else if (browser.equalsIgnoreCase("firefox")) {
					System.setProperty("webdriver.gecko.driver", "path");
					driver = new FirefoxDriver();	
					
				}else {
					System.out.println("Invalid");
				}
				
				driver.manage().window().maximize();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return driver;
		}
		
		public static void closeTheCurrentWindow() {
			try {
				driver.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		public static void closeAllTheWindows() {
			try {
				driver.quit();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		public static void navigateTo(String url) {
			try {
				driver.navigate().to(url);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		public static void navigateBack() {
			try {
				driver.navigate().back();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		public static void navigateForward() {
			try {
				driver.navigate().forward();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		public static void refreshThePage() {
			try {
				driver.navigate().refresh();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		public static void getUrl(String url) {
			try {
				driver.get(url);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		public static void switchToAlert() {
			try {
				driver.switchTo().alert();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		public static void mouseClickAction(WebElement element) {
			Actions act = new Actions(driver);
			act.click(element).perform();	

		}
		
		public static void contextClick(WebElement element) {
			Actions act = new Actions(driver);
			act.contextClick(element).perform();

		}
		
		public static void doubleClick(WebElement element) {
			Actions act = new Actions(driver);
			act.doubleClick(element).perform();

		}
		
		public static void moveToElement(WebElement element) {
			Actions act = new Actions(driver);
			act.moveToElement(element).perform();

		}
		
		public static void dragAndDown(WebElement from,WebElement destination) {
			Actions act = new Actions(driver);
			act.dragAndDrop(from, destination).perform();

		}
		
		public static void toFrame(WebElement element) {
			driver.switchTo().frame(element);

		}
		
		public static void downKeyPressRobot() throws AWTException {
			Robot rob = new Robot();
			rob.keyPress(KeyEvent.VK_DOWN);

		}
		
		public static void downKeyReleaseRobot() throws AWTException {
			Robot rob = new Robot();
			rob.keyRelease(KeyEvent.VK_DOWN);

		}
		
		public static void enterKeyPressRobot() throws AWTException {
			Robot rob = new Robot();
			rob.keyPress(KeyEvent.VK_ENTER);

		}
		
		public static void enterKeyRelease() throws AWTException {
			Robot rob = new Robot();
			rob.keyRelease(KeyEvent.VK_ENTER);		

		}
		
		public static void clickCheckBox(WebElement element) {
			element.click();		

		}
		public static void checkWhetherEnabled(WebElement element) {
			boolean enabled = element.isEnabled();
			System.out.println(enabled);	

		}
		
		public static void checkWhetherDisplayed(WebElement element) {
			boolean displayed = element.isDisplayed();
			System.out.println(displayed);		

		}
		
		public static void checkWhetherSelected(WebElement element) {
			boolean selected = element.isSelected();
			System.out.println(selected);

		}
		
		public  void getOptions(WebElement element) {
			Select s = new Select(element);
			List<WebElement> options = s.getOptions();
			
			for (WebElement elements : options) {
				String text = elements.getText();
				System.out.println(text);
				
			}
			

		}
		
		public static void getTitleCurrentPage() {
			String title = driver.getTitle();
			System.out.println(title);

		}
		
		public static void getCurrentUrl() {
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);

		}
		
		public static void getText(WebElement element) {
			String text = element.getText();
			System.out.println(text);
		}
		
		public static void getAttributeValue(WebElement element,String attribute) {
			String value = element.getAttribute(attribute);		
			System.out.println(value);
		}
		
		public static void implicitWait(String i) {
			driver.manage().timeouts().implicitlyWait(Integer.parseInt(i), TimeUnit.SECONDS);
		}
		
		public static void explicitWait(String xpath) {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		}
		
		public static void takeScreenShot(String path) throws IOException {
			
			TakesScreenshot ts =  (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			
			File destination = new File(path);
			
			FileUtils.copyFile(source, destination);	

		}
		
		public static void scroll(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element);

		}
		
		
		
		public static void enterValues(WebElement element,String str) {
			element.sendKeys(str);	

		}
		
		public static void firstSelectedOptions(WebElement element) {
			Select s = new Select(element);
			WebElement first = s.getFirstSelectedOption();
			System.out.println(first);

		}
		
		public static void allSelectedOptions(WebElement element) {
			Select s = new Select(element);
			List<WebElement> all = s.getAllSelectedOptions();
			int size = all.size();
			
			for (int i = 0; i < size; i++) {
				
				String text = all.get(i).getText();
				System.out.println(text);
				
			}

			
		}
		public static void checkWhetherMultiple(WebElement element) {
			Select s = new Select(element);
			boolean multiple = s.isMultiple();
			System.out.println(multiple);

		}
		
		public static void clickOnElement(WebElement element) {
			element.click();
		

		}
		
		public static void selectDropDownByValues(WebElement element,String str) {
			
			Select dropDown = new Select(element);
			dropDown.selectByValue(str);		
		}
		
		public static void selectDropDownByVisibleText(WebElement element,String Str) {
			
			Select dropDown = new Select(element);
			dropDown.selectByVisibleText(Str);
		}
		
		public static void selectDropDownByIndex(WebElement element,int index) {
			Select dropDown = new Select(element);
			dropDown.selectByIndex(index);
		}
		
		public static void clearElement(WebElement element) {
			element.clear();

		}
		
		public static void toDefaultContent() {
			driver.switchTo().defaultContent();

		}
		
		public static void scrollDown() {
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollBy(0,500)");

		}
			

}
