package handling_popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingTabs {
public static void main(String[] args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	d.get("https://www.amazon.in/");
	d.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15 pro max"+Keys.ENTER);
	d.findElement(By.partialLinkText("Apple iPhone 15 Pro Max")).click();
Set<String> allWid = d.getWindowHandles();
for (String wid : allWid) {
	d.switchTo().window(wid);
}Thread.sleep(2000);
d.findElement(By.id("buyNow")).click();
}
}
