package Assignments1;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckOptionIsPresentInDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String data =sc.next();
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("file:///D:/Automation/AutomationTest/src/TestData/mvr.html");
		WebElement mtr = d.findElement(By.id("mtr"));
		Select s1 = new Select(mtr);
		Set<String> opt = new HashSet<String>();
		List<WebElement> allopts = s1.getOptions();
		for(WebElement data1 :allopts) {
			String text =data1.getText();
			
			opt.add(text);
			
		}
		if(opt.equals(data)) {
			System.out.println("option is present");
			
		}
		else {
			System.out.println("option is not present");
		}
		
	}

}
