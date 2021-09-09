import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DATADRIVE {

	public static void main(String[] args) {
		public WebDriver driver;
		  @Test
		  public void f() throws Exception {
			  
			 FileInputStream fi=new FileInputStream("C:\\Users\\admin\\Desktop\\DIVYA\\datadriven excel.xlsx");
			 Workbook wb=Workbook.getworkbook(fi);
			 Sheet s=wb.getsheet("sheet1");
		  }
		  @BeforeTest
		  public void openurl() {
			  System.setProperty("webdriver.gecko.driver","C:\\Users\\geckodriver\\geckodriver.exe");
			  driver=new FirefoxDriver();
			  driver.get("https://accounts.google.com");
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  }

		  @AfterTest
		  public void afterTest() {
		  }

		}


	}

}
