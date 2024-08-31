package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfClick {
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.get("https://www.facebook.com/");
//click() is used to click on WebElements like (buttons, links, checkBox, radio, dropDown etc)
//click() can automatically scroll to webElements in static webPage
	d.findElement(By.linkText("Log in")).click();
}
}
