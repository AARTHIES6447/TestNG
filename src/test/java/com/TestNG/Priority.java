package com.TestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Priority {
	@Test(priority=4, enabled=true,groups="groupA")

	  public void first() {
		  System.out.println("First");

	  }
	  @Test(priority=3, enabled=false,groups = {"demo","demo1"})//{ is for multiple groups
	  public void second() {
		  System.out.println("second");

	  }
	  
	  @Test(priority=2, enabled=true)

	  public void third() {
		  System.out.println("Third");
	  }
	  @Test(priority=1, enabled=false,dependsOnGroups="groupA")

	  public void fourth() {
		  System.out.println("Fourth");
	 
	  }
}
