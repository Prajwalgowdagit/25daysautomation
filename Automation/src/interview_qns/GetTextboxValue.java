package interview_qns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetTextboxValue {
public static void main(String[] args) {
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.google.com");
	WebElement ele = d.findElement(By.name("q"));
	ele.sendKeys("Olympics");
	String text = ele.getAttribute("value");
	System.out.println(text);
	d.quit();
}
}
