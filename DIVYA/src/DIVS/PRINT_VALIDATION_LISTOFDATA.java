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

public class PRINT_VALIDATION_LISTOFDATA {
	public WebDriver driver;
	  @Test
	  public void f() {
		  driver.findElement(By.name("firstname")).sendKeys("divya");
		  //can't understood this lines bcoz previous dynamicsexchange is not working
		 /* System.out.println(driver.findElement(By.xpath("//span[contains(text(),'The First name field is required.')]")).isDisplayed());
		  System.out.println(driver.findElement(By.xpath("//span[contains(text(),'The First name field is required.')]")).getText());*/
		  
		 // System.out.println(driver.findElement(By.xpath("//*[@name='firstname'],'Please Enter Above Text')]")).getText());
		  
		Select s =  new Select(driver.findElement(By.id("month")));
		
		List<WebElement>  l = s.getOptions();
		
		for(int i =0; i<l.size();i++)
		{
			System.out.println(l.get(i).getText());
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
