package Hms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class KFC {
	public WebDriver driver;
		
	}
  @Test
  public void login() {	  
	  
	  
  }
  @BeforeTest
  public void openurl() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\geckodriver\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("https://www.google.co.in/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
      
     
      
      
      
}
  }
  
  
  

  @AfterTest
  public void afterTest() {
  }

}
