package DIVS;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class PRINTING_Total_DROPDOWNLIST_USINGAJAXCOMMANDS {
	public WebDriver driver;
	@Test
  public void f() throws InterruptedException {
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("a");//total 81 list
		 Thread.sleep(3000);                    
		 String str=driver.findElement(By.xpath("//*[@id='citydropdown']")).getText();//xpath for total related items in the table
		 System.out.println(str);                
		  
		 //total characters of string(letters count)
		 System.out.println(str.length());  
  }
  @BeforeTest
  public void openurl() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://spicejet.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}

