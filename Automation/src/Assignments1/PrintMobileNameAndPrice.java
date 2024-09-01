package Assignments1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintMobileNameAndPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Double> map=new HashMap<String,Double>();  
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/");
		d.findElement(By.xpath("//input[contains(@placeholder,'Search for Products')]")).sendKeys("Iphone 14 pro max"+Keys.ENTER);
		List<WebElement> name  = d.findElements(By.xpath("//div[contains(text(),'Apple iPhone')]"));
		List<WebElement> price = d.findElements(By.xpath("(//div[contains(text(),'Apple iPhone')]/../../div[2]/div[1]/div[1]/div[1])"));
	
	for(int i=0;i<name.size();i++) {
		
		String phoneName =name.get(i).getText();
		String price1= price.get(i).getText();
		System.out.println(phoneName + "          " + price1);
	}
		
	}

}
