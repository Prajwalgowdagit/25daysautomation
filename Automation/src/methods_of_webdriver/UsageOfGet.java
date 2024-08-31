package methods_of_webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGet {
	public static void main(String[] args) {
//We are creating an object of ChromeDriver, which will launch chrome browser &
//storing the address in driver reference variable
		ChromeDriver driver = new ChromeDriver();
//get(String url) is used to trigger the main URL of the application
		driver.get("www.google.com");
//getTitle() is used to fetch the title of current WebPage
		String title = driver.getTitle();
		System.out.println(title);
//getCurrentUrl() is used to fetch the URL of current WebPage
		String url = driver.getCurrentUrl();
		System.out.println(url);
//close() is used to close the current browser window
		driver.close();
	}
}
