package com.TestNG;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

import junit.framework.Assert;

import org.testng.annotations.BeforeTest;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class TestNGParameterizationDemo {
	public WebDriver driver;
	By userName= By.name("username");
	By passWord=By.name("password");
	By loginBtn=By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");
    By loginTitle=By.xpath("//span[@class='oxd-topbar-header-breadcrumb']");
	By errormessage=By.xpath("//p[text()='Invalid credentials']");
  @BeforeMethod
  @org.testng.annotations.Parameters("browser")
  public void ParameterizatedTest(String browser) {
	if(browser.equalsIgnoreCase("chrome")) {
		ChromeOptions options=new ChromeOptions();
		  options.addArguments("--start-maximized");
		  driver=new ChromeDriver(options);
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  System.out.println("Brower Started :"+ browser);
	  }
	  else if(browser.equalsIgnoreCase("edge")) {
		  EdgeOptions options=new EdgeOptions();
		  options.addArguments("--start-maximized");
		  driver=new EdgeDriver(options);
		  System.out.println("Brower Started :"+ browser);
	  }
  }
  @Test
  public void f() {
	  driver.findElement(userName).sendKeys("Admin");
	  driver.findElement(passWord).sendKeys("admin123");
	  
	driver.findElement(loginBtn).click();
	String newPageText = driver.findElement(loginTitle).getText();
	System.out.println("newPageText :"+ newPageText);
	Assert.assertEquals(newPageText, "Dashboard");
  }
	@Test
	  public void f1() {  
		driver.findElement(userName).sendKeys("1234");
		  driver.findElement(passWord).sendKeys("admin12jkn3");
		driver.findElement(loginBtn).click();
		String actualErrorMeassage = driver.findElement(errormessage).getText();
		System.out.println("ActualErrorMeassage :"+ actualErrorMeassage);
		Assert.assertEquals(actualErrorMeassage, "Invalid credentials");
		}

  @AfterTest
  public void afterTest() {
	  //driver.quit();
  }

}
