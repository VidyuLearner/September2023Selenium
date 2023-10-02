package selenium2Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountTextfield {

	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		driver.manage().window().maximize();
		
		List<WebElement>textBox = driver.findElements(By.className("form-control"));
		System.out.println(textBox.size());
		
		
		for(WebElement e:textBox) {
			String textBoxText = e.getText();
			System.out.println(textBoxText);
		}
		
		

	}

}
