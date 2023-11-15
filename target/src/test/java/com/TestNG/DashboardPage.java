package com.TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
	
	WebDriver driver;
	By homePageText = By.xpath("//h6[text()=\"Dashboard\"]");
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	public String getHomePageText() {
		return driver.findElement(homePageText).getText();
	}
}
