package DIVS;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class informationOPTIONS {
	public WebDriver driver;
	private int i;
  @Test
  public void f() { 
	  
	 //selecting day,month,year  
	  WebElement day= driver.findElement(By.id("day"));
	  Select select=new Select(day);
	  select.selectByIndex(10);
	  
	  //printing 10 is multiple times there(true/false)
	  System.out.println(select.isMultiple());
	  
	  WebElement month=driver.findElement(By.id("month"));
	  Select select1=new Select(month);
	  select1.selectByVisibleText("Apr");
		  
	  WebElement year=driver.findElement(By.id("year"));
	  Select select2=new Select(year);
	  select2.selectByVisibleText("2018");	    
		 
	  //printing day,month,year  
	  List<WebElement> listday=new Select(driver.findElement(By.id("day"))).getOptions();
	  System.out.println(listday.get(29).getText());
	  for(int i=0; i<listday.size();i++);
	  System.out.println(listday.get(i).getText());
	  
	  List<WebElement> listmonth=new Select(driver.findElement(By.id("month"))).getOptions();
	  System.out.println(listmonth.get(6).getText());
	  for(int i=0; i<listmonth.size();i++);
	  System.out.println(listmonth.get(i).getText());
	  
	try {
		List<WebElement> listyear=new Select(driver.findElement(By.id("year"))).getOptions();
		  System.out.println(listyear.get(1994).getText());
		  for(int i=0; i<listyear.size();i++);
		  System.out.println(listyear.get(i).getText());
		
 } catch (Exception e)
	{
		System.out.println("1994 is there");	
	} 
	  
	  //minising one month  
	  List<WebElement> listmonth1=new Select(driver.findElement(By.id("month"))).getOptions();
	  System.out.println(listmonth1.size());
	  int totalmonths=listmonth1.size()-1;
	  System.out.println("total months are:"+totalmonths);
	  
     //printing all months list	  
	  for(int i=0; i<listmonth1.size();i++) {
	  String monthvalue=listmonth1.get(i).getText();
	  System.out.println(monthvalue);
	  
	 //printing all days list
	  for (int i1 = 0; i1 < listday.size(); i1++) {
	  String dayvalue=listday.get(i1).getText();
	  System.out.println(dayvalue);
	 }
	  }
	   }
  @BeforeTest
  public void openurl() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver\\chromedriver.exe");
      driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/r.php");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit(); 
  }

}

