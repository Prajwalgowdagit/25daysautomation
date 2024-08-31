package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetLoc_Size {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Create new account")).click();Thread.sleep(2000);
	WebElement firstnameTbx = driver.findElement(By.name("firstname"));
	WebElement lastnameTbx = driver.findElement(By.name("lastname"));
//getLocation() is used to get the location of an element (X axis and Y axis values)
	Point loc = firstnameTbx.getLocation();	int x1 = loc.getX();	int y1 = loc.getY();
//getSize() is used to get the size of an element (height and width )
	Dimension size = firstnameTbx.getSize();int h1 = size.getHeight();	int w1 = size.getWidth();
	int y2 = lastnameTbx.getLocation().getY();
	int h2 = lastnameTbx.getSize().getHeight();	int w2 = lastnameTbx.getSize().getWidth();
	if(y1==y2&&h1==h2&&w1==w2) {
System.out.println("Pass: Both elements are properly aligned and are of same size");
	}else {
System.out.println("Fail: Both elements are not properly aligned and are of not same size");
	}
//getRect() is used to get both size and location of an element
	Rectangle r = lastnameTbx.getRect();
	System.out.println(r);
	System.out.println(x1);
}
}
