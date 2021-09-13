package DIVS;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ALERTS {
	public WebDriver driver;
	  @Test
	  public void alerts() {
		  driver.findElement(By.xpath("//a[normalize-space(@href)='https://mail.rediff.com/cgi-bin/login.cgi'][@title='Lightning fast free email']")).click();
		  driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		//  driver.findElement(By.xpath("//*[@height='1em'][@viewBox='0 0 14 16']")).click();
		//  driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']")).click();
		  //driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[3]/span/div/div[1]")).click();
		//  driver.findElement(By.xpath("//*[@class='btn btn-light active']")).click();
		 // driver.findElement(By.xpath("//button[@id=\"alertButton\"]")).click();
		  
		  // Thread.sleep(1000);
		  String str;
		  str=driver.switchTo().alert().getText();
		  System.out.println(str);
		  driver.switchTo().alert().accept();  
	  }
	  @BeforeTest
	  public void openurl() {                                     
		  //System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\geckodriver\\geckodriver.exe");
		    //FirefoxDriver Driver = new FirefoxDriver();
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver\\chromedriver.exe");
		  driver=new ChromeDriver();
		  //driver.get("https://demoqa.com/");
		  driver.get("https://mail.rediff.com");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
	  }

	  @AfterTest
	  public void aftertest() {
		  driver.quit();
	}}
