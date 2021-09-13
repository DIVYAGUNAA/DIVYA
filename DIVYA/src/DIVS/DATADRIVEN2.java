package DIVS;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DATADRIVEN2 {
	public WebDriver driver;
	//public String str;
  @Test
  public void f() throws IOException, InvalidFormatException {
	  
	  FileInputStream fi=new FileInputStream("C:\\Users\\admin\\Desktop\\practice\\guru99tours3.xlsx");
	  XSSFWorkbook workbook=new XSSFWorkbook(fi); 
	  XSSFSheet sheet=workbook.getSheet("sheet1");
	  
	  
	  int rowcount=sheet.getLastRowNum();
	  for (int i = 1; i <= rowcount; i++) {
		  
	  XSSFRow row=sheet.getRow(i);
	  CellStyle style=sheet.getWorkbook().createCellStyle();
	  XSSFFont font=sheet.getWorkbook().createFont();
	  font.setFontName("TIMES NEW ROMAN");  
	  
	  String username=row.getCell(0).getStringCellValue();
	  String password=row.getCell(1).getStringCellValue();
	  
	  driver.findElement(By.name("userName")).sendKeys(username);
	  driver.findElement(By.name("password")).sendKeys(password);
	  driver.findElement(By.name("submit")).click();
	  
	//String message = driver.findElement(By.xpath("//span['Enter your userName and password correct']")).getText();
	  String url=driver.getCurrentUrl();	
		if (url. equals("http://demo.guru99.com/test/newtours/login_sucess.php")) {
		System.out.println("Login Successfully is there-pass");	
		}
		else {
			System.out.println("Login Successfully is not there-fail");
	} 
	FileOutputStream fileoutputstream=new FileOutputStream("C:\\Users\\admin\\Desktop\\practice\\guru99tours3.xlsx");
	workbook.write(fileoutputstream); 
	driver.get("http://demo.guru99.com/test/newtours/index.php");
	}
	  workbook.close();  
	  
  }
  @BeforeTest
  public void openurl() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://demo.guru99.com/test/newtours/index.php");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
  }

  @AfterTest
  public void afterTest() {
  }

}

