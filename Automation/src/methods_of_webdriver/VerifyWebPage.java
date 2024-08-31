package methods_of_webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyWebPage {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String actualTitle = driver.getTitle();
		String actualUrl = driver.getCurrentUrl();
		String expectedTitle="Facebook";
		String expectedUrl="https://www.FACEBOOK.com/";
		if(actualTitle.contains(expectedTitle)&&actualUrl.equalsIgnoreCase(expectedUrl)) {
			System.out.println("Pass: Both title and URL are same");
		}else {
			System.out.println("Fail: Both title and URL are not same");
		}
		driver.quit();
	}
}
