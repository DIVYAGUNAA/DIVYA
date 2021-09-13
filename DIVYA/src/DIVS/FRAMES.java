package DIVS;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class FRAMES {
	public WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	 driver.findElement(By.id("name")).sendKeys("hello");
	 
	 //switch to frame
	 driver.switchTo().frame(driver.findElement(By.id("frm1")));
	 Select dd=new Select(driver.findElement(By.id("selectnav1")));
	 dd.selectByVisibleText("- SQL");
	 Thread.sleep(3000);
	 
	 //connecting back to main webpage
	 driver.switchTo().defaultContent();
	 driver.findElement(By.id("name")).clear();
	 driver.findElement(By.id("name")).sendKeys("world");
	 
	 //inside frame3 there is a frame1 its called as nested frame 
	 driver.switchTo().frame(driver.findElement(By.id("frm3")));
	 driver.findElement(By.id("name")).sendKeys("frame3");
	 Thread.sleep(3000);
	 driver.switchTo().frame(driver.findElement(By.id("frm1")));
	 Select dd1=new Select(driver.findElement(By.id("selectnav1")));
	 dd1.selectByVisibleText("Tutorials");
	 Thread.sleep(3000);
	 
	 //connecting back nested frame(frame1 inside frame3) to frame3
	 driver.switchTo().parentFrame();
	 driver.findElement(By.id("name")).clear();
	 driver.findElement(By.id("name")).sendKeys("selenium"); 
	 Thread.sleep(3000);
	 
	//connecting back to main webpage
	 driver.switchTo().defaultContent();
	 driver.findElement(By.id("name")).clear();
     driver.findElement(By.id("name")).sendKeys("automation");
  }
  @BeforeTest
  public void openurl() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	 driver.close();
  }

}
