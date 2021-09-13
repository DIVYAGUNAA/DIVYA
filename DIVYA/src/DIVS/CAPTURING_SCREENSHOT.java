package DIVS;

import org.testng.annotations.Test;

import com.google.common.io.Files;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class CAPTURING_SCREENSHOT {
	public WebDriver driver;
	  @Test
	  public void f() throws Exception {
	  	//this is is the one way of taking of screenshot code just in 4steps("this is for bigbasket") before execution change url which one u r executing  
		  TakesScreenshot SS=(TakesScreenshot)driver;
		  File src=SS.getScreenshotAs(OutputType.FILE);
		  //normally we will  use fileutils.copyfile(src,new File("C:\\Users\\admin\\Desktop\\shot.png")); bt we are giving like this it showing utilserror we are clicking dt it will remove utils and working dis code
		  //Files.copy(src,new File("C:\\Users\\admin\\Desktop\\shot.png"));{dis path is saving the screenshot on desktop}
		  
		  Files.copy(src,new File("./SCREENSHOTS/bigbasket.png"));//{dis path is saving the ss in project}
		  System.out.println("Screenshot taken");
		  
		//this is another way of taking screen shot code both ways are working both are capturing for different sites("this is for flipkart")  
		  
//		  Robot r = new Robot();
//		   java.awt.Rectangle capture = new java.awt.Rectangle(Toolkit.getDefaultToolkit().getScreenSize());   
//		  BufferedImage image = r.createScreenCapture(capture);
//		  ImageIO.write(image, "png", new File("C:\\Users\\admin\\Desktop\\shot.png"));
//		  System.out.println("Screenshot taken");
	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://www.bigbasket.com");
		  //driver.get("http://flipkart.com");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	  
	  }

	  @AfterTest
	  public void afterTest() {
		  driver.quit();
	  }

	}
