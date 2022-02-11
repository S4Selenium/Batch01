import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MRS {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\skillup\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demo.openmrs.org/openmrs/login.htm");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		/*driver.findElement(By.id("username")).sendKeys("Admin");
		 driver.findElement(By.name("password")).sendKeys("Admin123");
		 driver.findElement(By.id("Inpatient Ward")).click();
		 driver.findElement(By.id("loginButton")).click();
		 System.out.println(driver.getCurrentUrl());
		 System.out.println(driver.getTitle());
		 //driver.close();
		// Thread.sleep(2000);
		// driver.findElement(By.linkText("/openmrs/appui/header/logout.action?successUrl=openmrs")).click();
		 */
		 
	/*	 //XPATH
		 //Tagname[@attribute=’value’]
		 driver.findElement(By.xpath("//input[@placeholder='Enter your username']")).sendKeys("Admin");
		 //Regular Expression  //tagname[contains(@attibute,'value')] 
		 driver.findElement(By.xpath("//input[contains(@placeholder,'pass')]")).sendKeys("Admin123");
		 //Using Linked List
		 //driver.findElement(By.linkText("Can't log in?")).click();
		 //Using Xpath //parentTagname/childTagname
		 driver.findElement(By.xpath("//p/a")).click();
		 Thread.sleep(3000);
		 //parentTagname/childTagname
		 //driver.findElement(By.xpath("//button")).click();
		 driver.findElement(By.tagName("button")).click();
		 //driver.findElement(By.className("confirm")).click();
		 driver.findElement(By.tagName("img")).click();
		 driver.close();
		  */
		

		 
		 
		 
		 
		 
		
		 
		 
		 
		 //USING CSS SELECTOR
		
		 driver.findElement(By.id("username")).sendKeys("Admin1234");
		 driver.findElement(By.id("username")).clear();
		 driver.findElement(By.id("username")).sendKeys("Admin");
		 //Regular Expression input[attribute*='value'] 
		 driver.findElement(By.cssSelector("input[placeholder*='pass']")).sendKeys("Admin123");
		 //driver.findElement(By.id("password")).sendKeys("Admin123");
		 //CSS selector without class name and id
		 //Tagname[attribute='value']
		 driver.findElement(By.cssSelector("li[value='6']")).click();
		 //if class name is given then---->tagname.classname
		 //if class name is given then---->tagname.classname
		 //but tag name is optional can give ".classname" also it will work
		 driver.findElement(By.cssSelector(".confirm")).click();
		 //if id given then----> tagname#id
		 //Using CSS Parenttagname childtagname for can't login
		 driver.findElement(By.cssSelector("p a")).click();
		 System.out.println(driver.findElement(By.cssSelector("div#error-message")).getText());
		 driver.close();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 //USING Xpath SELECTOR
		/* 
		 //driver.findElement(By.id("username")).sendKeys("Admin");
		 //driver.findElement(By.id("password")).sendKeys("Admin123");
		 //driver.findElement(By.id("Inpatient Ward")).click();
		 //driver.findElement(By.id("loginButton")).click();
		  driver.findElement(By.linkText("Can't log in?")).click();
		  driver.findElement(By.cssSelector("button.confirm")).click();
		  driver.findElement(By.xpath("//input[@placeholder='Enter your username']")).sendKeys("Admin");
		 driver.findElement(By.xpath("//p/a")).click();
		  */
	}

}
