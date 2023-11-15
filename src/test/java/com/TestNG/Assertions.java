package com.TestNG;

import org.testng.Assert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
  @Test
  public void f() {
	  
	  String str1=new String("TestNG");
	  String str2=new String("TestNG");
	  String str3=null;
	  String str4="TestNG";
	  String str5="TestNG";
	  String str6=new String("Not TestNG");
	  
	  int val1 = 5;
	  int val2 = 6;
	  
	  Assert.assertEquals(str1, str2);
	  System.out.println("Equals");
	  
	  Assert.assertNotEquals(str1, str6);
	  System.out.println("NotEquals");
	  
	  Assert.assertTrue(val1 < val2);
	  System.out.println("True");
  
	  Assert.assertFalse(val1 > val2);  
	  System.out.println("False");
	  
	  Assert.assertNull(str3);  
	  System.out.println("Null");
	  
	  Assert.assertNotNull(str1);  
	  System.out.println("NotNull");
	  
	  Assert.assertSame(str4,str5);  
	  System.out.println("Same");
	
	  Assert.assertNotSame(str1,str3);  
	  System.out.println("NotSame");
  }
  
  @Test
  public void f1() {
	  String str1=new String("TestNG");
	  String str2=new String("TestNG");
	  String str3=null;
	  String str4="TestNG";
	  String str5="TestNG";
	  String str6=new String("Not TestNG");
	  
	  int val1 = 5;
	  int val2 = 6;
	  
	  Assert.assertEquals(str1, str2);
	  System.out.println("Equals");
	  
	  Assert.assertNotEquals(str1, str6);
	  System.out.println("NotEquals");
	  
	  Assert.assertTrue(val1 < val2);
	  System.out.println("True");
  
	  Assert.assertFalse(val1 > val2);  
	  System.out.println("False");
	  
	  Assert.assertNull(str3);  
	  System.out.println("Null");
	  
	  Assert.assertNotNull(str1);  
	  System.out.println("NotNull");
	  
	  Assert.assertSame(str4,str5);  
	  System.out.println("Same");
	  Assert.assertNotSame(str1,str3);  
	  System.out.println("NotSame");
	  
	  SoftAssert softassert = new SoftAssert();
		softassert.assertNotEquals(str5, str6);
		System.out.println(str5);
	  
		
	  softassert.assertAll();
	  
  }
}


  


