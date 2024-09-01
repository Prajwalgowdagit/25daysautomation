package Assignments1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoAppsDragAndDropMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			
			
			
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demoapps.qspiders.com/ui/dragDrop/dragToMultiple?sublist=2");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 WebElement lapTopCharger = d.findElement(By.id("dragElement1"));
 WebElement mobileCover = d.findElement(By.id("dragElement2"));
 WebElement laptopcover = d.findElement(By.id("dragElement3"));
 WebElement mobioleChager = d.findElement(By.id("dragElement4"));
 WebElement drop1 = d.findElement(By.xpath("//div[text()='Mobile Accessories']/.."));
 WebElement drop2 = d.findElement(By.xpath("//div[text()='Laptop Accessories']/.."));
 Actions a = new Actions(d);
 a.dragAndDrop(lapTopCharger, drop2).perform();
 a.dragAndDrop(laptopcover, drop2).perform();
 a.dragAndDrop(mobileCover, drop1).perform();
 a.dragAndDrop(mobioleChager, drop1).perform();
		
		
		
		
	}

}
