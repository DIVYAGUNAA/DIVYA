package Hms;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class ML {
	public WebDriver driver;
}
	@Test
	  public void f() {
		FileInputStream fi=new FileInputStream("C:\\Users\\admin\\Desktop\\DIVYA\\datadriven excel.xlsx");  
		  Workbook wb=Workbook.getWorkbook(fi);
		  Sheet s=Workbook.getsheet("gmail");
		//Enter username,Password and click on signin by taking data from input file
			
				driver.findElement(By.name("username")).sendKeys(s.getCell(0, i).getContents());
				Thread.sleep(3000);
				driver.findElement(By.name("password")).sendKeys(s.getCell(1, i).getContents());
				Thread.sleep(3000);

				driver.findElement(By.name("submit")).click();
				Thread.sleep(5000);
		  
	  }
	
	
	  @BeforeTest
	    public void openurl() throws Exception {
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\geckodriver\\geckodriver.exe");
	    	driver = new FirefoxDriver();
	    	driver.get("https://accounts.google.com");
	    	driver.manage().window().maximize();
	    	Thread.sleep(3000);


	  @AfterTest
	  public void afterTest() {
	  }

	}
