package academy;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject1.LandingPage;
import resources1.BaseLib;

public class ValidateTitleTest extends BaseLib{

	WebDriver driver;
public static Logger log=LogManager.getLogger(BaseLib.class.getName());


	

	@Test
	public void basePageNavigation() throws IOException
	{
		driver=initializeDemo();
		log.info("Base class is initialized");
		driver.get("http://qaclickacademy.com");
		log.info("URL is opened");
		//one is inheritence
		//creating object to that class and invoke  methods of it
		
		LandingPage lanp=new LandingPage(driver);
	
		 
		 
		 Assert.assertEquals(lanp.getTitle().getText(), "FEATURED COURSES");
		log.info("Test is done");
		 
		// lanp.getLogin().click();
	
	
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}
