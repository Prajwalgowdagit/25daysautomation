package Assignments1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitlewithoutGetTitleMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver d = new ChromeDriver();
	d.get("https://www.google.com/");
	JavascriptExecutor js = (JavascriptExecutor)d;	
	System.out.println(js.executeScript("return document.title"));
	String url = (String)js.executeScript("return document.URL");
	System.out.println(url);
	d.close();
	}

}
