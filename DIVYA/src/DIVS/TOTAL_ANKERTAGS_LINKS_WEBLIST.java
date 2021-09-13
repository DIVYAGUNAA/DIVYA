package DIVS;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TOTAL_ANKERTAGS_LINKS_WEBLIST {
	public WebDriver driver;
	  @Test
	  public void f() {
		  List<WebElement>str=driver.findElements(By.tagName("a"));
		  System.out.println("total tags are:"+str.size());
		  
		  for(int i = 0;i <str.size();i++) {
			  
		 System.out.println("links on pages are:"+str.get(i).getAttribute("href"));	//in href only all the values store,if u give href then only it will print all tags
		 System.out.println("links on pages are:"+str.get(i).getText());
		  
		  
	  }}
	  @BeforeTest
	  public void openurl() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://www.sugarcrm.com/au/request-demo/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
	  }

	  @AfterTest
	  public void afterTest() {
		  driver.quit();
		  
	  }

	}
