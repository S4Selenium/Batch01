package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {

	
	WebDriver driver;
	
    
    
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
// Implemented using normal page object pattern style
	//username 
	By username = By.name("user_name");
	//password
	By password = By.name("password");
	//login button
	By login = By.xpath("//button[normalize-space()='Sign in']");
	
	public WebElement username()
	{
		return driver.findElement(username);
	}
	public WebElement password()
	{
		return driver.findElement(password);
	}
	public WebElement login()
	{
		return driver.findElement(login);
	}

	
}
