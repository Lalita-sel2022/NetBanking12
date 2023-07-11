package keywords;

public class ValidationKeywords extends GenericKeywords
{


	public String validateTitle()
	{
		//String expectedTitle = "Adjecti";
		String actualtitle=driver.getTitle();
		return actualtitle;
		
	}
	
	public String validateUrl()
	{
		String url= driver.getCurrentUrl();
		return url;
		
	}
	
	
	
	public String validateHeading(String locakerKey)
	{
		String heading=getElement(locakerKey).getText();
		return heading;
		
	}
	public void Validateparagraph()
	{
		
	}
	
	public void validateElementVisible()
	{
		
	}
}
