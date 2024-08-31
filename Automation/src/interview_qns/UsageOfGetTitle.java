package interview_qns;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class UsageOfGetTitle {
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.google.com");
		JavascriptExecutor js = (JavascriptExecutor) d;
		System.out.println(js.executeScript("return document.title"));
		String url = (String) js.executeScript("return document.URL");
		System.out.println(url);
	}
}
