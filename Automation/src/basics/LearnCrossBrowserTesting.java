package basics;

import java.util.Scanner;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearnCrossBrowserTesting {
	static WebDriver driver;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the browser name");
		String browser = s.nextLine();
		switch(browser) {
		case "chrome": driver=new ChromeDriver();break;
		case "edge":  driver=new EdgeDriver();break;
		case "firefox":driver=new FirefoxDriver();break;
		default : driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		System.out.println(jse.executeScript("return document.title"));
		driver.quit();
	}
}