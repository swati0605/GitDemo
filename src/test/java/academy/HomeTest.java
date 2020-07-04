package academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject1.LandingPage;
import pageObject1.LoginPage;
import resources1.BaseLib;

public class HomeTest extends BaseLib {

	WebDriver driver;

	@Test(dataProvider="getData")
	public void basePageNavigation(String email,String password,String text) throws IOException
	{
		driver=initializeDemo();
		driver.get("http://qaclickacademy.com");
		//one is inheritence
		//creating object to that class and invoke  methods of it
		
		LandingPage lanp=new LandingPage(driver);
		 lanp.getLogin().click();
		
		LoginPage lp=new LoginPage(driver);
		lp.getEmail().sendKeys(email);
		lp.getPassword().sendKeys(password);
		System.out.println(text);
		lp.getLogin().click();
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[2][3];
		data[0][0]="nonrestricteduser@qw.com";
		data[0][1]="123456";
		data[0][2]="RestrictedUser";
		
		data[0][0]="nonrestricteduser1@qw.com";
		data[0][1]="1234567";
		data[0][2]="RestrictedUser1";
		
		return data;
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}
