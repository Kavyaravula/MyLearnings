package Lesson1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class WithoutSendKeys {
	
	public void main(String[] args){
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Drivers\\chromedriver4.exe");
		driver= new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		WebElement userName= driver.findElement(By.name("identifier"));
		JavaScriptExecutor js= (JavaScriptExecutor) driver;
	
	}

}
