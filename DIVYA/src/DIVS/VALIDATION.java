package DIVS;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class VALIDATION {
	public WebDriver driver;
	  @Test(priority=1)
	  public void f() throws InterruptedException {
		 driver.findElement(By.linkText("Fashion")).click();
		 Thread.sleep(2000);
		  
		 String expectedtitle="jewelry" ;
		 String actualtitle=driver.getTitle();
		 try {
			System.out.println("jewelry is visible");
		} catch (Exception e)
		 {
			System.out.println("jewelry is not visible");
		}}
		 @Test(priority=2)  
		 public void f1() throws InterruptedException {
			driver.findElement(By.id("gh-cat")).click();
			Thread.sleep(2000);
			 
			String expectedtitle="movies&tv";
			String actualtitle=driver.getTitle();
			try {
			    System.out.println("yes movies&tv is there");
			} catch (Exception e1) 
			{
			 System.out.println("movies&tv is not there");	
			}}
	@Test(priority=3)  
	 public void f2() throws InterruptedException {		 
		 driver.findElement(By.linkText("Home & Garden")).click();
		 Thread.sleep(2000);
		try {
		System.out.println("furniture is there");
		} catch (Exception e3) 
		{
	     System.out.println("furniture is not there");	} 
			 
			 
	  }
	  @BeforeTest
	  public void openurl() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://www.ebay.com/");
	  }

	  @AfterTest
	  public void afterTest() {
	  }

	}
