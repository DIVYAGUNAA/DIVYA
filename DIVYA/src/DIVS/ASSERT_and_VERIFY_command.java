package DIVS;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class ASSERT_and_VERIFY_command {
	public WebDriver driver;
	  @Test(priority=1)
	  public void f() {
		  //this is limeroad site
		  //write title as per site with caps& smalls dt tym only it will work
		  String Title = "Online Shopping Site - Shop Men & Women Fashion Online in India";
		  String GetTitle = driver.getTitle();
			 
		  
		  try{
		  Assert.assertEquals(Title, GetTitle);
		  
		  System.out.println("TitleMatched");
		  
		  }
		  catch (Throwable t){
			  
		  System.out.println("Not Equals");}	  
	  }
	  @Test(priority=2)
	  public void f1 () {
		//this is demo guru tours site  
		WebElement username=driver.findElement(By.name("userName"));
		WebElement password=driver.findElement(By.name("password"));
		
		Assert.assertTrue(username.isDisplayed());
		username.sendKeys("mercury");
		
		Assert.assertTrue(password.isDisplayed());
		password.sendKeys("mercury");
		
		driver.findElement(By.name("submit")).click();
		  
		  
	}
	  
	  

	  @BeforeTest
	  public void openurl() {
		  System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\admin\\\\chromedriver\\\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://www.limeroad.com/");
		  //driver.get("http://demo.guru99.com/test/newtours/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
	  }

	  @AfterTest
	  public void afterTest() {
	  }

	}

