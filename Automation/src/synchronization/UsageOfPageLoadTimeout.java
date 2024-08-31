package synchronization;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class UsageOfPageLoadTimeout {
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
	d.get("https://www.fb.com");
	}
}