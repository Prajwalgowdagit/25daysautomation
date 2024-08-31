package demotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSERE {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/QSP/Desktop/A.html");
	//WE are finding the element storing it in link reference variable(@01)
	WebElement link = driver.findElement(By.tagName("a"));
	//If we refresh the same page also address will be changed
	driver.navigate().refresh();
	//Once after the page will be reloaded, address will be changed to(@02) in the webPage
	link.click();
//	driver.navigate().back();
//	link.click();
}
}
