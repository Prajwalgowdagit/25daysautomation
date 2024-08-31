package handling_disabled_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisabledTextBox {
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("file:///C:/Users/QSP/Desktop/disabled.html");
//	WebElement t1 = d.findElement(By.id("t1"));
//	WebElement t2 = d.findElement(By.id("t2"));
//	boolean res = t1.isEnabled();
//	boolean res2 = t2.isEnabled();
//	System.out.println(res);	//True
//	System.out.println(res2);	//False
//	t1.sendKeys("Virat");
//	JavascriptExecutor js=(JavascriptExecutor) d;
//	js.executeScript("document.getElementById('t2').value='Sachin'");//In order to enter text in disabled textbox
//	js.executeScript("document.getElementById('t2').value=''");//In order to clear the text in disabled textbox
//	js.executeScript("document.getElementById('t2').click()");//In order to click on disabled button
	List<WebElement> allTBs = d.findElements(By.tagName("input"));
	for (WebElement ele : allTBs) {
		boolean res = ele.isEnabled();
		if(res==true) {
			ele.sendKeys("Virat");
		}else {
			JavascriptExecutor js=(JavascriptExecutor) d;
			String id = ele.getAttribute("id");//Since we cannot hardcode the id we need to get the value from element
			js.executeScript("document.getElementById('"+id+"').value='Sachin'");
		}
	}
	
}
}





