package logintestcase;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import loginpageobj.PageObj;

public class TestCase {
  @Test
  public void f() {
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("start-maximized", "-disable--notifications");
	  ChromeDriver d = new ChromeDriver(options);
	  d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  
	  PageFactory.initElements(d, PageObj.class);
	  PageObj.user.sendKeys("Admin");
	  PageObj.pswd.sendKeys("admin123");
	  PageObj.submt.click();
	  
	  
	  
	  //PageObjModel"
//	  PageObj.user(d).sendKeys("Admin");
//	  PageObj.pswd(d).sendKeys("admin123");
//	  PageObj.submt(d).click();
	  
	  
//	  d.findElement(By.name("username")).sendKeys("Admin");
//	  d.findElement(By.name("password")).sendKeys("admin123");
//	  d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  
  }
}
