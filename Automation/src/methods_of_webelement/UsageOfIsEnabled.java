package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsEnabled {
public static void main(String[] args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.get("https://www.facebook.com/");
//	driver.get("https://www.instagram.com/");Thread.sleep(2000);
	WebElement login = d.findElement(By.tagName("button"));
//isEnabled() is used to check whether the element is enabled or disabled
	boolean res = login.isEnabled();
	if(res==true) {		System.out.println("The login button is enabled");
	}else {				System.out.println("The login button is disabled");
	}
}
}
