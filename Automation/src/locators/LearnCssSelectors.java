package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnCssSelectors {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("file:///C:/Users/QSP/Desktop/A.html");
		WebElement ele = d.findElement(By.cssSelector("a[id='d1']"));
		ele.click();
		d.navigate().back();
		d.findElement(By.cssSelector("a[name='n2']")).click();
		d.navigate().back();
		d.findElement(By.cssSelector("a[class='c1']")).click();
		d.navigate().back();
		d.findElement(By.cssSelector("a[href='https://www.jspiders.com']")).click();
	}
}
