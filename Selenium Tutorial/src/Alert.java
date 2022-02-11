import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","D:\\skillup\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.tutorialsteacher.com/codeeditor?cid=js-1");
		  Thread.sleep(5000);
		  //driver.findElement(By.cssSelector("button[onclick='myFunction()']")).click();
		  driver.switchTo().alert().accept();
		  System.out.println(driver.switchTo().alert().getText());
		  driver.switchTo().alert().accept();
		  driver.switchTo().alert().accept();
		  driver.switchTo().alert().accept();
		  //driver.switchTo().alert().dismiss();
		  //driver.switchTo().alert().dismiss();

	}

}
