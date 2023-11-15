package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DPD {
public WebDriver driver;
	
	@DataProvider(name="testData")
	public Object[]dpMethod(){
		return new Object[][] {{ "Java" }, { "Testing" },{"Selenium"}};
	}
  @Test
  public void f() {
  }
}
