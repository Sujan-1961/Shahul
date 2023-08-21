package Testng;

import org.testng.annotations.Test;

public class Drivecar {
  @Test(priority=1)
  public void first() {
	  System.out.println("first");
  }
  @Test(priority=2)
  public void sec() {
	  System.out.println("sec");
	  
  }
  
  @Test(priority=3, enabled=false)
  public void third() {
	  System.out.println("third");
	  
  }
  
  @Test(priority=4)
  public void fourth() {
	  System.out.println("fourth");
	  
  }
  
}
