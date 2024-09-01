package Assignments1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Password@123");
		driver.findElement(By.name("confirmPassword")).sendKeys("Password@123");
		
		driver.switchTo().defaultContent();
		WebElement frame2 = driver.findElement(By.xpath("(//iframe)[last()]"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.id("username")).sendKeys("abc");
		driver.findElement(By.id("password")).sendKeys("Password@123");
		driver.quit();
	}

}
