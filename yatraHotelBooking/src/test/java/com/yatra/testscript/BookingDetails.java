package com.yatra.testscript;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.yatra.base.BaseClass;

public class BookingDetails extends BaseClass {
	

	@Test(priority=1)
	public void bookingDateDetails() throws IOException, InterruptedException {
		
	    FileInputStream input = new FileInputStream(".\\src\\test\\resources\\locators\\locators.properties");
	    Properties  prop = new Properties();
	    prop.load(input);
	    driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		driver.findElement(By.xpath(prop.getProperty("selecthotel"))).click();
		driver.findElement(By.id(prop.getProperty("placeid"))).clear();
		driver.findElement(By.xpath(prop.getProperty("placetext"))).click();
		Thread.sleep(3000);
		driver.findElement(By.id(prop.getProperty("placeid"))).sendKeys("Bangalore");
		
		driver.findElement(By.xpath(prop.getProperty("selectdropdown"))).click();
		driver.findElement(By.xpath(prop.getProperty("calender"))).click();
		driver.findElement(By.id(prop.getProperty("checkin"))).click();
	    driver.findElement(By.id(prop.getProperty("checkout"))).click();
	    
	    driver.findElement(By.xpath(prop.getProperty("travellerdetails"))).click();
	    driver.findElement(By.xpath(prop.getProperty("adultbuttonplus"))).click();
	   // driver.findElement(By.xpath("(//span[@class='ddSpinnerMinus'])[1]")).click();
	    //driver.findElement(By.xpath("(//span[@class='ddSpinnerMinus'])[2]")).click();
	    driver.findElement(By.xpath(prop.getProperty("addroom"))).click();
	    driver.findElement(By.xpath(prop.getProperty("searchhotelbutton"))).click();
	    WebDriverWait wait = new WebDriverWait(driver, 20);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("clickonimage")))).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Star Rating')]")).click();
	    List<WebElement>ratinglist= driver.findElements(By.xpath(prop.getProperty("filterbystarrating")));
	 
		 
		 
		 
	      
	}
}
