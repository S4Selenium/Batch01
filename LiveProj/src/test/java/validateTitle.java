import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.Menu;
import resources.Base;

public class validateTitle extends Base{

	
	@Test(dataProvider="getData")
	public void login(String Username,String Password) throws IOException
	{
		  driver = callDriver();
		  driver.get("https://erp.buffalocart.com/login");
		  LoginPage lg = new LoginPage(driver);
		  lg.username().sendKeys(Username);
		  lg.password().sendKeys(Password);  
		  lg.login().click();
		  //driver.close();
		  Menu m = new Menu(driver);
		  //compare the text with the actual value
		  Assert.assertEquals(m.get_dashtitle().getText(),"Dashboard");
		  Assert.assertTrue(m.get_dashtitle().isDisplayed());
		
		  
	}
	@DataProvider
	public Object[][] getData()
	{
		
		Object[][] data=new Object[1][2];
		//0th row
		data[0][0]="admin";
		data[0][1]="123456";
		return data;
		
		
	
	}

	
}
