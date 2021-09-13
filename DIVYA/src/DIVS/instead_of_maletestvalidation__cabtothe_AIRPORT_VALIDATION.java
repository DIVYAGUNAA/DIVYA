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

public class instead_of_maletestvalidation__cabtothe_AIRPORT_VALIDATION {
	public WebDriver driver;
	  @Test
	  public void f() {
 driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home-container/div/app-home/div[1]/div[2]/div[1]/div[3]/a/span")).click();	  
 driver.findElement(By.id("fromCityList")).sendKeys("hyderabad,telangana");
 //driver.findElement(By.xpath("//*[@formcontrolname=\"frmLocalSubTripType\"]")).click();[CLICKING ON TRIP]
 
WebElement elemtrip=driver.findElement(By.xpath("//*[@formcontrolname=\"frmLocalSubTripType\"]"));
List<WebElement> listoptions=new Select(elemtrip).getOptions();
		  //System.out.println(elemtrip);

		  boolean iscabtotheairport = true;
			for (int i = 0; i < listoptions.size(); i++) {
			if (listoptions.get(i).getText().equalsIgnoreCase("Others"))

				{
					iscabtotheairport = true;
					break;
			}
				if (iscabtotheairport) {
					System.out.println("cab to the airport is present");

				} else {
					System.out.println("cab to the airport is NOT present");
				
		  }}  
		  
		  
		}
		  
	  
	  @BeforeTest
	  public void beforeTest() {
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
