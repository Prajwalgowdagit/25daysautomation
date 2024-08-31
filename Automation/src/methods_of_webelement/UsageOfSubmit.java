package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSubmit {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fb.com/");
		//submit() is used to click on elements which is having type='submit' in the HTML
		driver.findElement(By.name("login")).submit();
	}
}