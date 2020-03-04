package trisul;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class locators1 {
	
		public WebDriver driver;
		
		//login on s
	  @Test
	  public void login() throws Exception {
		  driver.findElement(By.id("email")).sendKeys("pavansai@gmail. com");
		  driver.findElement(By.id("pass")).sendKeys("pavan9999");
		  driver.findElement(By.id("u_0_c")).click();
		 Thread.sleep(3000);
				  File str= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				  String str1="3sul";
			FileHandler.copy(str, new File("C:\\Users\\trisul\\Desktop\\New folder"+str1+".png"));
		
	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver","D:\\SELENIUM_Workspace\\chromedriver.exe" );
		  driver=new ChromeDriver();
		  driver.get("http\\www.facebook.com");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
	 	  
		  
	  }

	  @AfterTest
	  public void afterTest() {
	  }

	}
