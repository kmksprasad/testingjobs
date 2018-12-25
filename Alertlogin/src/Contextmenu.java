import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;
import java.awt.event.KeyEvent;	
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.security.Credentials;
import org.openqa.selenium.security.UserAndPassword;
import org.testng.annotations.Test;

public class Contextmenu {
	
	
	WebDriver driver;
	
	@Test
	public void testdriver()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/km002/Desktop/SeleniumPractice/drivers/chromedriver_win32/chromedriver.exe");
		driver= new ChromeDriver();
	/*System.setProperty("webdriver.gecko.driver", "C:/Users/km002/Desktop/SeleniumPractice/drivers/geckodriver-v0.23.0-win64/geckodriver.exe");
	driver= new FirefoxDriver();*/
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/context_menu");
	//driver.findElement(By.xpath("//*[text()='Broken Images']")).click();
	//Credentials credentials=setCredentials();
	WebElement ele = driver.findElement(By.cssSelector("div#hot-spot"));
	Actions act = new Actions(driver);
	
	Action actt = act.contextClick(ele).build();
	actt.perform();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Robot rb;
	try {
		rb = new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
	} catch (AWTException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	/*act.sendKeys(Keys.ARROW_DOWN).build().perform();
	act.sendKeys(Keys.ARROW_DOWN).build().perform();
	act.sendKeys(Keys.ARROW_DOWN).build().perform();
	act.sendKeys(Keys.ARROW_DOWN).build().perform();
	act.sendKeys(Keys.ARROW_DOWN).build().perform();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	act.sendKeys(Keys.ENTER).build().perform();*/
	
	
	
	
	}

}
