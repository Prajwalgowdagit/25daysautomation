package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CustomWait {
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://online.actitime.com/fireflink2/login.do");
	d.findElement(By.id("username")).sendKeys("poojagunashekar1999@gmail.com");
	d.findElement(By.name("pwd")).sendKeys("Password@123"+Keys.ENTER);
	for(int i=0;i<1000;i++) {
		try {
			d.findElement(By.id("logoutLink")).click();
			break;
		}catch(Exception e){
			System.out.println(i);
		}
	}
}
}
