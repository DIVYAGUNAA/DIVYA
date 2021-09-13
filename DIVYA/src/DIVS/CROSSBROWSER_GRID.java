package DIVS;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;

public class CROSSBROWSER_GRID {
	public WebDriver driver;
  @Test
  public void testparameterwithxml() throws InterruptedException {
	  
	  driver.get("https://www.edureka.co/"); 
	 
	WebElement Login=driver.findElement(By.xpath("//span[@class='login_click login-vd giTrackElementHeader ']"));   
	Login.click();
	Thread.sleep(4000);
	
	WebElement email=driver.findElement(By.id("si_popup_email"));
	email.sendKeys("omkar.hiremath@edureka.co");
	Thread.sleep(4000);
	
	WebElement password=driver.findElement(By.id("si_popup_passwd"));
	password.sendKeys("12345678");
	Thread.sleep(6000);
	
	WebElement login=driver.findElement(By.xpath("//button[@class='clik_btn_log btn-block']"));
	login.click();
	Thread.sleep(4000);
	
	WebElement close =driver.findElement(By.xpath("//*[@id=\"new_sign_up_optim\"]/div/div/div[1]/button"));
	close.click();
	 //popup window handling wrote code but its not working
//	String parent=driver.getWindowHandle();
//	  
//	  for(String child : driver.getWindowHandles()){
//	      driver.switchTo().window(child);
//	  }
//	WebElement closesidepopup=driver.findElement(By.xpath("//i[@class='icon-down-arrow_ico']"));
//	closesidepopup.click();
//	driver.switchTo().window(parent);
	
	WebElement datascience=driver.findElement(By.linkText("Data Science"));
	datascience.click();
	
	
	
	
//	Thread.sleep(10000);
//	String parent2=driver.getWindowHandle();
//	  
//	  for(String child2 : driver.getWindowHandles()){
//	      driver.switchTo().window(child);
//	
//	WebElement popupclose=driver.findElement(By.xpath("//button[@class='close close_exit_popup']"));
//	popupclose.click();
//	
//	 driver.switchTo().window(parent);
//     
	
//	WebElement search=driver.findElement(By.xpath("//*[@id=\"search-input\"]"));
//	search.sendKeys("selenium");
//	Thread.sleep(4000);
//	
//	WebElement clickonsearch=driver.findElement(By.xpath("//div[@class='search_header']"));
//	clickonsearch.click();
	
	
	  //}}
	
  }
  @BeforeTest
  @Parameters("browser")
  public void setup(String browser) throws Exception {
	  
	  if(browser.equalsIgnoreCase("firefox")) 
	  {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
	  else if (browser.equalsIgnoreCase("chrome"))
		{
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver\\chromedriver.exe");
			  driver = new ChromeDriver();
				
			}
			
		else if (browser.equalsIgnoreCase("ie")) 
		{
				System.setProperty("webdriver.ie.driver", "C:\\Users\\admin\\IE driver\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				
		}
		else {
			throw new Exception("browser is not correct");
		}
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
  

  @AfterTest
  public void afterTest() {
	  //driver.close();
  }

}
