package DIVS;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class AUTO_IT_FILE_UPLOAD {
	public WebDriver driver;
	public Actions action;
	
	  @Test
	  public void login() throws Exception  {
		  
		 //this code is for automationtestinginsider url
		  action =new Actions(driver);
		 WebElement choosefile= driver.findElement(By.id("fileupload1"));
		 action.moveToElement(choosefile).click().perform();
		  Thread.sleep(1000);
		  
		  
		//this code is for demo.automationtesting url
//		  action =new Actions(driver);
//		  WebElement choosefile= driver.findElement(By.id("imagesrc"));
//		  action.moveToElement(choosefile).click().perform();
//		  Thread.sleep(1000);
		  
		 
		  
		 // Write the auto IT code.
		  Runtime.getRuntime().exec("C:\\Users\\admin\\Desktop\\autoit fileupload.exe");
		  Thread.sleep(5000);
	  }
	  @BeforeTest
	  public void openurl() throws Exception {
		 
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver\\chromedriver.exe");
		  driver =new ChromeDriver();
		 // driver.get("http://demo.automationtesting.in/Register.html");
		 // driver.get("https://smallpdf.com/word-to-pdf");
		  driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		  driver.manage().window().maximize();
		 Thread.sleep(3000);
	}

	  @AfterTest
	  public void afterTest() {
		  driver.quit();
	  }


	}

