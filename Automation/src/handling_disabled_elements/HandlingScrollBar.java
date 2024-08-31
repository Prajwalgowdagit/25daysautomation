package handling_disabled_elements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBar {
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.bbc.com/");
	JavascriptExecutor js=(JavascriptExecutor) d;
	js.executeScript("window.scrollTo(0,2000)");//It will scroll to exactly 2000 pixels from 0 pixels
	js.executeScript("window.scrollBy(0,3000)");//It will scroll for 3000 from current position of scrollbar i,e.,5000
	}
}