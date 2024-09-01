package Assignments1;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class FrameAssignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt= new ChromeOptions();
		
	   WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.hdfcbank.com/");
		Actions a = new Actions(driver);
		WebElement login = driver.findElement(By.xpath("//button[text()='Login']"));
		a.moveToElement(login).build().perform();
		
		driver.findElement(By.linkText("NetBanking")).click();
		
		Set<String> allWid1 = driver.getWindowHandles();
		for (String wid1 : allWid1) {
			driver.switchTo().window(wid1);
		}
		
		WebElement frame = driver.findElement(By.name("login_page"));
		driver.switchTo().frame(frame);
		driver.findElement(By.partialLinkText("Know")).click();
		
		Set<String> allWid2 = driver.getWindowHandles();
		for (String wid2 : allWid2) {
			driver.switchTo().window(wid2);
		}
		
		List<WebElement> languages = driver.findElements(By.xpath("//p[contains(text(),'Secure Banking Guide in your preferred language')]/a"));
		for (WebElement ele : languages) {
			System.out.println(ele.getText());
		}
		driver.quit();
		
	}
	}


