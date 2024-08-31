package datadriven_testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class HandlingPropertyFile {
public static void main(String[] args) throws IOException   {
//Converting the data into java understandable language(Stream of bytes)==>HighLevel to Low Level
	FileInputStream fis=new FileInputStream("./data/commondata.properties");
//In order to retrieve data from property file we need to use NSM's of Properties class
	Properties p=new Properties();
//We are loading the data from fis into empty properties object 
	p.load(fis);
//In order to fetch the data from property object we use getProperty(String key) which takes
//keyName as argument and returns String Value of the specified key
	String url = p.getProperty("url");
	String un = p.getProperty("username");
	String pwd = p.getProperty("password");
	System.out.println(url);
	System.out.println(un);
	System.out.println(pwd);
	}
}
