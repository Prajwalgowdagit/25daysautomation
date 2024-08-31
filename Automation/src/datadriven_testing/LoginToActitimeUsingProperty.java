package datadriven_testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToActitimeUsingProperty {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./data/commondata.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String url = pobj.getProperty("url");
		String un = pobj.getProperty("username");
		String pwd = pobj.getProperty("password");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get(url);
		d.findElement(By.id("username")).sendKeys(un);
		d.findElement(By.name("pwd")).sendKeys(pwd);
		d.findElement(By.xpath("//div[text()='Login ']")).click();

	}
}
