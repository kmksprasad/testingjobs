import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.security.Credentials;
import org.openqa.selenium.security.UserAndPassword;
import org.testng.annotations.Test;

public class brokenimage {
	
	
	ChromeDriver driver;
	
	@Test
	public void testdriver()
	{
	
	System.setProperty("webdriver.chrome.driver", "C:/Users/km002/Desktop/SeleniumPractice/drivers/chromedriver_win32/chromedriver.exe");
	driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://admin:admin@the-internet.herokuapp.com/");
	driver.findElement(By.xpath("//*[text()='Broken Images']")).click();
	//Credentials credentials=setCredentials();
	List<WebElement> images= driver.findElements(By.cssSelector("img"));
	
	for( WebElement emg: images)
	{
	
		System.out.println("natural width"+emg.getAttribute("naturalWidth"));
		if(emg.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println(emg+"broken");
		}else
			if( !emg.getAttribute("naturalWidth").equals("undefined"))
			{
				System.out.println(emg+"loaded");
			}
	}
	
	
	}

}
