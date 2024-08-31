package handling_popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class HandlingAlertPopup {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
	Alert a = driver.switchTo().alert();
	String text = a.getText();				a.accept();
	System.out.println(text);
	driver.findElement(By.linkText("Alert with OK & Cancel")).click();
	driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
	wait.until(ExpectedConditions.alertIsPresent());
	driver.switchTo().alert().dismiss();
	String text1 = driver.findElement(By.id("demo")).getText();
	System.out.println(text1);
	driver.findElement(By.linkText("Alert with Textbox")).click();
	driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
	Alert a1 = driver.switchTo().alert();
	a1.sendKeys("Dhoni");					a1.accept();
	String text2 = driver.findElement(By.id("demo1")).getText();
	System.out.println(text2);
}
}
