package Lesson1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StringComp {
	
	public static void main(String[]args){
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Drivers\\chromedriver4.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/");
		driver.findElement(By.name("username")).sendKeys("kavyareddy");
		driver.findElement(By.name("password")).sendKeys("Testing1234");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.switchTo().frame("mainpanel");
		List<WebElement> links= driver.findElements(By.xpath("//ul[@class='mlddm']/li/a"));
		System.out.println("Totoal Web elements are:   "+links.size());
		 
		
		for (int i=0; i< links.size(); i++){			
			System.out.println(links.get(i).getText());		
		}
		
		String[] actLinks={"COMPANIES","CONTACTS","DEALS","TASKS","CASES","CALL","EMAIL","TEXT/SMS",
				"PRINT","CAMPAIGNS","DOCS","FORMS","REPORTS","HOME","CALENDAR"};
		
		
		if (links.size() == actLinks.length){
			for (int i=0; i<links.size();i++){
				for (int j=0; j<actLinks.length; j++){
				if(	(links.get(i).getText()).equals(actLinks[j])){
					System.out.println(links.get(i).getText() +"  Matching links found   " + actLinks[j]);
					break;
						}
				}
			}
		}
			
			else
				{
				System.out.println("size of two arrays are not matching");
				}
				
		
		}
	

}
