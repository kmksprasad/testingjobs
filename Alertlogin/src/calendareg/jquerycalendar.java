package calendareg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jquerycalendar {

	public static void setDateUsingJavaScriptInCalendar(WebDriver driver, String value, WebElement calLocator)
	{
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		String script= "arguments[0].setAttribute('value','"+value+"');";
		jse.executeScript(script, calLocator);
	}
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/km002/Desktop/SeleniumPractice/drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resources/demos/datepicker/dropdown-month-year.html");
		
		// Locating departure date calendar
		WebElement departCal= driver.findElement(By.id("datepicker"));
		jquerycalendar.setDateUsingJavaScriptInCalendar(driver,"10/09/2017",departCal);
		//departCal.sendKeys("02/04/1990");
		
		
		
		}
}