package Assignments1;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FectchingTheDataFromPropertiesFileLoginPrintPassAndFail {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file= new FileInputStream("./src/TestData/commonData.properties");
		Properties p = new Properties();
		p.load(file);
		String url = p.getProperty("url");
		System.out.println(url);

		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		d.get(url);
		FileInputStream s = new FileInputStream("./src/TestData/TestData.xlsx");
		Workbook fac = WorkbookFactory.create(s);
		int rowcount = fac.getSheet("Credentials").getLastRowNum();
	WebElement username = d.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
	WebElement password = d.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
	
	//	fac.getSheet("Credentials").getc
//		for(int i=0;i<=rowcount;i++) {
//			int lastCell = fac.getSheet("Actitime_Signin_TestCase").getRow(i).getLastCellNum();
//			for(int j=0;j<=lastCell;j++) {
//			String username1 = fac.getSheet("Credentials").getRow(i).getCell(j).getStringCellValue();
//		username.sendKeys(username1);
//		
//		}}
//		
		
		

	}

}
