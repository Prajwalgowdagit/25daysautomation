package handling_popups;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingFileUploadPopup {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("file:///C:/Users/QSP/Desktop/Naukri.html");
		File f=new File("./data/Resume.docx");
		String absPath = f.getAbsolutePath();
		d.findElement(By.id("resume")).sendKeys(absPath);		
//		d.findElement(By.id("resume")).sendKeys("C:\\Users\\QSP\\Desktop\\Resume.docx");
	}
}