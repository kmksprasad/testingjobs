import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.security.Credentials;
import org.openqa.selenium.security.UserAndPassword;
import org.testng.annotations.Test;

public class testjavaalert {
	
	
	WebDriver driver;
	
	@Test
	public void testdriver()
	{
	
	System.setProperty("webdriver.chrome.driver", "C:/Users/km002/Desktop/SeleniumPractice/drivers/chromedriver_win32/chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://admin:admin@the-internet.herokuapp.com/");
	driver.findElement(By.xpath("//*[text()='Basic Auth']")).click();
	//Credentials credentials=setCredentials();
	Alert alert=driver.switchTo().alert();
	alert.sendKeys("username" + Keys.TAB.toString()+"pass");
	//alert.sendKeys("username" + Keys.TAB.toString()+"password");﻿
	
	/*System.out.println(credentials);
	alert.setCredentials(credentials)*/;
	
	}
	
	public Credentials setCredentials()
	{
		Credentials credentials = new UserAndPassword("foo", "bar"); ;
		return credentials;
		
	}
	
	
	
	

}
