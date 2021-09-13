package DIVS;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Spicejet_Destination_Validation {
	public WebDriver driver;
	  @Test(priority=1)
	  public void Bhimavaram () {
		  
		  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		  String placeName1 = "Bhimavaram";
		  List<WebElement> elms = driver.findElements(By.xpath("//div[@id='dropdownGroup1']//a[normalize-space(@href)='"+placeName1+"']"));//this is to take xpath from frst dropwn total group
		  if(elms.size()==0 ) {
			  System.out.println("Item not exist");
		  }else {
			  System.out.println("item exist");
		  }}
	   @Test(priority=1)
	   public void f () { 	  
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		
		String placeName1="Udaipur";
		List<WebElement> elms=driver.findElements(By.xpath("//div[@id='dropdownGroup2']//a[normalize-space(@href)='#']"));
		if (elms.size()==0) 
		{
		System.out.println("udaipur is not exist");	
		}
		else {
			System.out.println("udaipur is  exist");
		} 
		  
		  
		  
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
