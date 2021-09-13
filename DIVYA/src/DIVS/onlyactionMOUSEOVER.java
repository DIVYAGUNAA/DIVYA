package DIVS;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class onlyactionMOUSEOVER {
	public WebDriver driver;
	public Actions action;
  @Test
  public void functionality() throws InterruptedException {
	  
	  action =new Actions(driver);
	  //loginwindow close
	  driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
	  
	  //clicking topoffers
	  driver.findElement(By.xpath("//img[@alt='Top Offers']")).click();
	  
	  //clicking women
	  WebElement women=driver.findElement(By.xpath("//*[text()='Women']"));
	  action.moveToElement(women).build().perform();
	  Thread.sleep(1000);
	  
	  WebElement gowns=driver.findElement(By.xpath("//*[text()='Gowns']"));
	  action.moveToElement(gowns).build().perform();
	  Thread.sleep(1000);
	 
	  //clicking on beauty,toys&more
	  //Driver.findElement(By.xpath("//*[@id="container"]/div/div[2]/div/div/div[9]/a/div[1]/div/img"]")).click();
	  
	  WebElement homeandfurniture=driver.findElement(By.xpath("//*[text()='Home & Furniture']"));
	  action.moveToElement(homeandfurniture).build().perform();
	  Thread.sleep(500);
	  
	  WebElement furnishing=driver.findElement(By.xpath("//*[text()='Furnishing']"));
	  action.moveToElement(furnishing).build().perform();
	  Thread.sleep(100);
	  
	 WebElement blankets=driver.findElement(By.xpath("//*[text()='Blankets']"));
	  action.moveToElement(blankets).build().perform();
	 Thread.sleep(100);
	  
	  WebElement homedecor=driver.findElement(By.xpath("//a[@title=\"Home Decor\"] "));
	  action.moveToElement(homedecor).build().perform();
	  Thread.sleep(100);
	  
	  
	  WebElement stickers=driver.findElement(By.xpath("//a[@title=\"Stickers\"]"));
	  action.moveToElement(stickers).build().perform();
	  Thread.sleep(100);
	  
	  WebElement men=driver.findElement(By.xpath("//*[text()='Men'] "));
	  action.moveToElement(men).build().perform();
	  Thread.sleep(1000);
	  
	 WebElement tshirts=driver.findElement(By.xpath("//*[text()='T-Shirts']"));
	 action.moveToElement(tshirts).build().perform();
	 Thread.sleep(100);
	  
	  WebElement electronics=driver.findElement(By.xpath("//*[text()='Electronics']"));
	  action.moveToElement(electronics).build().perform();
	  Thread.sleep(1000);
	  
	  WebElement oppo=driver.findElement(By.xpath("//*[text()='OPPO']"));
	  action.moveToElement(oppo).build().perform();
	  Thread.sleep(100);
	  
	  WebElement babyandkids=driver.findElement(By.xpath("//*[text()='Baby & Kids']"));
	  action.moveToElement(babyandkids).build().perform();
	  Thread.sleep(1000);
	  
	  WebElement tvsandappliances=driver.findElement(By.xpath("//*[text()='TVs & Appliances']"));
	  action.moveToElement(tvsandappliances).build().perform();
	  Thread.sleep(1000);
	  
	  WebElement sportsbooksandmore=driver.findElement(By.xpath("//*[text()='Sports, Books & More']"));
	  action.moveToElement(sportsbooksandmore).build().perform();
      Thread.sleep(1000);
      
      WebElement preorders=driver.findElement(By.xpath("//*[text()='Preorders']"));
      action.moveToElement(preorders).build().perform();
	  
	 //clicking on flights
      driver.findElement(By.xpath("//*[text()='Flights']")).click();
	  Thread.sleep(1000);
	  
	  
  }
  @BeforeTest
  public void openurl() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);  

  }
  
  
  
  
  

  @AfterTest
  public void closechrome() {
	  driver.quit(); 
  }

}

