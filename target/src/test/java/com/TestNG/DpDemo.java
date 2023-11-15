package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DpDemo {
public WebDriver driver;
	
//	@DataProvider(name="testData")
//	public Object[]dpMethod(){
//		return new Object[][] {{ "Java" }, { "Testing" }};
//	}
	@BeforeMethod
	public void setUp() {
		System.out.println("Start the test");
		driver= new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
	}
	
  @Test(dataProvider = "testData", dataProviderClass = DPD.class)
  public void f(String keyword) {
	  WebElement aa = driver.findElement(By.id("sb_form_q"));
	  aa.sendKeys(keyword);
	  System.out.println("keyword entered is : "+ keyword);
	  aa.sendKeys(Keys.ENTER);
	  System.out.println("Search result is displayed");
	  
   }
}
