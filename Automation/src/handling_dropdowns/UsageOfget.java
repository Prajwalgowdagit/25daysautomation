package handling_dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsageOfget {
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.get("file:///C:/Users/QSP/Desktop/hotel.html");
	WebElement slv = d.findElement(By.id("slv"));
	Select s=new Select(slv);
//getFirstSelectedOption() is used to get the first selected option in the dropdown
//If there is no selected option it will throw NSEE
	WebElement ele = s.getFirstSelectedOption();
	System.out.println(ele.getText());
//getAllSelectedOptions()  is used to get all the selected options in the multi-select dropdown
//If there is no selected options it will return Empty List
	List<WebElement> allOpt = s.getAllSelectedOptions();
	for (WebElement webEle : allOpt) {
		System.out.println(webEle.getText());
	}
//getOptions() is used to fetch all the options in the dropdown
	List<WebElement> allEle = s.getOptions();
	for (WebElement webEle : allEle) {
		System.out.println(webEle.getText());
	}
//getWrappedElement() is used to get all the options present in the dropdown
//This method will wrap all the elements into one single WebElement
	WebElement wrappedEle = s.getWrappedElement();
	System.out.println(wrappedEle.getText());
}
}
