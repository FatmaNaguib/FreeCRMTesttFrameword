 package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {

 public  static WebDriver driver;
public static   Properties Properties;
 
 
	public TestBase() throws IOException{
		
		  Properties = new Properties();
		 FileInputStream confgFile = new FileInputStream("D:\\My Projects\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\config\\confg.properties");
		Properties.load(confgFile);
		
	}

	public static void initialization() {
		String browserName =	Properties.getProperty("browser");
		if (browserName.equals("chrome")) {
			
				driver = new ChromeDriver();
			
		}else if (browserName.equals("firefox")) {
			
			driver = new FirefoxDriver();
		
	}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLACIT_WAIT));
			
			driver.get(Properties.getProperty("url"));
	}
}
