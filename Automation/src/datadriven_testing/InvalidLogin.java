package datadriven_testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLogin {
public static void main(String[] args) throws IOException, InterruptedException {
	FileInputStream fis=new FileInputStream("./data/commondata.properties");
	Properties p=new Properties();					p.load(fis);
	String url = p.getProperty("url");			FileInputStream fis1=new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis1);
	WebDriver d=new ChromeDriver();			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	d.get(url);					int count = wb.getSheet("invalidLogin").getLastRowNum();
//	for(int i=0;i<=count;i++) {
//		String un = wb.getSheet("invalidLogin").getRow(i).getCell(0).getStringCellValue();
//		String pwd = wb.getSheet("invalidLogin").getRow(i).getCell(1).getStringCellValue();
//		d.findElement(By.id("username")).sendKeys(un);
//		d.findElement(By.name("pwd")).sendKeys(pwd);
//		d.findElement(By.xpath("//div[text()='Login ']")).click();Thread.sleep(2000);
//		WebElement errorMsg = d.findElement(By.tagName("span"));
//		if(!errorMsg.isDisplayed()) {
//			d.findElement(By.id("logoutLink")).click();
//			wb.getSheet("invalidLogin").getRow(i).getCell(2).setCellValue("Pass");
//		}else {
//			wb.getSheet("invalidLogin").getRow(i).getCell(2).setCellValue("Fail");	}	}
//	FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
//	wb.write(fos);		d.quit();
	for(int i=1;i<=count;i++) {
		String un = wb.getSheet("InvalidLogin").getRow(i).getCell(0).getStringCellValue();
		String pwd = wb.getSheet("InvalidLogin").getRow(i).getCell(1).getStringCellValue();
		d.findElement(By.id("username")).sendKeys(un);
		d.findElement(By.name("pwd")).sendKeys(pwd);
		d.findElement(By.xpath("//div[text()='Login ']")).click();
		try {
			d.findElement(By.id("logoutLink")).click();
			wb.getSheet("InvalidLogin").getRow(i).getCell(2).setCellValue("Pass");
		}catch(NoSuchElementException exc) {
			wb.getSheet("InvalidLogin").getRow(i).getCell(2).setCellValue("Fail");
		}
		}
	FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
	wb.write(fos);
}
}
