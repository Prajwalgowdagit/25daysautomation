package demotest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Spotify {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://open.spotify.com/");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		driver.findElement(By.id("login-username")).sendKeys("kavanachandru292@gmail.com");
		driver.findElement(By.id("login-password")).sendKeys("Kavana2910");
		driver.findElement(By.xpath("//span[text()='Log In']")).click();Thread.sleep(2000);
		WebElement popularAlbums = driver.findElement(By.linkText("Popular artists"));
		Actions a=new Actions(driver);Thread.sleep(2000);
		a.scrollToElement(popularAlbums).perform();Thread.sleep(2000);
WebElement album = driver.findElement(By.xpath("(//section[@aria-label='Popular albums']/div[2]//span[text()])[1]"));
		a.contextClick(album).perform();Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Add to playlist']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='New playlist']")).click();Thread.sleep(2000);
		WebElement addedAlbum = driver.findElement(By.xpath("(//li[@role='listitem'])[4]"));
		a.contextClick(addedAlbum).perform();Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Edit details']")).click();Thread.sleep(2000);
		WebElement addNameTbx = driver.findElement(By.xpath("//input[@placeholder='Add a name']"));
		addNameTbx.clear();
		addNameTbx.sendKeys("Sajni");Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Save']")).click();Thread.sleep(2000);
		a.contextClick(addedAlbum).perform();Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Delete']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		driver.findElement(By.xpath("//button[@data-testid='user-widget-link']")).click();
		driver.findElement(By.xpath("//span[text()='Log out']")).click();
		driver.manage().window().minimize();
		driver.quit();
	}
}
