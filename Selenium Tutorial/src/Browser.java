import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Browser {

	public static void main(String[] args) throws InterruptedException {
			//Invoking a browser
		    //Why not ChromeDriver
		    //Why web Driver(Interface).
  System.setProperty("webdriver.chrome.driver","D:\\skillup\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("http://testphp.vulnweb.com/login.php");
  driver.navigate().to("https://www.saucedemo.com/");
  //System.out.println(driver.getTitle());
  //System.out.println(driver.getCurrentUrl());
  //CSS selector with ID
  //getpassword(Webdriver)
  driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
  //CSS selector when no ID or class. But using Tagname[attribute='value']
  driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("secret_sauce");
  //CSS selector with class..Class name -> tagname.classname 
  //driver.findElement(By.cssSelector("input.login-button")).click();
  driver.findElement(By.id("login-button")).click();
  //System.out.println(driver.findElement(By.cssSelector(" h3[data-test='error']")).getText());
  //Thread.sleep(1000);
  driver.findElement(By.className("inventory_item_name")).click();
    //driver.close();
   Assert.assertEquals(driver.getTitle(),"Swag Labs");
   Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/inventory-item.html?id=4");
   //driver.close();
   driver.navigate().back();
   driver.navigate().forward();
   
	}
	
	
  /*public void getpasword(WebDriver driver)
	{
		driver.get("http://testphp.vulnweb.com/login.php");
		driver.navigate().to("http://testphp.vulnweb.com/login.php");
	 driver.findElement("")
		*/

}
