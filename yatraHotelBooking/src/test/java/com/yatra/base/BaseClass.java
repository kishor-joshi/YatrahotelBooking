package com.yatra.base;


import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	protected WebDriver driver;
/**
 * select driver class type
 * 
 * @param selecteddriver
 * @throws IOException
 */
	
	@Parameters("selecteddriver")
	@BeforeClass
	public void setBrowser(String selecteddriver) throws IOException {
		
		
		switch (selecteddriver) {
		
		case "chrome":
			
			System.setProperty("webdriver.chrome.driver", "./libs/chromedriver.exe");
			driver = new ChromeDriver();
			break;
			
		case "firefox":
			
			System.setProperty("webdriver.gecko.driver", "./libs/geckodriver.exe");
			driver = new FirefoxDriver();
			break;
			
		case "ie":
			
			System.setProperty("webdriver.ie.driver", "./libs/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;
		}
	}
	

}
