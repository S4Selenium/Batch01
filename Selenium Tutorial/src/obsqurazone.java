import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class obsqurazone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver","D:\\skillup\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://selenium.obsqurazone.com/select-input.php");
		  try {
		  WebElement staticdropdown = driver.findElement(By.id("single-input-field"));
		  //creating an object
		  Select dropdown = new Select(staticdropdown);
		  dropdown.selectByIndex(1);
		  System.out.println(dropdown.getFirstSelectedOption().getText());
		  dropdown.selectByValue("Yellow");
		  System.out.println(dropdown.getFirstSelectedOption().getText());
		  dropdown.selectByVisibleText("Gr");
		  System.out.println(dropdown.getFirstSelectedOption().getText());
		  }
		  catch(Exception Ex )
		  {
			  
			  System.out.println("Test case failed. So trip not booked");
			 
		  }
	}

}
