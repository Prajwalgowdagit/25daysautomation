package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsSelected {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.opensourcebilling.org");
	driver.findElement(By.xpath("//label[@for='filled-in-box']")).click();
//isSelected() is used to check whether the element is selected or not (CheckBox & radio buttons)
	boolean res = driver.findElement(By.id("filled-in-box")).isSelected();
	if(!res) {		
		System.out.println("Checkbox is not selected");
	}else {	
		System.out.println("Checkbox is selected");
	}
}
}
