package Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {
  @Test
  public void f1() {
	  System.out.println("testcase 1");
  }
  @Test
  public void f2() {
	  System.out.println("testcase 2");
  }
  
  @BeforeMethod
  public void launchurl() {
	  System.out.println("launch url");
  }
  
  @BeforeClass
  public void launchbrowser() {
	  System.out.println("launch browser");
  }
  
  @AfterClass
  public void closebrowser() {
	  System.out.println("launch browser");
  }
  
  @AfterMethod
  public void closeurl() {
	  System.out.println("launch browser");
  }
}
