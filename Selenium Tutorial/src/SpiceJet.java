import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SpiceJet {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\skillup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		//globally
		driver.get("https://www.booking.com/");
		
		driver.findElement(By.xpath("(//span[normalize-space()='Flights'])[1]")).click();
		//input[placeholder='Where to?']
		driver.findElement(By.cssSelector("input[placeholder='Where to?']")).click();
		
		driver.findElement(By.cssSelector("input[class='css-1tl2oa1']")).sendKeys("Chennai");
		
		List<WebElement> options = driver.findElements(By.cssSelector(".css-11bbywx"));
		for (WebElement option : options)

		{
			if (option.getText().equalsIgnoreCase("MAA")) {
				option.click();
			}
		}
		
		driver.findElement(By.xpath("//div/input[@placeholder='Depart']")).click();
		driver.findElement(By.cssSelector("span[data-date-cell='2022-02-11']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Return']")).click();
		
		driver.findElement(By.cssSelector("span[data-date-cell='2022-03-07']")).click();
	
		//Explicit wait
		WebDriverWait w = new WebDriverWait (driver,3);
		w.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".css-ya5gr9.wide")));
		driver.findElement(By.cssSelector(".css-ya5gr9.wide")).click();

	}

}
