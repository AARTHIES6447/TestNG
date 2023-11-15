package com.Travelguru;

import org.testng.annotations.Test;

import com.TestNG.DashboardPage;
import com.TestNG.LoginPage;

public class TravelguruTest extends BaseTest{
	TravelGuru  objTravelGuru;
  
	@Test(priority = 1)
  public void TravelGuruTest() {
		objTravelGuru = new TravelGuru(driver);
	    objTravelGuru.login("Aarthi","Kumaresan","9159146397","aarthikumaresan75@gmail.com","Aarthi@123","Aarthi@123");
  }
}
