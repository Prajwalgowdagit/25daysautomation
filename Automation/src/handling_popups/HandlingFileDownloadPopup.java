package handling_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFileDownloadPopup {
public static void main(String[] args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	d.get("https://www.selenium.dev/downloads/");
	Thread.sleep(2000);
	d.findElement(By.xpath("//p[text()='Java']/../p[2]/a")).click();
}
}
