package DIVS;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class DATADRIVEN6 {
	public WebDriver driver;
  @Test
  public void f() throws IOException {
  FileInputStream fis=new FileInputStream("C:\\Users\\admin\\Desktop\\practice\\guru99tours.xlsx");	  
  XSSFWorkbook wb=new XSSFWorkbook(fis);	
  XSSFSheet sheet=wb.getSheet("Sheet1");
  int rowcount=sheet.getLastRowNum();	   
 System.out.println("total no. of rows present in the sheet:"+rowcount); 
  int columncount=sheet.getRow(1).getLastCellNum();
 System.out.println("total no. of columns present in the sheet:"+columncount);
 for (int i = 1; i <= rowcount; i++) {
 XSSFCell cell=sheet.getRow(i).getCell(1);
 String celltext="";
 if (cell.getCellType()==CellType.STRING)
{
  celltext=cell.getStringCellValue();	
}
 else if (cell.getCellType()==CellType.NUMERIC) 
 {
	 celltext=String.valueOf(cell.getNumericCellValue());
}
 else if (cell.getCellType()==CellType.BLANK) 
 {
	 celltext="";
}
 boolean LoginSuccessfully=true;
 if (LoginSuccessfully) {
		//System.out.println("Login Successfully is there");
	 sheet.getRow(i).getCell(2).setCellValue("pass");
	} else {
		//System.out.println("Login Successfully is not there");
		sheet.getRow(i).getCell(2).setCellValue("fail");
}

 FileOutputStream fos=new FileOutputStream("C:\\Users\\admin\\Desktop\\practice\\guru99tours.xlsx");
 wb.write(fos);
 fos.close();
 }
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
