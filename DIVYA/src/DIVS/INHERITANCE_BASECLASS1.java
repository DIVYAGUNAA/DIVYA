package DIVS;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.annotations.AfterTest;

public class INHERITANCE_BASECLASS1 {
	public WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  //clicking on contact
	  driver.findElement(By.xpath("//*[@id=\"nav\"]/li[3]/a")).click();
		Thread.sleep(1000); 
	 
  }
  @BeforeTest
  public void openurl() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.hyrtutorials.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
