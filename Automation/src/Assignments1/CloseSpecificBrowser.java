package Assignments1;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
System.out.println("enter the partial title");
String ExpectedTitle = s.nextLine();
		WebDriver d = new ChromeDriver();
		 d.manage().window().maximize();
	     d.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(0));
	     d.get("https://secure.indeed.com");
		 d.findElement(By.id("login-google-button")).click();
	     d.findElement(By.id("apple-signin-button")).click();
	 Set<String> wids =  d.getWindowHandles();
	 for( String id:wids) {
		 d.switchTo().window(id);
	String actual =	 d.getTitle();
		 if(actual.contains(ExpectedTitle)) {
			 d.close();
		 }
	 }
	}

}
