package keywords;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class ApplicationKeywords extends ValidationKeywords
{
	
	public ApplicationKeywords() throws IOException
	{
		
		//dfghjklkjhg
	
		file= new FileInputStream(projectPath+"\\src\\test\\resources\\environment.properties");
		mainPro = new Properties();
		mainPro.load(file);
		String e=mainPro.getProperty("env");

		file= new FileInputStream(projectPath+"\\src\\test\\resources\\"+e+".properties");
		childPro = new Properties();
		childPro.load(file);;
		//childPro.getProperty("prod");
		
		file= new FileInputStream(projectPath+"\\src\\test\\resources\\or.properties");
		orPro= new Properties();
		orPro.load(file);
		//String str=orPro.getProperty("heading_xpath");
		//System.out.println(str);
		
		
	}

	public void login() 
	{
		
	}
	
	public void selectDateCal()
	{
		
	}

}
