package selenium2Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPageTest {

	public static void main(String[] args) {

		String browserName = "chrome";
		// 1. launch browser from BrowserUtil
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initDriver(browserName);
		// 2. Launch URL
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		// 3. Defining By locators of the page
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By emailID = By.id("input-email");
		By telePhone = By.id("input-telephone");
		By passWord = By.id("input-password");
		By cnfpassWord = By.id("input-confirm");
		By subradiobtn = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input");
		By policyChkBx = By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
		By submitBtn = By.xpath("//input[@type='submit']");
		By successfulMsg = By.xpath("//*[@id=\"content\"]/h1");

		// calling Element Util to perform actions on webelements
		ElementUtil eleUtil = new ElementUtil(driver);

		eleUtil.doSendKeys(firstName, "Amit1");
		eleUtil.doSendKeys(lastName, "Mishra1");
		eleUtil.doSendKeys(emailID, "Amit.mishra1@gmail.com");
		eleUtil.doSendKeys(telePhone, "098747474572");
		eleUtil.doSendKeys(passWord, "Amit@1232");
		eleUtil.doSendKeys(cnfpassWord, "Amit@1232");
		eleUtil.doClick(subradiobtn);
		eleUtil.doClick(policyChkBx);
		eleUtil.doClick(submitBtn);
		String mesg = eleUtil.doElementGetText(successfulMsg);
		System.out.println(mesg);
		
		if(mesg.contains("Account created")) {
			System.out.println("Title test is passed");
		}
		else {
			System.out.println("Title test failed");
		}
		
		

	}

}
