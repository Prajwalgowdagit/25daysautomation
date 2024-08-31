package interview_qns;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnteringTextIntoTextBoxWithoutFindelement {
public static void main(String[] args) {
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.google.com");
//This statement is used transfer the control to active element and return the address of the element
	WebElement ele = d.switchTo().activeElement();
	ele.sendKeys("Olympics");
}
}
