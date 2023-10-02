package selenium2Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcetp {
	static WebDriver driver;

	public static void main(String[] args) {
		//1. create a webelement + perform action (click, sendkeys, gettext, isDisplayed..)
		//2. create a webelement: need a locator
		
		 driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		By login = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(emailId, "naveen@gmail.com");
		eleUtil.doSendKeys(password, "naveen@123");
		eleUtil.doClick(login);
		
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	
	public static void doSendKeys(By locator, String value) {
		 getElement(locator).sendKeys(value);
	}
	

}
