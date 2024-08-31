package methods_of_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfNavigate {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	Thread.sleep(2000);//This will pause the execution for mentioned duration
	driver.navigate().to("https://www.instagram.com");
	Thread.sleep(2000);
	driver.navigate().back();Thread.sleep(2000);
	driver.navigate().forward();Thread.sleep(2000);
	driver.navigate().refresh();Thread.sleep(2000);
	driver.quit();
}
}
