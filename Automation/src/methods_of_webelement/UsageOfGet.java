package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGet {
public static void main(String[] args) {
WebDriver d=new ChromeDriver();
d.get("https://www.facebook.com/");
WebElement ele = d.findElement(By.name("login"));
//getTagName() is used to fetch the tagName of webElement
String tagName = ele.getTagName();
//getText() is used to get the tagText of an element
//If tagText is not present it will return empty spaces
String text = ele.getText();
//getAttribute(String attName) is used to get attribute value of an element
//Since the element contains multiple attributes we should specify attName has parameter
//If attribute is not present it will return null 
String value =ele.getAttribute("type");
System.out.println("The tagname of the element: "+tagName);
System.out.println("The tagtext of the element: "+text);
System.out.println("The attribute value of the element: "+value);
}
}
