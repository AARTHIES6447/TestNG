package com.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class NewTest {
	public WebDriver driver;
  @BeforeTest
  public void beforeTest() {
	  ChromeOptions Options = new ChromeOptions();
	    driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
  }
  @Test
  public void f() {
	  WebElement aa = driver.findElement(By.id("twotabsearchtextbox"));
	  aa.sendKeys("hard drive",Keys.ENTER);
  }
  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
