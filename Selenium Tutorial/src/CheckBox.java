import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver","D:\\skillup\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		  System.out.println(driver.findElement(By.id("gridCheck")).isSelected());
		  driver.findElement(By.id("gridCheck")).click();
		  System.out.println(driver.findElement(By.id("gridCheck")).isSelected());
		  System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		  driver.close();
		  
	}

}
