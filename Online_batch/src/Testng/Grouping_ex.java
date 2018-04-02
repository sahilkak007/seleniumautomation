package Testng;

import org.testng.annotations.Test;

public class Grouping_ex 
{
  @Test(groups="smoke")
  public void browser()
  {
	  System.out.println("browser is opening");
  }
  
  
  @Test(groups={"functional", "smoke"})
  public  void login()
  {
	  
	  System.out.println("login is succeful");
	  
  }
}
