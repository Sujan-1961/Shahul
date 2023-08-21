package loginpageobj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageObj {
	@FindBy(how=How.NAME, using="username")
	public static WebElement user;
	
	@FindBy(name="password")
	public static WebElement pswd;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	public static WebElement submt;
	
//     public static WebElement user(ChromeDriver d) {
//    	 return d.findElement(By.name("username"));
//     }
//     
//     public static WebElement pswd(ChromeDriver d) {
//    	 return d.findElement(By.name("password"));
//     }
//     
//     public static WebElement submt(ChromeDriver d) {
//    	 return d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
//     }
//     
}
