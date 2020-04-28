package loginpageTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import LoginPage.LoginPage1;
import baseClass.TestBase;


public class LoginPageTest extends TestBase
{
	LoginPage1	loginpage;
	
	public LoginPageTest() 
	{
       super();
	}
  
	@BeforeTest
	public void setup() throws Exception
	{
		TestBase test = new TestBase();
		 System.setProperty("webdriver.chrome.driver",test.initialization());
		 driver= new ChromeDriver();
		 driver.get(test.URl());
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginpage = new LoginPage1();
		 
	} 
	
	@Test(priority=2)
	
	public void log() throws Exception
	
	{
		
       loginpage.login();
      
      Thread.sleep(3000);
	
	}
	
	@Test(priority=1)
	
	public void validate()
	{
		
	loginpage.validation();
	
	
		
		
	}
	
}
	
	
	
	


