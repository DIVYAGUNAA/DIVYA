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

public class Exception_Handling {
	public WebDriver driver;
	private int i;
  @Test
  public void f() {
	  List<WebElement> listday=new Select(driver.findElement(By.id("day"))).getOptions();
	  System.out.println(listday.get(29).getText());
	  for(int i=0; i<listday.size();i++);
	  System.out.println(listday.get(i).getText());
	  
	  List<WebElement> listmonth=new Select(driver.findElement(By.id("month"))).getOptions();
	  System.out.println(listmonth.get(6).getText());
	  for(int i=0; i<listmonth.size();i++);
	  System.out.println(listmonth.get(i).getText());
	 try {
		 List<WebElement> listyear=new Select(driver.findElement(By.id("year"))).getOptions();//[its not working showing ]
		  System.out.println(listyear.get(1994).getText());
		  for(int i=0; i<listyear.size();i++);
		  System.out.println(listyear.get(i).getText());
		
	} catch (Exception e) 
	 {
	 System.out.println("1994 is there");
	} 
  }
  @BeforeTest
  public void openurl() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.get("https://www.facebook.com/r.php");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
