package Assignments1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickOnLoginButtonUsingExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expecxtedUrl ="https://online.actitime.com/fireflink2/timetrack/enter.do";
WebDriver d = new ChromeDriver();

d.get("https://online.actitime.com/fireflink2/login.do");
d.manage().window().maximize();
d.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("poojagunashekar1999@gmail.com");
d.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("Password@123");
d.findElement(By.xpath("//div[text()='Login ']")).click();
WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(5));
wait.until(ExpectedConditions.urlMatches(expecxtedUrl));
d.findElement(By.linkText("Logout")).click();
d.quit();
	}

}
