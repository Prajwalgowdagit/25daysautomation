package Assignments1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProvideUrlOfActitime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://online.actitime.com/fireflink2/login.do");
		d.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("poojagunashekar1999@gmail.com");
		d.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("Password@123");
		d.findElement(By.xpath("//div[text()='Login ']")).click();
		System.out.println( d.getCurrentUrl());
		d.quit();
		
		
	}

}
