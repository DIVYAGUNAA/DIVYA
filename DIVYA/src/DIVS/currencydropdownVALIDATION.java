package DIVS;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class currencydropdownVALIDATION {
	public WebDriver driver;
	  @Test
	  public void f() {
		WebElement str=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))).getFirstSelectedOption();
		System.out.println(str.getText());
		  if (str.getText().equalsIgnoreCase("INR")) {
		 System.out.println("dropdown validation passed=INR");	  
			
		}else {
		System.out.println("dropdown validation failed");  
		}
	  }
	  @BeforeTest
	  public void openurl() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   }

	  @AfterTest
	  public void afterTest() {
		  driver.quit();
	  }

	}

