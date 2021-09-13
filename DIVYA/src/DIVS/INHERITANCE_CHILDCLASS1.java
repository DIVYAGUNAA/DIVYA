package DIVS;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;

public class INHERITANCE_CHILDCLASS1 extends INHERITANCE_BASECLASS1{
  @Test
  public void functionality() throws InterruptedException {
	  
	//clicking on technews
	driver.findElement(By.xpath("//a[@href='https://www.hyrtutorials.com/search/label/TechNews']")).click();
	
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
