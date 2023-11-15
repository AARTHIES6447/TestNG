package com.TestNG;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class DashboardPageTests extends BaseTest {
	LoginPage objLogin;
	DashboardPage objDashboardPage;
	
  @Test(priority = 1)
  public void DashboardTest() {
	  objLogin = new LoginPage(driver);
	  objLogin.login("Admin","admin123");
	  objDashboardPage = new DashboardPage(driver);
	  Assert.assertTrue(objDashboardPage.getHomePageText().contains("Dashboard"));
  }
}
