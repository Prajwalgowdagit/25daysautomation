package handling_dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class HandlingDOBDropdown {
public static void main(String[] args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	d.get("https://www.facebook.com/");
	d.findElement(By.linkText("Create new account")).click();
	WebElement day = d.findElement(By.id("password_step_input"));
	WebElement month = d.findElement(By.id("month"));
	WebElement year = d.findElement(By.id("year"));
	Select s1=new Select(day);
	Select s2=new Select(month);
	Select s3=new Select(year);Thread.sleep(2000);
	s1.selectByIndex(14);
	s2.selectByValue("8");
	s3.selectByVisibleText("1947");
	s1.deselectByIndex(14);
}
}
