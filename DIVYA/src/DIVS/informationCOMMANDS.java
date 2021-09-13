package DIVS;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class informationCOMMANDS {
	 public WebDriver driver;
	 
	  @Test
	  public void f() {
		  
		String str1=driver.findElement(By.linkText("Gmail")).getText();
		  System.out.println(str1);
		  
		 String str2=driver.findElement(By.xpath("//a[@data-pid=\"2\"]")).getAttribute("textContent"); 
		 System.out.println(str2);
		   
		   String str3=driver.findElement(By.name("btnK")).getAttribute("value");
		   System.out.println(str3);
		   
		   String str4=driver.findElement(By.name("btnI")).getAttribute("value");
		   System.out.println(str4);
		   
		  String str5=driver.findElement(By.id("SIvCob")).getText();
		  System.out.println(str5);
		  
		  
		  String str6=driver.findElement(By.linkText("Get the facts")).getText();
		  System.out.println(str6);
		 
	  }
	  @BeforeTest
	  public void openurl() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://www.google.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  
		  
	  }

	  @AfterTest
	  public void afterTest() {
		  driver.quit();
	  }

	}

