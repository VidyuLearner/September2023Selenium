package selenium2Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CRMproPara {
	static WebDriver driver;

	public static void main(String[] args) {
			
			driver = new ChromeDriver();
			driver.get("https://classic.freecrm.com/");
			
			driver.manage().window().maximize();
			
			List<WebElement>getParagraph = driver.findElements(By.tagName("p"));
			System.out.println(getParagraph.size());
			
			for(WebElement e: getParagraph) {
				System.out.println(e.getText());
			}

	}

}
