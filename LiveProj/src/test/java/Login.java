import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import resources.Base;

public class Login extends Base{

	@BeforeTest
	
	public void initialise() throws IOException
	{
		driver = callDriver();
		driver.get("https://erp.buffalocart.com/login");
	}
	
	
	@Test(dataProvider="getData")
	public void login(String Username,String Password) throws IOException
	{
		  //driver = callDriver();
		  //driver.get("https://erp.buffalocart.com/login");
		  LoginPage lg = new LoginPage(driver);
		  lg.username().sendKeys(Username);
		  lg.password().sendKeys(Password);
		  lg.login().click();
		  //driver.close();
		  
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
	@AfterTest
	public void close()
	{
		driver.close();
	}
 
	
}
