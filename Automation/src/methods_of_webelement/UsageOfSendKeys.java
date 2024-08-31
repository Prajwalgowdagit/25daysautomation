package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSendKeys {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");Thread.sleep(2000);
//sendKeys() is used to enter the text into the text field
driver.findElement(By.id("email")).sendKeys("virat@gmail.com");
//Using sendKeys() we can perform keyboard action using Keys class
driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"AC");
driver.findElement(By.id("pass")).sendKeys(Keys.CONTROL+"V");
}
}
