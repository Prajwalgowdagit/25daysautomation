package Assignments1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspiderUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.google.com/");
	d.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Qspiders"+Keys.ENTER);
	List<WebElement> links = d.findElements(By.xpath("//a"));
for(WebElement l:links) {
System.out.println(	l.getAttribute("href"));
}
		
	}

}
