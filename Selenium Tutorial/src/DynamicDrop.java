import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","D:\\skillup\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://selenium.obsqurazone.com/jquery-select.php");
		  //driver.findElement(By.id("select2-a3ht-container")).click();
		  driver.findElement(By.xpath("//span[@role='presentation'][1]")).click();
		  //driver.findElement(ByClassName.)
		  driver.findElement(By.cssSelector("input[aria-label='Search']")).sendKeys("Florida");
		  //driver.findElement(By.cssSelector("li[role='option']")).click();
		  driver.findElement(By.cssSelector("input[aria-label='Search']")).sendKeys(Keys.ENTER);
	
		  //auto suggesting dropdown, pick from list
		   driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--multiple'][1]")).sendKeys("New");
		   Thread.sleep(3000);
		   List<WebElement>options = driver.findElements(By.xpath("//li[@role='option']"));
		   for(WebElement option:options)
			   
		   {
			   if(option.getText().equalsIgnoreCase("New York"))
			   {
			       option.click();
			   }
		   }
		   Thread.sleep(5000);
		   //driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--multiple'][1]")).sendKeys("New");
		   //Thread.sleep(3000);
		   driver.findElement(By.cssSelector(".select2-selection.select2-selection--multiple")).sendKeys(Keys.ENTER);
		   driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--multiple'][1]")).sendKeys("New");
		   List<WebElement>selections = driver.findElements(By.xpath("//li[@role='option']"));
		   for(WebElement selection:selections)
			   
		   {
			   if(selection.getText().equalsIgnoreCase("New Jersey"))
			   {
				   selection.click();
			   }
			   
		   }
		   


	}

}



