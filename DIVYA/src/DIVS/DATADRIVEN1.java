package DIVS;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class DATADRIVEN1 {
	public WebDriver driver;
	public String str;
	@Test
	  public void f() throws BiffException, IOException, Exception {
		//Read the data from the input file
		  FileInputStream fi=new FileInputStream("C:\\Users\\admin\\Desktop\\practice\\guru97-2003.xls");
		  Workbook w=Workbook.getWorkbook(fi);
		  Sheet s=w.getSheet("Sheet1");
		  
		//Create the result file under the result folder
		  FileOutputStream fo=new FileOutputStream("C:\\Users\\admin\\Desktop\\practice\\results.xls");
		  WritableWorkbook wb=Workbook.createWorkbook(fo);
		  WritableSheet ws=wb.createSheet("results", 0);
		  for (int i = 1; i <= s.getRows(); i++) { 
			
			  
		 
			//Enter username,Password and click on signin by taking data from input file
				
			 driver.findElement(By.name("userName")).sendKeys(s.getCell(0, i).getContents());
			 driver.findElement(By.name("password")).sendKeys(s.getCell(1, i).getContents());
			 
			 driver.findElement(By.name("submit")).click();
			 
			 
			 
			//Validate singout, if available assign pass to str, else assign fail to str

			 try{
			 	//driver.findElement(By.linkText("Log out")).click();	
			 	
				 driver.findElement(By.name("submit")).click();
			 	Thread.sleep(6000);
			 	str="Pass";
			 }catch(Exception e){str="Fail";
			
			
			 }
			 
			//Add str value to the result file under result column
			 jxl.write.Label result = new jxl.write.Label(2, i, str);
			 ws.addCell(result);


			 //Add input data to the result file
			 for (int j = 0; j < s.getColumns(); j++) {
			 	
			 	System.out.println(s.getCell(j, i).getContents());
			 	jxl.write.Label l = new jxl.write.Label(j, i, s.getCell(j, i).getContents());
			 	ws.addCell(l);
			 	
			 	//Add the heading
			 	jxl.write.Label un=new jxl.write.Label(0,0,"Username");
			 	jxl.write.Label pw=new jxl.write.Label(1,0,"Password");
			 	jxl.write.Label rs =new jxl.write.Label(2,0,"results");
			 		ws.addCell(un);
			 		ws.addCell(pw);
			 		ws.addCell(rs);

		 		//Write and close the result file	
			 		//	wb.write();
			 		//	wb.close();
			 	driver.get("http://demo.guru99.com/test/newtours/index.php");

		 } } 
		  
		}
	  
	  @BeforeTest
	  public void openurl() {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\geckodriver\\geckodriver.exe");
		  driver=new FirefoxDriver();
		  driver.get("http://demo.guru99.com/test/newtours/index.php"); 
		//driver.get("http://gcreddy.com/project/admin/login.php");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	  }

	  @AfterTest
	  public void aftertest() {
		 //driver.quit();
		  
		
	  }

	}

