package learnselinium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;

public class redbus {
	public static void main(String[] str) {
		try {
			
			System.setProperty("webdriver.chrome.driver", "H:\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			driver.get("https://www.redbus.in/");
			
			WebElement element= null;
			// from city
			element = driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div/div[1]/div/div[1]/div/div"));
			element.click();
			
			element = driver.findElement(By.xpath("//*[@id=\"src\"]"));
			element.sendKeys("namakkal");
			element.click();
			
			element = driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div/div[1]/div/div[1]/ul/li[1]/div"));
			
			element.click();
			
			// to city
			element = driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div/div[3]"));
			element.click();
			
			element = driver.findElement(By.xpath("//*[@id=\"dest\"]"));
			element.sendKeys("chennai");
			element.click();
			
			element = driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div/div[3]/div[1]/ul/li[1]/div"));
			
			element.click();
			
			// Date 
			
			element = driver.findElement(By.xpath("//*[@id=\"onwardCal\"]"));
			element.click();
			
			element = driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/div/text[1]"));
			
			element.click();
			element = driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div"));
			element.click();
			
			
			
			
			Thread.sleep(3000);
			
			driver.quit();	//to close window
			}
		
		catch(Exception obj) {
			obj.printStackTrace();
		}
	}
}
