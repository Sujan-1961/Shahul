package encodeandecode;
import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import testutility.PropertisReder;

public class Loginfunc {

	public static WebDriver d=null;
	public static String browser=null;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub'
//		
//		System.out.println("Enter the Browser [chrome| Firefox]: ");
//		
//		Scanner sc=new Scanner(System.in);
//		browser=sc.next();
//		
//		if(browser.equalsIgnoreCase("chrome"))
//		{
//			 System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver115\\chromedriver-win32\\chromedriver.exe");
//			 d=new ChromeDriver();
//			
//		}else if(browser.equalsIgnoreCase("firefox"))
//		{
//			 System.setProperty("webdriver.gecko.driver", "D:\\Driver\\geckodriver33\\geckodriver.exe");
//			 d=new FirefoxDriver();
//			
//		}
//		
//		d.manage().window().maximize();
//		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		String et=d.getTitle();
//		System.out.println("The page title: "+et);
//		
//		String username=EncodeandDecode.getDecoded(new PropertiesReader().getconfigProperties().getProperty("username"));
//		String password=EncodeandDecode.getDecoded(new PropertiesReader().getconfigProperties().getProperty("password"));
//
//		
//		System.out.println(username + " "+password);
//		// Encode the login credentials
////		String username="Admin";
////		String password="admin123";
////		
////		String encodeusername=EncodeandDecode.getEncoded(username);
////		String encodepassword=EncodeandDecode.getEncoded(password);
////		
////		System.out.println(encodeusername);
////		System.out.println(encodepassword);
//		
//		d.findElement(By.name("username")).sendKeys(username);
//		Thread.sleep(2000);
//		d.findElement(By.name("password")).sendKeys(password);
//		Thread.sleep(2000);
//		d.findElement(By.xpath("//*[@type='submit']")).click();
//		
//		//d.quit();
//		
//		
//		

		
		
		
	}

}
