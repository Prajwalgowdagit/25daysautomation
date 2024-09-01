package Assignments1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class HoverMouseOnMyntra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://myntra.com");
		Actions a = new Actions(driver);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='desktop-navLink']"));
		for (WebElement ele : list) {
			a.moveToElement(ele).pause(1000).perform();
		}
		
	}

}
