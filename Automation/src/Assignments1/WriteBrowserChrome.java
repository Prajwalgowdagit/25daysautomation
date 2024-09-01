package Assignments1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteBrowserChrome {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file= new FileInputStream("./src/TestData/commonData.properties");
		Properties p = new Properties();
		p.load(file);
		String username = p.getProperty("username");
		System.out.println(username);
		String password = p.getProperty("password");
		System.out.println(password);
		String url = p.getProperty("url");
		System.out.println(url);
		p.setProperty("Browser", "IE");
		String browser = p.getProperty("Browser");
		System.out.println(browser);
		
	}

}
