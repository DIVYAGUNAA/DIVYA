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
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class DATADRIVEN3 {
	public WebDriver driver;
	
	 @Test
		  public void f() throws InterruptedException, IOException {
			  //File src=new File("\"C:\\Users\\admin\\Desktop\\practice\\guru99tours.xlsx\"");
			  FileInputStream fi=new FileInputStream("C:\\Users\\admin\\Desktop\\practice\\guru99tours.xlsx");
			  XSSFWorkbook workbook=new XSSFWorkbook(fi);
			  XSSFSheet sheet=workbook.getSheet("sheet1");
			  
			  int rowcount=sheet.getLastRowNum();
				System.out.println("total rows are"+rowcount);

		       int columncount=sheet.getDefaultColumnWidth();
		           System.out.println(columncount);
				
		for (int i =1; i <= rowcount;i++) {
			 XSSFRow row=sheet.getRow(i);
			  {
				
			
			 
			    //String email= row.getCell(0).getStringCellValue();
				//int password= (int) row.getCell(1).getNumericCellValue();
			  driver.findElement(By.name("userName")).sendKeys(row.getCell(0).getStringCellValue());
			  driver.findElement(By.name("password")).sendKeys(row.getCell(1).getStringCellValue());
			  driver.findElement(By.name("submit")).click();
			
//					boolean LoginSuccessfully=true;
//					if (LoginSuccessfully) {
//						System.out.println("Login Successfully is there");
//					} else {
//						System.out.println("Login Successfully is not there");}

		     
//			  String message1=driver.findElement(By.xpath("//h3['Login Successfully']")).getText();  
//				if (message1.equalsIgnoreCase("Login Successfully")) {
//				sheet.getRow(i).createCell(2).setCellValue("pass");	
//				} else {
//					sheet.getRow(i).createCell(2).setCellValue("fail");	
//			  driver.close();
			  
			  
//			  try {
//				  Assert.assertEquals("http://demo.guru99.com/test/newtours/index.php", driver.getCurrentUrl());
//				  System.out.println("pass");
//			} catch (Exception e) {
//				System.out.println("fail");
//			}
			  
			  
			  
			  
//			  Thread.sleep(4000);
//			  sheet.getRow(1).createCell(2).setCellValue("pass");
//			  sheet.getRow(2).createCell(2).setCellValue("pass");
//			  sheet.getRow(3).createCell(2).setCellValue("pass");
//			  sheet.getRow(4).createCell(2).setCellValue("fail");
//			  sheet.getRow(5).createCell(2).setCellValue("pass");
			   //result printing
			//Create the result file under the result folder	  
//			  FileOutputStream fos = new FileOutputStream("C:\\Users\\admin\\Desktop\\practice\\guru99tours.xlsx");
//			  workbook.write(fos);
//			  fos.close();
			
			  String url=driver.getCurrentUrl();	
				if (url. equals("http://demo.guru99.com/test/newtours/login_sucess.php")) {
				System.out.println("Login Successfully is there-pass");	
				}
				else {
					System.out.println("Login Successfully is not there-fail");
			  
					
					 
			  
		}        
				FileOutputStream fos = new FileOutputStream("C:\\Users\\admin\\Desktop\\practice\\guru99tours.xlsx");
				  workbook.write(fos);
				 // fos.close();
		  
				 
		}
			  driver.get("http://demo.guru99.com/test/newtours/index.php");
		}}
		
			  
		  
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
