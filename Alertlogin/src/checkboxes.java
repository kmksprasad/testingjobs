import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.security.Credentials;
import org.openqa.selenium.security.UserAndPassword;
import org.testng.annotations.Test;

public class checkboxes {
	
	
	WebDriver driver;
	
	@Test
	public void testdriver()
	{
	RemoteWebElement rd;
	System.setProperty("webdriver.chrome.driver", "C:/Users/km002/Desktop/SeleniumPractice/drivers/chromedriver_win32/chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/checkboxes");
	//driver.findElement(By.xpath("//*[text()='Broken Images']")).click();
	//Credentials credentials=setCredentials();
	driver.findElement(By.cssSelector("form#checkboxes>input")).click();
	System.out.println(driver.findElement(By.cssSelector("form#checkboxes>input")).isSelected());
	//driver.findElement(By.cssSelector("form#checkboxes>input+input")).click();
	
	
	}

}
