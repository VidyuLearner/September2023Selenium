package selenium2Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SwitchCaseWebDriver {

	public static void main(String[] args) {
		// Initiate WebDriver
		String browser = "chrome";
	WebDriver driver = null;
	
	switch (browser) {
	case "chrome":
		driver = new ChromeDriver();
		break;
	case "safari":
		driver = new SafariDriver();
		break;
	case "firefox":
		driver = new FirefoxDriver();
		break;
	default:
		System.out.println("Please pass the right browser name");
		break;
	}
	
	// open url
	driver.get("https://www.amazon.com/");
	
	// Capture the Title
	String actTitle = driver.getTitle();
	System.out.println("The title of the page is: "+actTitle);
	
	// Test Case
	if(actTitle.contains("Amazon.com")) {
		System.out.println("The test for tile is Passed");
	}
	else {
		System.out.println("The test for the Title is failed");
	}
	
	// Close the browser
	driver.close();

	}

}
