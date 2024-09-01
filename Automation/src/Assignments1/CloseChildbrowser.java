package Assignments1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver d = new ChromeDriver();
		 d.manage().window().maximize();
	     d.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(0));
	     d.get("https://secure.indeed.com");
	String ActualWindowId =  d.getWindowHandle();
	     d.findElement(By.id("login-google-button")).click();
	     d.findElement(By.id("apple-signin-button")).click();
	 Set<String> wids =  d.getWindowHandles();
	 for(String w:wids) {
		 d.switchTo().window(w);
		 if(!w.equals(ActualWindowId))
		 {
			 d.close();
		 }
	 }
		
	 
		
	}
	

}
