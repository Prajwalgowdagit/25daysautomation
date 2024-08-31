package methods_of_webelement;

import java.time.Duration;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificBrowser {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the partial title");
	String expectedTitle = s.nextLine();
	WebDriver d=new ChromeDriver();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	d.get("https://secure.indeed.com/");
	d.findElement(By.id("login-google-button")).click();
	d.findElement(By.id("apple-signin-button")).click();
	Set<String> allWid = d.getWindowHandles();
//	for (String wid : allWid) {
//		d.switchTo().window(wid);	//		String actualTitle = d.getTitle();
//		if(!actualTitle.contains(expectedTitle)) {			d.close();}
//	}
	Iterator<String> i = allWid.iterator();
	while(i.hasNext()) {
		String wid = i.next();
		d.switchTo().window(wid);
		String actualTitle = d.getTitle();
		if(!actualTitle.contains(expectedTitle)) {
			d.close();		}
	}
}
}
