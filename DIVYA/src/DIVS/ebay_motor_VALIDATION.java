package DIVS;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ebay_motor_VALIDATION {
	public WebDriver driver;
	  @Test
	  public void f() {
		  
		//printing boolean condition where true/false for ebay motor
		  boolean printcondition=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[10]/a")).isDisplayed();
	      System.out.println(printcondition);
	      WebElement motor=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[10]/a"));
	      if (motor. isEnabled()) 
	      {
		  System.out.println("its displayed");
		}
	      else
	      { 
	      System.out.println("its not displayed");  
	      }
		  
	  }
	  @BeforeTest
	  public void openurl() {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://www.ebay.com/");
		  driver.manage().window().maximize();
	  }

	  @AfterTest
	  public void aftertest() {
		  driver.quit(); 
	  }
	}

