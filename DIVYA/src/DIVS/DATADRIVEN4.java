package DIVS;

import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class DATADRIVEN4 {
	public WebDriver driver;
  @Test(dataProvider="testdata")
  public void login(String username,String password) {
	  driver.findElement(By.name("userName")).sendKeys(username);
	  driver.findElement(By.name("password")).sendKeys(password);
	  driver.findElement(By.name("submit")).click();
//	  try {
//		  Assert.assertEquals("http://demo.guru99.com/test/newtours/index.php", driver.getCurrentUrl());
//		  System.out.println("pass");
//	} catch (Exception e) {
//		System.out.println("fail");
	}
	  
	  

  @Test @DataProvider(name="testdata")
  
  public Object[][] readExcel() throws BiffException, IOException {
	File f=new File("C:\\Users\\admin\\Desktop\\practice\\guru97-2003.xls") ; 
	Workbook w=Workbook.getWorkbook(f);
	Sheet s=w.getSheet("Sheet1");
	int rows=s.getRows();
	int columns=s.getColumns();
	System.out.println(rows);
	System.out.println(columns);
	String inputdata [] []=new String [rows] [columns];
	for (int i = 0; i < rows; i++) {
	for (int j = 0; j < columns; j++) {
	Cell c=s.getCell(j,i);
	inputdata [i][j]=c.getContents();
	System.out.println(inputdata [i][j]);
	}	
	}
	return inputdata;
	
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\geckodriver\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("http://demo.guru99.com/test/newtours/index.php"); 
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
  }

}
