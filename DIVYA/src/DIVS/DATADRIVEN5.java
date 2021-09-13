//package DIVYA;
//
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import jxl.Cell;
//import jxl.Sheet;
//import jxl.Workbook;
//import jxl.read.biff.BiffException;
//
//public class DATADRIVEN5 {
//	public WebDriver driver;

//	@Test(dataProvider="testdata")
//	  public void login(String username,String password) {
//		  driver.findElement(By.name("userName")).sendKeys(username);
//		  driver.findElement(By.name("password")).sendKeys(password);
//		  driver.findElement(By.name("submit")).click();	  
//		  Assert.assertEquals("http://demo.guru99.com/test/newtours/index.php", driver.getCurrentUrl());
//		  driver.close();
//	}
//	
//	@DataProvider(name="testdata")  
//	public Object[][] readExcel() throws BiffException, IOException {
//		File f=new File("C:\\Users\\admin\\Desktop\\practice\\guru97-2003.xls") ; 
//		Workbook w=Workbook.getWorkbook(f);
//		Sheet s=w.getSheet("Sheet1");
//		int rows=s.getRows();
//		int columns=s.getColumns();
//		System.out.println(rows);
//		System.out.println(columns);
//		String inputdata [] []=new String [rows] [columns];
//		for (int i = 0; i < rows; i++) {
//		for (int j = 0; j < columns; j++) {
//		Cell c=s.getCell(j,i);
//		inputdata [i][j]=c.getContents();
//		System.out.println(inputdata [i][j]);
		//}	
		//}
		//return inputdata;	

	//}
    
//	String message1=driver.findElement(By.xpath("//h3['Login Successfully']")).getText();  
//if (message1.equalsIgnoreCase("Login Successfully")) {
//sheet.getRow(i).createCell(2).setCellValue("pass");	
//} else {
//	sheet.getRow(i).createCell(2).setCellValue("fail");	
//} 
//FileOutputStream fileoutputstream=new FileOutputStream("C:\\Users\\admin\\Desktop\\practice\\guru99tours.xlsx");
//workbook.write(fileoutputstream); 
//driver.get("http://demo.guru99.com/test/newtours/index.php");
//}
//  workbook.close(); 
