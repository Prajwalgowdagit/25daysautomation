package demotest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.actitime.pom.LoginPage;
public class ExecutionClass {
	@Test
	public void demo() throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		LoginPage l=new LoginPage(driver);
		l.login("admin", "manager");
	}
}