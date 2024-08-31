package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetCssValue {
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.get("https://www.fb.com/");
//getCssValue(String propertyName) is used to get property value of an element
//Since the element contains multiple properties/effects we should specify propName has parameter
//If propName is not present it will return empty spaces 
	String color = d.findElement(By.linkText("Forgotten password?")).getCssValue("color");
	System.out.println(color);
}
}
