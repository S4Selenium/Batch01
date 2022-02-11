import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		  System.setProperty("webdriver.chrome.driver","D:\\skillup\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.makemytrip.com/");
		  Thread.sleep(3000);//add
		  //driver.findElement(By.cssSelector(".lbl_input.latoBold.appendBottom10")).click();
		  driver.navigate().refresh();
		  driver.findElement(By.cssSelector(".makeFlex.hrtlCenter.font10.makeRelative.lhUser.userLoggedOut")).click();
		  driver.findElement(By.xpath("//div/ul/li[@data-cy='roundTrip']")).click();
		  driver.findElement(By.id("fromCity")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[@placeholder='From']")).click();
		  driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Delhi");
		   Thread.sleep(3000); 
		  List<WebElement>options = driver.findElements(By.xpath("//li/div/div/p[@class='font14 appendBottom5 blackText']"));
		   for(WebElement option:options)
			   
		   {
			   if(option.getText().equalsIgnoreCase("New Delhi"))
			   {
			       option.click();
			   }
		   }
		  driver.findElement(By.cssSelector("label[for='departure'] span[class='lbl_input latoBold appendBottom10']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[@aria-label='Wed Feb 09 2022']")).click();
		  Thread.sleep(3000);
		  //driver.findElement(By.cssSelector("label[for='return'] span[class='lbl_input latoBold appendBottom10']")).click();
		  driver.findElement(By.xpath("//div[@aria-label='Sun Feb 13 2022']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.cssSelector(".primaryBtn.font24.latoBold.widgetSearchBtn")).click();
		  
		
	}

}
