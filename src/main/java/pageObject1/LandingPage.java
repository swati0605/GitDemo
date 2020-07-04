package pageObject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	WebDriver driver;
	
	By signin=By.xpath("//a[@href*='sign_in']");
	
By	title=By.xpath("//h2[text()='Featured Courses']");

By	navBar=By.cssSelector(".nav.navbar-nav.navbar-right");

	public LandingPage(WebDriver driver) {
	this.driver=driver;
	}

	

	public WebElement getLogin() {
		return driver.findElement(signin);
	}
	
	public WebElement getTitle() {
		return driver.findElement(title);
	}
	
	public WebElement getNavBar() {
		return driver.findElement(navBar);
	}


}
