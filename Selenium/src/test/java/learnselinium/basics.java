package learnselinium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;

public class basics {
	public static void main(String[] str) {
		try {
			
			System.setProperty("webdriver.chrome.driver", "H:\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			driver.get("https://www.amazon.in");
			
			WebElement element= null;
			
			element = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]"));
			element.click();
			
			String txt=element.getText();
			System.out.println(txt);
			
//			element.getAttribute("data-csa-c-content-id");
//			element.click();
			
			Thread.sleep(3000);
			
			driver.close();		}
		
		catch(Exception obj) {
			obj.printStackTrace();
		}
	}

}
