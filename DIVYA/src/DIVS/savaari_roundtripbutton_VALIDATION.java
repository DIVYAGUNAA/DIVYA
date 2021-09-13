package DIVS;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class savaari_roundtripbutton_VALIDATION {
	public WebDriver driver;
	  @Test
	  public void f() {
		  //printing boolean condition where true/false
		  boolean printcondition=driver.findElement(By.xpath("//*[text()='Round Trip']")).isDisplayed();
		  System.out.println(printcondition);
		  
		  WebElement roundtripbutton=driver.findElement(By.xpath("//*[text()='Round Trip']"));
		  if (roundtripbutton.isEnabled()) 
		  {
			System.out.println("yes its displayed");
		}
		  else 
		  {
			System.out.println("no its not displayed");
		}
		  
	  }
	 
	  @BeforeTest
	  public void openurl() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://savaari.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
	  }

	  @AfterTest
	  public void afterTest() {
		  driver.quit();
	  }

	}
