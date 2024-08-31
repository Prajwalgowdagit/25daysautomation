package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfClear {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://demo.opensourcebilling.org");
		WebElement tbx = d.findElement(By.id("email"));
//clear() is used to clear the pre-defined text present in a textbox
		tbx.clear();
	}
}