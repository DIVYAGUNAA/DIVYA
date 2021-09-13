package DIVS;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class facebook_DATADRIVEN {
	public WebDriver driver;
	  @Test
	  public void f() throws IOException, InterruptedException {
		  
		  FileInputStream fi=new FileInputStream("C:\\Users\\admin\\Desktop\\facebook_datadriven.xlsx");
		  XSSFWorkbook workbook=new XSSFWorkbook(fi);
		  XSSFSheet sheet=workbook.getSheet("sheet1");
		  
		  int rowcount=sheet.getLastRowNum();
			System.out.println(rowcount);

	//int columncount=sheet.getDefaultColumnWidth();
//	     System.out.println(columncount);
			
	for (int i =1; i <= rowcount;i++) {
		 XSSFRow row=sheet.getRow(i);
		 
			//String email= row.getCell(0).getStringCellValue();
			//int password= (int) row.getCell(1).getNumericCellValue();
		  driver.findElement(By.xpath("//*[text()='English (UK)']")).click();
		  driver.findElement(By.name("email")).sendKeys(row.getCell(0).getStringCellValue());
		  int password= (int) row.getCell(1).getNumericCellValue();
		  driver.findElement(By.name("pass")).sendKeys(String.valueOf(password));//handling any no.kind of password(or)mobile we will use this
		  driver.findElement(By.name("login")).click();
		  
		  sheet.getRow(2).createCell(2).setCellValue("pass");
		  sheet.getRow(1).createCell(2).setCellValue("pass");
		   //result printing
		//Create the result file under the result folder	  
		  FileOutputStream fos = new FileOutputStream("C:\\Users\\admin\\Desktop\\facebook_datadriven.xlsx");
		  workbook.write(fos);
//		  fi.close();
//		  fos.close();
//		  workbook.close();	  
		  
		  Thread.sleep(1000);
		 // driver.get("https://www.facebook.com/login");
		  
	}
		  
	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\geckodriver\\geckodriver.exe");
		  driver=new FirefoxDriver();
		  driver.get("https://www.facebook.com/login"); 
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
	  }

	  @AfterTest
	  public void afterTest() {
	  }
	  
	}
