package Lesson1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws MalformedURLException, IOException{
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Drivers\\chromedriver4.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("mngr158411");
		driver.findElement(By.name("password")).sendKeys("yrumYrA");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		links.addAll(driver.findElements(By.tagName("img")));
		System.out.println("No of links present in the web page are "+ links.size());
	List<WebElement> activelinks = new ArrayList<WebElement>();
	
	for (int i=0; i<links.size();i++){
		
		if (links.get(i).getAttribute("href")!= null &&( !links.get(i).getAttribute("href").contains("javascript"))){
			
			activelinks.add(links.get(i));
		}
	}
		 
		System.out.println("No of ACtive links are "+ activelinks.size());
		
		for (int j=0; j<activelinks.size();j++){
			//URL connection  url  strings..
			System.out.println(activelinks.get(j).getAttribute("href"));
			HttpURLConnection connection=(HttpURLConnection)new URL(activelinks.get(j).getAttribute("href")).openConnection();
			connection.setConnectTimeout(10000);
			connection.connect();
			String response= connection.getResponseMessage();
			if (!response.contentEquals("OK")){
				System.out.println(activelinks.get(j).getAttribute("href")+"------" + response);
				//System.out.println("There are no broken links available");
				
						}
			else if (response.contentEquals("OK")){
				System.out.println(activelinks.get(j).getAttribute("href")+ "-----"+ response);
				
			}
			
			connection.disconnect();
				
			}
			
			
			driver.close();
			
		}
		
}


