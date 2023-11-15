package com.TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Ninja {
	public WebDriver driver;
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	Actions act = new Actions(driver);
	SoftAssert softassert = new SoftAssert();
	
  @BeforeTest
  public void beforeTest() {
	  ChromeOptions Options = new ChromeOptions();
	    driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
	   }
  @Test
  public void f1() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://tutorialsninja.com/demo/");
	  WebElement aa = driver.findElement(By.xpath("//a[@title='My Account']"));
	  aa.click();
	  WebElement bb = driver.findElement(By.xpath("//a[text()='Register']"));
	  bb.click();
	  WebElement cc = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	  cc.sendKeys("Aarthi");
	  WebElement dd = driver.findElement(By.xpath("//input[@id='input-lastname']"));
	  dd.sendKeys("K");
	  WebElement ee = driver.findElement(By.xpath("//input[@placeholder='E-Mail']"));
	  ee.sendKeys("aarthi@gamail.com");
	  WebElement ff = driver.findElement(By.xpath("//input[@id='input-telephone']"));
	  ff.sendKeys("9324536776");
	  WebElement gg = driver.findElement(By.xpath("//input[@id='input-password']"));
	  gg.sendKeys("Aarthi@123");
	  WebElement hh = driver.findElement(By.xpath("//input[@id='input-confirm']"));
	  hh.sendKeys("Aarthi@123");
	  WebElement ii = driver.findElement(By.xpath("//input[@type='checkbox']"));
	  ii.click();
	  WebElement jj = driver.findElement(By.xpath("//input[@type='submit']"));
	  jj.click();
	 // softassert.assertAll();
  }
 @Test
  public void f2() {
	  
	 driver.findElement(By.xpath("//a[@title='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("aarthi@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Aarthi@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("Login Successful");
	}
 @Test(dependsOnMethods = "f1")
 public void f3() {
	 driver.findElement(By.xpath("//a[text()='Components']")).click();
		driver.findElement(By.xpath("//a[text()='Monitors (2)']")).click();
		Assert.assertEquals("Monitors (2)", driver.findElement(By.xpath("//a[text()='Monitors (2)']")).getText());
		driver.findElement(By.xpath("//button[@data-original-title='Add to Wish List'][1]")).click();
	
 }
 @Test
 public void f4() {
	 WebElement wishList = driver.findElement(By.xpath("//span[text()='Wish List (1)']"));
		wishList.click();
		Assert.assertNotNull(wishList);
		driver.findElement(By.xpath("//a[@data-original-title='Remove']")).click();
	}
	 

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
