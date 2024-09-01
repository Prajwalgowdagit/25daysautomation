package Assignments1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggesstionInFlipKart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/");
		d.findElement(By.xpath("//input[contains(@placeholder,'Search for Products')]")).sendKeys("Iphone 14 pro max");
		Thread.sleep(5000);
		List<WebElement> elements = d.findElements(By.xpath("//*[contains(text(),'iphone 14')]"));
		for(WebElement ele:elements) {
			System.out.println(ele.getText());
		}
		d.quit();
	}

}
