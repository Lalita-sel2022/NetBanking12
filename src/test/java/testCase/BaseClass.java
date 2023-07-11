package testCase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import keywords.ApplicationKeywords;

public class BaseClass
{
	public ApplicationKeywords app;

	
	@BeforeTest
	public void beforeTest(ITestContext context) throws IOException
	{
		System.out.println("Before Test");
		app = new ApplicationKeywords();
		context.setAttribute("app", app);
		
	}
	
	 
	  @BeforeMethod
	  public void beforeMethod(ITestContext context) 
	  { 
		 System.out.println("Before Method");
		 app=(ApplicationKeywords)context.getAttribute("app");
		
		 
	  }
	 
	
}
