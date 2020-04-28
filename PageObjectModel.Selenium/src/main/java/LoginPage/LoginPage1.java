package LoginPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.TestBase;

public class LoginPage1 extends TestBase



{
	@FindBy(name = "ctl00$ContentPlaceHolder1$usernm")
	
	WebElement UserName;
	
	@FindBy(name = "ctl00$ContentPlaceHolder1$adminpassword")
	
	
	 WebElement Password;
	
	
	@FindBy(name = "ctl00$ContentPlaceHolder1$btn_go")
	
	
	 WebElement loginButton;
	
	//static LoginPage1 login11 = new LoginPage1();
	
	public LoginPage1()
	{
		PageFactory.initElements(driver,this);
		
	
	}
	
	 


	public  void login() 
	{
		UserName.sendKeys("UserName");
		Password.sendKeys("1234");
		loginButton.click();
	}
	public void validation()
	{
		System.out.println("Title of the webpage is " +driver.getTitle());
	}
}

