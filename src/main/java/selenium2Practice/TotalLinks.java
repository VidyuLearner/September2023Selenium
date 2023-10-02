package selenium2Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();

		// find all links on the page

		List<WebElement> linksList = driver.findElements(By.tagName("a"));

		int linksCount = linksList.size();
		System.out.println("total links: " + linksCount);

		// for each
		for (WebElement e : linksList) {
			String text = e.getText();
			
				System.out.println(text);
			

		}

	}

}
