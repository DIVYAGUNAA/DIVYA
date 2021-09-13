package POM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class REPOSITORY {
	public static WebDriver driver;
  @Test
  public static void login() {
	driver.findElement(LOCATORS.google).sendKeys(DATA.google);  
	driver.findElement(LOCATORS.googlesearch).click();  
  }
  @BeforeTest
  public  static void openurl() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get(DATA.url);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
  
	  
  }

  @AfterTest
  public static void afterTest() {
  }

}
