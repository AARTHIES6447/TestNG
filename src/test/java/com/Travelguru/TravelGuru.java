package com.Travelguru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TravelGuru {
	WebDriver driver;
	Actions action = new Actions(driver);
	
	@FindBy(xpath="(//a[@class='dropdown-toggle'])[3]")
	WebElement MyAccount;
    
	@FindBy(xpath="//li[@class='simple-dropdown login-li clearfix']")
	WebElement SignUp;
	
	@FindBy(xpath = "//input[@id='fname']")
	WebElement firstname;
	
	@FindBy(xpath = "//input[@id='lname']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@id='mobile']")
	WebElement Number;
	
	@FindBy(xpath="//input[@id='emailId']")
	WebElement Email;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(id="cpassword")
	WebElement confirm;
	
	@FindBy(name="confirmPassword")
	WebElement Register;
	
	@FindBy(id="home-page-link")
	WebElement GoToPage;
	
	public TravelGuru(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	public void getMyAccount() {
		action.moveToElement(MyAccount).build().perform();
	}
	public void getSignUp() {
		SignUp.click();
	}
	
		public void setfirstname(String strfirstname) {
			firstname.sendKeys(strfirstname);
				}
		public void setlastname(String strlastname) {
			lastname.sendKeys(strlastname);
		}
		public void setNumber(String strNumber) {
			Number.sendKeys(strNumber);
		}
		public void setEmail(String strEmail) {
			Email.sendKeys(strEmail);
		}
		public void setpassword(String strpassword) {
			password.sendKeys(strpassword);
		}
		public void setconfirm(String strconfirm) {
			confirm.sendKeys(strconfirm);
		}
		public void getRegister(String strRegister) {
			Register.click();
		}
		public void getGoToPage(String strGoToPage) {
			GoToPage.click();
		}
		public void login(String strfirstname,String strlastname,String strNumber,String strEmail,String strpassword,String strconfirm) {
			this.setfirstname(strfirstname);
			this.setlastname(strlastname);
			this.setNumber(strNumber);
			this.setEmail(strEmail);
			this.setpassword(strpassword);
			this.setconfirm(strconfirm);
			Register.click();
			GoToPage.click();
			}
}
