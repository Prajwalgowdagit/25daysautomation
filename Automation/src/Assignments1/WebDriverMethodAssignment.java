package Assignments1;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String actualTitle = "Login • Instagram";
		String actualUrl = "https://www.instagram.com/accounts/login/?hl=en";
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		Dimension dim = new Dimension(600, 800);
		d.manage().window().setSize(dim);
		d.get("https://www.facebook.com/");
		d.navigate().to("https://www.instagram.com/accounts/login/?hl=en");
		d.navigate().back();
		d.navigate().refresh();
		d.navigate().forward();
		if((actualTitle.equalsIgnoreCase(d.getTitle()))&& (actualUrl.equalsIgnoreCase(d.getCurrentUrl()))) {
			System.out.println("You are at correct page");
		}
		else
		{
			System.out.println("you are at wrong page");
		}
		d.manage().deleteAllCookies();
		d.manage().window().minimize();
		d.quit();
		
	}

}
