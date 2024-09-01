package Assignments1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimePritnAllHeaderIndescensingOrderWithOutLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://online.actitime.com/fireflink2/login.do");
		d.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("poojagunashekar1999@gmail.com");
		d.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("Password@123");
		d.findElement(By.xpath("//div[text()='Login ']")).click();
		d.findElement(By.xpath("//div[@onclick=\"openHelpAndSupportMenu(event)\"]")).click();
		d.findElement(By.linkText("About your actiTIME")).click();
		d.findElement(By.linkText("Read Service Agreement")).click();
		Set<String> wids = d.getWindowHandles();
		for(String wid : wids) {
			d.switchTo().window(wid);
		}
		List<WebElement> allHaeders = d.findElements(By.xpath("//h2"));
		ListIterator<WebElement> data = allHaeders.listIterator(allHaeders.size());
		
		//List<WebElement> print = new ArrayList<>();
		while(data.hasPrevious());
		{
			
		WebElement data1 = data.previous();
			System.out.println(data1.getText());
		}

	}

}
