package Assignments1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterTheDataInMultipleTabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String actualUrl = "https://demoapps.qspiders.com/ui/browser/SignUp";
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.findElement(By.id("browserButton2")).click();
		Set<String> wids = d.getWindowHandles();
		for( String id:wids) {
			d.switchTo().window(id);
			if(d.getCurrentUrl().equals(actualUrl)) {
				break;
			}
		}
		d.findElement(By.name("password")).sendKeys("password");
	}
	

}
