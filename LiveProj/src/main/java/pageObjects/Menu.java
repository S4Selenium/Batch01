package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Menu {
WebDriver driver;
	
    
    
	public Menu (WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
// Implemented using normal page object pattern style
	
	By dashtitle = By.xpath("//a[@class='text-muted']");
	
	
	public WebElement get_dashtitle()
	{
		return driver.findElement(dashtitle);
	}
}
