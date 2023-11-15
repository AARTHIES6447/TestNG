package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
 

public class dataDriven {
	@Test(dataProvider = "supplier")
	  public void loginTest(String email,String password) {
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://tutorialsninja.com/demo/");
		  driver.findElement(By.xpath("//span[text()='My Account']")).click();
		  driver.findElement(By.linkText("Login")).click();
		  driver.findElement(By.id("input-email")).sendKeys(email);
		  driver.findElement(By.id("input-password")).sendKeys(password);
		  driver.findElement(By.xpath("//input[@value='Login']")).click();
		  
//		  Assert.assertTrue(driver.getTitle().equals("My Account"));
//		  driver.quit();
		  
	  }
	  
	  @DataProvider(name="supplier")
	  public Object[][] datasupplier(){
		  
		  String excelFilePath = System.getProperty("user.dir")+"\\src\\test\\resources\\TestNG.xlsx";
		  File excelFile = new File(excelFilePath);
		  FileInputStream fis = null;
		  
		  try {
			  fis = new FileInputStream(excelFile);
		  }catch(FileNotFoundException e) {
			  e.printStackTrace();
		  }
		  
		  XSSFWorkbook workBook = null;
		  try {
			  workBook = new XSSFWorkbook(fis);
		  }catch(IOException e) {
			 e.printStackTrace();
		  }
		  
		  XSSFSheet sheet = workBook.getSheet("Sheet1");
		  
		  int rowscount = sheet.getPhysicalNumberOfRows();
		  System.out.println(rowscount);
		  int colscount = sheet.getRow(0).getLastCellNum();
		  System.out.println(colscount);
		  Object[][] data = new Object[rowscount-1][colscount];
		  
		  for(int r=0;r<rowscount-1;r++) {
			  XSSFRow row = sheet.getRow(r+1);
			  
			  for(int c=0;c<colscount;c++) {
				  XSSFCell cell = row.getCell(c);
				  CellType cellType = cell.getCellType();
				  
				  switch(cellType) {
				  
				  case STRING:
					  data[r][c] = cell.getStringCellValue();
					  break;
				  }
			  }
		  }
		  return data;
		  
  }
}
