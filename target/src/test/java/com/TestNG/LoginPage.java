package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	
	By userName= By.name("username");
	By passWord=By.name("password");
	By titleText=By.xpath("//h5[text()='Login']");
	By login=By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");
	public LoginPage(WebDriver driver) {
			this.driver = driver;
		}
	public void setUserName(String strUserName) {
		driver.findElement(userName).sendKeys(strUserName);
	}
	public void setPassword(String strPassword) {
		driver.findElement(passWord).sendKeys(strPassword);
	}
	public void clickLogin() {
		driver.findElement(login).click();
	}
	public String getLoginTile() {
		return driver.findElement(titleText).getText();
	}
	public void login(String strUserName,String strPassword ) {
		this.setUserName(strUserName);
		this.setPassword(strPassword);
		this.clickLogin();
		
	
	}
	
}
