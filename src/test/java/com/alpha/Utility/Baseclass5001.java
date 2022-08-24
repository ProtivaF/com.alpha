package com.alpha.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Baseclass5001 {
	
	public static Properties prop5001;
	public static WebDriver driver;
	
	public  Baseclass5001() {
		prop5001 = new Properties();
	
	try {
		FileInputStream fls5001 = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\alpha\\configure\\configure5001.properties");
		prop5001.load(fls5001);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
 }	
	
	public void initBrowser() {
		
		String browserset5001 = prop5001.getProperty("Browser1");
		
		if(browserset5001.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\Webdriver5001\\chromedriver.exe" ); //chromedriver path
		    driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(testdata5001.pageLoadTimeout,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(testdata5001.implicitlyWait,TimeUnit.SECONDS);
			
		}
		else if(browserset5001.equals("FF"));
	 
	}
	
	public static void getURL5001(String URL) {
		driver.get(prop5001.getProperty("URL"));
	}		
	
}
