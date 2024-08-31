package handling_dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelect {
public static void main(String[] args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.get("file:///C:/Users/QSP/Desktop/hotel.html");
	WebElement mtr = d.findElement(By.id("mtr"));
	Select s=new Select(mtr);
	Thread.sleep(2000);
	s.selectByIndex(0);Thread.sleep(2000);
	s.selectByValue("2");Thread.sleep(2000);
	s.selectByVisibleText("Dosa");Thread.sleep(2000);
	s.deselectByIndex(2);Thread.sleep(2000);
	s.deselectByVisibleText("Bisibelebath");Thread.sleep(2000);
	s.deselectByValue("1");
	s.deselectAll();
}
}
