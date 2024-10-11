package learnselinium;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.List;

public class flipkart 
{
	public static void main(String[] str) {
	try {
		System.setProperty("webdriver.chrome.driver", "H:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		
		
		java.util.List<WebElement> lst = driver.findElements(By.tagName("a"));
		Iterator<WebElement> ise = lst.iterator();
		while(ise.hasNext()) {
			WebElement element = ise.next();
			String atr=element.getAttribute("href");
			String text = element.getText();
			System.out.println(atr);
			System.out.println(text);
			
			System.out.println("----------");
			
		}
		
		}
	catch(Exception obj) {
		obj.printStackTrace();
		}

}}

