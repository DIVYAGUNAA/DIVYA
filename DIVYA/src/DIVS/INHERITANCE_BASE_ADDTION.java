package DIVS;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class INHERITANCE_BASE_ADDTION {
	
  @Test(priority=1)
  public void add() {
	  int a=15,b=10;
	  System.out.println(a+b);
  }
  @Test(priority=2)
  public void sub() {  
	  int a=15,b=20;
	  System.out.println(a-b);
  }
//  @Test(priority=3)
//  public void mul() {
//	  int a=15,b=20;
//	  System.out.println(a*b);
//  }
//
//@Test(priority=4)
//public void div() {
//	  int a=100,b=20;
//	  System.out.println(a/b);
//}
//  
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
