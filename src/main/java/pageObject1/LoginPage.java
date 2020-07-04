package pageObject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
WebDriver driver;
	
	By username=By.id("user_email");
	By password=By.id("user_password");
	
	By login=By.cssSelector(".btn.btn-primary.btn-md.login-button");
	

	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getEmail()
	{
		return driver.findElement(username);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getLogin()
	{
		return driver.findElement(login);
	}

}
