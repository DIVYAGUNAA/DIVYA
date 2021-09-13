package DIVS;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class POPOUP {
	public WebDriver driver;
	  @Test
	  public void f() throws InterruptedException {
		  
		  driver.findElement(By.id("newWindowBtn")).click();
		  
		  String parent=driver.getWindowHandle();
		  
		  for(String child : driver.getWindowHandles()){
		      driver.switchTo().window(child);
		  }
		      driver.findElement(By.id("firstName")).sendKeys("DIVYA");
		      driver.findElement(By.id("lastName")).sendKeys("GUNA");
		      driver.findElement(By.id("femalerb")).click();
		      driver.findElement(By.id("englishchbx")).click();
		      driver.findElement(By.id("hindichbx")).click();
		      driver.findElement(By.id("email")).sendKeys("divya.autoqct@gmail.com");
		      driver.findElement(By.id("password")).sendKeys("9393097082");
		      driver.findElement(By.id("clearbtn")).click();
		      Thread.sleep(1000);
		      System.out.println("child");
		      
		      driver.switchTo().window(parent);
		      Thread.sleep(1000);
		  }
	  
	  @BeforeTest
	  public void openurl() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }

	  @AfterTest
	  public void afterTest() {
	  driver.close(); 
	  }

	}
