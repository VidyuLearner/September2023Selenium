package selenium2Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		//1. Open Browser: Chrome
		//ChromeDriver driver = new ChromeDriver();
		String browser = "chrome";
		WebDriver driver = null;
		
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equals("safari")) {
			driver = new SafariDriver();
		}
		else if(browser.equals("edge")) {
			driver = new EdgeDriver();
		}
		else {
			System.out.println("Please pass the right browser...");
		}
		
		
		//2.enter url
		driver.get("https://www.google.com");
		
		//3. get the title
		String actTitle = driver.getTitle();
		System.out.println("page title: " +actTitle);
		
		//validation point/checkpoint:
		if(actTitle.equals("Google")) {
			System.out.println("Test is pass");
		}
		else {
			System.out.println("Test is fail");
		}
		
		driver.quit();//to close the browser
			
		
		

	}

}
