package testCase;


import org.testng.Assert;
import org.testng.annotations.Test;


public class HomepageValidation extends BaseClass

{

	@Test
	public void homePageUrlMatch()
	{
		System.out.println("Open homepage");
		app.openBrowser("chromebrowser");
		app.navigateUrl("homepageurl");
	}
	
	@Test
	public void urlMatch()
	{
		String actualUrl=app.validateUrl();
		String expectedUrl = "https://adjecti.com/home.html";
		Assert.assertEquals(actualUrl, expectedUrl, "Url is mismatch");
	}
	
	@Test
	public void titleMatch()
	{
		String expectedTitle = "Adjecti";
		String actualTitle=app.validateTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test
	public void headingMatch()
	{
		String actualHeading =app.validateHeading("heading_xpath");
		String expectedHeading =" DATA DRIVEN DIGITAL EXPERIENCE ";
		Assert.assertEquals(actualHeading, expectedHeading);
	}
	
	
	
	
	
	


	

	// Count of links in the homepage
	/*
	 * @Test public void getCountLink() throws IOException, InterruptedException {
	 * String links = null; int expectedCount=66; int actualCount =
	 * driver.findElements(By.tagName("a")).size(); List<WebElement> allLinks =
	 * driver.findElements(By.tagName("a")); for(WebElement link:allLinks) {
	 * 
	 * links+=link.getText()+",";
	 * 
	 * } //System.out.println(links);
	 * System.out.println("Total count of links on homepage is :"+ actualCount);
	 * Assert.assertEquals(actualCount, expectedCount);
	 * 
	 * File createFile= new File("linkName.txt"); try {
	 * if(createFile.createNewFile()) {
	 * System.out.println("File created "+createFile.getName()); } else {
	 * System.out.println(createFile +"is already exist"); } } catch (IOException e)
	 * { System.out.println(e); e.printStackTrace(); }
	 * 
	 * FileWriter write = new FileWriter(createFile); write.write(links);
	 * write.close();
	 * 
	 * //Get count of links in footer section //Main driver have scope on entire
	 * page so need to create mini driver will access the scope only for footer. int
	 * exp=18; WebElement footerDriver =
	 * driver.findElement(By.className("footer"));// Limiting webdriver scope int
	 * footerLinkCount = footerDriver.findElements(By.tagName("a")).size();
	 * System.out.println("Footer link count is :"+footerDriver.findElements(By.
	 * tagName("a")).size()); Assert.assertEquals(footerLinkCount, exp);
	 * 
	 * //Footer one column links count
	 * 
	 * int expfooterColLinks=4; WebElement footerColumnDriver =
	 * footerDriver.findElement(By.className("col-xl-3")); int countOfColLinks =
	 * footerColumnDriver.findElements(By.tagName("a")).size();
	 * System.out.println("Count of footer column links is :"+countOfColLinks);
	 * Assert.assertEquals(expfooterColLinks, countOfColLinks); List<WebElement>
	 * footerLink = footerColumnDriver.findElements(By.tagName("a"));
	 * 
	 * //Click on each link in footer column and check it open on appropriate page
	 * or not for(int i=1;i<countOfColLinks;i++) { //String parentWindow =
	 * driver.getWindowHandle(); //System.out.println(parentWindow);
	 * 
	 * String clickOnLinks = Keys.chord(Keys.CONTROL,Keys.ENTER);
	 * System.out.println(clickOnLinks);
	 * footerColumnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinks
	 * );
	 * 
	 * 
	 * //Parent window handle
	 * 
	 * String parentWindow = driver.getWindowHandle();
	 * System.out.println("parentWindow");
	 * footerColumnDriver.findElements(By.tagName("a")).get(i).click(); //Child
	 * window handle
	 * 
	 * Set<String> windowHandles = driver.getWindowHandles(); for(String
	 * handles:windowHandles) { System.out.println(handles);
	 * if(!handles.equalsIgnoreCase(parentWindow)) {
	 * driver.switchTo().window(handles); Thread.sleep(5000); driver.close(); } }
	 * 
	 * }
	 * 
	 * 
	 * //Header link count int expHeaderLink=19; WebElement headerLink =
	 * driver.findElement(By.className("container")); int headerLinks =
	 * headerLink.findElements(By.tagName("a")).size();
	 * System.out.println("Header Links count is :"+headerLinks);
	 * Assert.assertEquals(headerLinks, expHeaderLink); }
	 * 
	 * 
	 * @Test public void imageSlider() {
	 * //driver.findElement(By.className("carousel-indicators")); int sliderCount =
	 * driver.findElements(By.xpath("//li[@data-target='#AdjectiSlider']")).size();
	 * System.out.println("Count of image slider is :"+sliderCount);
	 * List<WebElement> image =
	 * driver.findElements(By.xpath("//li[@data-target='#AdjectiSlider']"));
	 * for(WebElement sliding:image) { System.out.println(sliding.isSelected()); } }
	 */

}
