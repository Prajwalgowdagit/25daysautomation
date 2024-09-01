package Assignments1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleNotificationPopupgovernementaApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

ChromeOptions options = new ChromeOptions();
options.addArguments("--disable-notifications");
		WebDriver d = new ChromeDriver(options);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://pib.gov.in/indexd.aspx");
		Thread.sleep(5000);
d.switchTo().alert().accept();

		d.findElement(By.linkText("Ministry of Defence")).click();
		d.switchTo().alert().accept();
		Set<String> wids = d.getWindowHandles();
		for(String id :wids) {
			d.switchTo().window(id);
		}
		System.out.println(d.getTitle());
	}

}
