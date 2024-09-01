package Assignments1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver d = new ChromeDriver();
d.get("https://www.facebook.com/");
WebElement email =d.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
email.sendKeys("Password"+Keys.CONTROL+"A"+"C");
 WebElement pass= d.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
pass.sendKeys(Keys.CONTROL+"V");
email.clear();
pass.clear();
WebElement password = d.findElement(By.id("passContainer"));
int eh = email.getSize().getHeight();
int ew = email.getSize().getWidth();
int ph = password.getSize().getHeight();
int pw= password.getSize().getWidth();
if((eh==ph)&&(ew==pw)) {
	System.out.println("two text sizes are same");
}
else {
	System.out.println("they are not same");
}
String tagNameOfEmail= email.getTagName();


		
		
		
	}
	

}
