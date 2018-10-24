package Lesson1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {
	
	public static void main(String[]args) throws InterruptedException{
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Drivers\\chromedriver4.exe");
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		WebElement userName= driver.findElement(By.name("identifier"));
		
		Actions action= new Actions(driver);
		action.moveToElement(userName).keyDown(userName, Keys.SHIFT).sendKeys("mannekavya").perform();
		action.moveToElement(userName).clickAndHold().perform();
		userName.clear();
		
		action.moveToElement(userName).keyUp(userName, Keys.SHIFT).sendKeys("MAnneKavya").perform();
		action.moveToElement(userName).doubleClick().perform();
		action.moveToElement(userName).contextClick().perform();
		
	}

}
