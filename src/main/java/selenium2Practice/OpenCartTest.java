package selenium2Practice;

public class OpenCartTest {

	public static void main(String[] args) {
		String browserName = "chrome";
		//1. Intialise browser
		BrowserUtil brUtil = new BrowserUtil();
		brUtil.initDriver(browserName);
		
		//2. Launch URL
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		
		//3. Get PageTitle
		String pageTitle = brUtil.getPageTitle();
		//4. Validate Page Tile
		if(pageTitle.equals("Your Store")) {
			System.out.println("Test for Title is PASS ");
		}
		else { 
			System.out.println("Title test is FAIL");
		}
		
		//5. Test for current Url
		String currentURL = brUtil.getPageURL();
		if(currentURL.contains("opencart")) {
			System.out.println("The test for URL is PASS");
		}
		else {
			System.out.println("The test for URL is fail");
		}
		
		//6. Closing browser
		brUtil.closeBrowser();
	}

}
