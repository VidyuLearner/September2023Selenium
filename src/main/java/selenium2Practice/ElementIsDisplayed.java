package selenium2Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisplayed {
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
	By logoImage = By.className("img-responsive");
	By search = By.name("search");
	By searchIcon = By.cssSelector("#search > span > button");
	
	if(doElementIsDisplayed(logoImage)) {
		System.out.println("IMage is displayed");
	}
	
	if(doElementIsDisplayed(search)) {
		System.out.println("the search is present");
		doSendKeys(search, "MacBook");
		doClick(searchIcon);
		
	}
		

	}




public static WebElement getElement(By locator) {
	return driver.findElement(locator);
	
}

public static boolean doElementIsDisplayed(By locator) {
	return getElement(locator).isDisplayed();
}

public static void doSendKeys(By locator, String value) {
	getElement(locator).sendKeys(value);
}

public static void doClick(By locator) {
	getElement(locator).click();
}
}

