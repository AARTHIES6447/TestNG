package com.TestNG;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class LoginTests extends BaseTest {
	LoginPage objLogin;
	
  @Test(priority = 0)
  public void loginTest() {
	  
	  objLogin = new LoginPage(driver);
	  String loginPageTile = objLogin.getLoginTile();
	  Assert.assertTrue(loginPageTile.contains("Login"));
  }
}
