package Lesson1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadLessBrowser {
	
	public static void main (String[] args){
		
		// with HtmlUnitDriver
		
		/*WebDriver driver= new HtmlUnitDriver();
		driver.get("http://demo.guru99.com/V4/");
		System.out.println("Before login Page Title is " + driver.getTitle());
		driver.findElement(By.name("uid")).sendKeys("mngr158411");
		driver.findElement(By.name("password")).sendKeys("yrumYrA");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String title=driver.getTitle();
		System.out.println("After login Page Title is " + title);*/
		
		/*
		 ***********************************
		 Chrome Head Less browser
		 ***********************************
		 */
	
		ChromeOptions  co= new ChromeOptions();
		co.addArguments("window-size=1400,800");
		co.addArguments("headless");
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Drivers\\chromedriver4.exe");
		WebDriver driver= new ChromeDriver(co);
		driver.get("http://demo.guru99.com/V4/");
		System.out.println("Before login Page Title is " + driver.getTitle());
		driver.findElement(By.name("uid")).sendKeys("mngr158411");
		driver.findElement(By.name("password")).sendKeys("yrumYrA");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String title=driver.getTitle();
		System.out.println("After login Page Title is " + title);
		
		/*
		 ***********************************
		 Firefox Head Less browser
		 ***********************************
		 */
		
		
		/*FirefoxOptions options = new FirefoxOptions();
		options.addArguments("-headless");
		System.setProperty("webdriver.gecko.driver", "F:\\ETL\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver(options);
		driver.get("http://demo.guru99.com/V4/");
		System.out.println("Before login Page Title is " + driver.getTitle());
		driver.findElement(By.name("uid")).sendKeys("mngr158411");
		driver.findElement(By.name("password")).sendKeys("yrumYrA");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String title=driver.getTitle();
		System.out.println("After login Page Title is " + title);*/
		
		
	
		
		
	}
}
