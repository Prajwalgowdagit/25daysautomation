package datadriven_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
Workbook wb = WorkbookFactory.create(fis);
//getLastRowNum() will return the index of the last row which is containing the data
//int count = wb.getSheet("multipleData").getLastRowNum();
//System.out.println(count);
//for(int i=0;i<=count;i++) {		//Read multiple data in vertical order
//	String un = wb.getSheet("multipleData").getRow(i).getCell(0).getStringCellValue();
//	String pwd = wb.getSheet("multipleData").getRow(i).getCell(1).getStringCellValue();
//	System.out.println("Username: "+un+" Password: "+pwd);
//}
//getLastCellNum() will return number of cells containg the data
//int count1=wb.getSheet("multipleData").getRow(0).getLastCellNum();
//System.out.println(count1);
//for(int i=0;i<12;i++) {			//Read multiple data in horizontal order
//	String data = wb.getSheet("multipleData").getRow(0).getCell(i).getStringCellValue();
//	System.out.println("Value: "+data);
//}
int count = wb.getSheet("multipleData").getLastRowNum();//Read multiple data in excel
for(int i=0;i<=count;i++) {		//It will iterate for number of rows
int count1=wb.getSheet("multipleData").getRow(i).getLastCellNum();
	for(int j=0;j<count1;j++) {//It will iterate for number of cells
		String data = wb.getSheet("multipleData").getRow(i).getCell(j).getStringCellValue();
		System.out.println(data);
	}
}
}
}