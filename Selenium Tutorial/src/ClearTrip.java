import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\skillup\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.cleartrip.com/");
		  driver.findElement(By.xpath("(//span[@class='radio__circle bs-border bc-neutral-500 bw-1 ba'])[2]"));
		   driver.findElement(By.xpath("(//input[@placeholder='Any worldwide city or airport'])[1]")).sendKeys("Bang");
		   Thread.sleep(3000);
		   List<WebElement>options = driver.findElements(By.cssSelector(".to-ellipsis.o-hidden.ws-nowrap.c-inherit.fs-3"));
		   for(WebElement option:options)
			   
		   {
			   if(option.getText().equalsIgnoreCase("BLR"))
			   {
			       option.click();
			   }
		   }

	}

}
