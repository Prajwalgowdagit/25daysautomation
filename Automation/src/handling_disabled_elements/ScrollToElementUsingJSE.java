package handling_disabled_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ScrollToElementUsingJSE {
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.bbc.com");
	WebElement music = d.findElement(By.xpath("//h2[text()='Music']"));
int yaxis = music.getLocation().getY();//In order to scroll to the ele we get yAxis value and we pass it to scrollTo()
	Actions a=new Actions(d);			
	a.scrollToElement(music).perform();	//Will scroll the webPage until element is visible
	JavascriptExecutor js=(JavascriptExecutor) d;
	js.executeScript("window.scrollTo(0,"+yaxis+")");//Will scroll the webPage until the element is present on the top
}
}
//window.scrollTo(0,document.documentElement.scrollHeight)-->It will scroll vertically to the last pixel of webPage
//window.scrollTo(document.documentElement.scrollWidth,0)-->It will scroll horizontally to the last pixel of webPage