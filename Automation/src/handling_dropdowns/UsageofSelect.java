package handling_dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsageofSelect {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Create new account")).click();
	WebElement month = driver.findElement(By.id("month"));
	Select s=new Select(month);
//selectByIndex(int index) is used to select the option based on the mentioned index,
//index starts from 0
	s.selectByIndex(7);
//selectByValue(String value) is used to select the option based on the mentioned value present 
//in <option> tag of the element
	s.selectByValue("1");
//selectByVisibleText(String text)is used to select the opt which is having the mentioned tagtext
	s.selectByVisibleText("Dec");
//	WebElement ele = s.getFirstSelectedOption();
//	System.out.println(ele.getText());
	List<WebElement> allOpt = s.getOptions();
	for (WebElement ele1 : allOpt) {
		System.out.println(ele1.getText());
	}
	driver.quit();
}
}
