package com.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
	
	@FindBy(name = "username")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement login;
	
	@FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")
	WebElement title;
 
	public LoginPage() {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void setUserName(String strUsername) {
		username.sendKeys(strUsername);
	}
	
	public void setPassword(String strPassword) {
		password.sendKeys(strPassword);
	}
	public void clickLogin() {
		login.click();
	}
	//public String getLoginTitle() {
		//return titleText.getText();
		
	//}
	
	public void login(String strUserName,String strPassword) {
		
        this.setUserName(strUserName);
		
		this.setPassword(strPassword);
		
		this.clickLogin();
	}
	

}
