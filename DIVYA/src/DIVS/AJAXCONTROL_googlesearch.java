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

public class AJAXCONTROL_googlesearch {
	public WebDriver driver;
	  @Test
	  public void f() {
		  driver.findElement(By.name("q")).sendKeys("Google");//
		  List<WebElement> allvalueslist=driver.findElements(By.xpath("//ul[@role='listbox']/li")); 
		  for (int i = 0; i < allvalueslist.size(); i++) {
			  System.out.println(allvalueslist.get(i).getText());
			  if (allvalueslist.get(i).getText().contains("choclate")) //if it is google pixel 4 xl also it showing present
			  {
				  allvalueslist.get(i).click();
				   break;
		        
			}
			  boolean isallvalueslist=true;
			  
				if (isallvalueslist) {
					System.out.println("choclate is present");
				} else {
					System.out.println("choclate is not present");}
		}
		  
		  
	  }
	  @BeforeTest
	  public void openurl() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver\\chromedriver.exe");
		  driver =new ChromeDriver();
		  driver.get("https://www.google.co.in/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  
	  }

	  @AfterTest
	  public void afterTest() {
	  }

	}
