package DIVS;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class VALIDATION_WITH_CONTAINS {
	public WebDriver driver;
	
	  @Test
	  public void f() { 
		 
		  List<WebElement> values=new Select(driver.findElement(By.id("month"))).getOptions();
		  if (values.get(6).getText().contains("Jun"))
		  {
			System.out.println("yes its correct");
		}
		  else {
			System.out.println("not correct");
			
		}   
	  }
	  @BeforeTest
	  public void openurl() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://www.facebook.com/r.php");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  
		  
	  }

	  @AfterTest
	  public void afterTest() {
		  driver.quit();
	  }

	}

