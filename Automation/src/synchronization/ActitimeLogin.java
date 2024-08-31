package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ActitimeLogin {
public static void main(String[] args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.get("https://online.actitime.com/fireflink2/login.do");
	d.findElement(By.id("username")).sendKeys("poojagunashekar1999@gmail.com");
	d.findElement(By.name("pwd")).sendKeys("Password@123"+Keys.ENTER);
	WebDriverWait wait=new WebDriverWait(d, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
	String title = d.getTitle();
	System.out.println(title);
	d.findElement(By.id("logoutLink")).click();
	}
}