package methods_of_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfManage {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	driver.manage().deleteAllCookies();
	driver.manage().window().fullscreen();
	driver.manage().window().minimize();
//getPageSource() is used to get the source code of current web page
	String pgSrc = driver.getPageSource();
	System.out.println(pgSrc);
	driver.quit();
}
}
