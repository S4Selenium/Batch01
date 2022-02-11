import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Travolook {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","D:\\skillup\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.travolook.in/");
		  driver.findElement(By.name("flying_from_N")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.name("flying_from")).sendKeys("delhi");
		  Thread.sleep(5000);
		  List<WebElement>options = driver.findElements(By.xpath("li[class='ac_odd']"));
		  //Thread.sleep(5000);
		   for(WebElement option:options)
			   
		   {
			   if(option.getText().equalsIgnoreCase("DEL"))
			   {
			       option.click();
			   }
		   }
		  //DropDown.selectByVisibleText("Srinagar");
		  //DropDown.selectByValue("Delhi");
	}

}
