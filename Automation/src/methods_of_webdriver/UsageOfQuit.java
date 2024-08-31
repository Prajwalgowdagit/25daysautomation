package methods_of_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfQuit {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://secure.indeed.com");
	driver.findElement(By.id("login-google-button")).click();
//	driver.close();
//quit() is used to close all the browser windows
	driver.quit();
}
}
