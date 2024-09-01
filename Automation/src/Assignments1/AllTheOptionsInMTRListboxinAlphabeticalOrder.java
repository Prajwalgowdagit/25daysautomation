package Assignments1;


import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllTheOptionsInMTRListboxinAlphabeticalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("file:///D:/Automation/AutomationTest/src/TestData/mvr.html");
		WebElement mtr = d.findElement(By.id("mtr"));
		Select s1 = new Select(mtr);
		ArrayList<String> opt = new ArrayList<>();
	List<WebElement> allopts = s1.getOptions();
	for(WebElement data :allopts) {
		String text =data.getText();
		opt.add(text);
		
	}

	System.out.println("before");
	System.out.println(opt);
	Collections.sort(opt);
	System.out.println("After");
	System.out.println(opt);
	d.quit();
		
	}

}
