package baseClass;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class TestBase {
	static Properties pro;
	public static  WebDriver driver;

	public TestBase() {

		try {
			
			File src = new File("C:\\Program Files\\Selenium\\Spring tool suite\\Code\\PageObjectModel.Selenium\\src\\main\\resources\\Project Configurations\\Configuration.properties\\");
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
	    	pro.load(fis);
		} 

	 catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	public String initialization() 
	{
		String path =pro.getProperty("ChromeDriver");
		
		return path;
		
	}
	public String URl()
	{
		String url=pro.getProperty("URL");
		return url;
		
	}
	public String uname()
	{
		String user = pro.getProperty("UserName");
		return user;
	}
	
	public String password()
	{
		String password = pro.getProperty("Password");
		return password;
	}
}
