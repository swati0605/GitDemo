package academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObject1.LandingPage;
import resources1.BaseLib;

public class ValidateNavBarTest extends BaseLib {

	WebDriver driver;
	@Test
	public void basePageNavigation() throws IOException
	{
		driver=initializeDemo();
		driver.get("http://qaclickacademy.com");
		
		//one is inheritence
		//creating object to that class and invoke  methods of it
		
		LandingPage lanp=new LandingPage(driver);
		Assert.assertTrue(lanp.getNavBar().isDisplayed());
		 
		 
		 
	
	
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}
