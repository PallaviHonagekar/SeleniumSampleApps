package WebDriverCommands;

import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\firefox\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,50);
		try {
			driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");
	
			driver.switchTo().frame("iframe1");
	
			WebElement firstName = driver.findElement(By.name("firstname"));
			firstName.sendKeys("Pallavi");
			
			WebElement lastName = driver.findElement(By.name("lastname"));
			lastName.sendKeys("Singh");
	
			driver.switchTo().defaultContent();
			driver.switchTo().frame("iframe2");
			
			WebElement link = driver.findElement(By.xpath("//a[text() = 'Hello world!']"));
			link.click();
			System.out.println("Switching successfull");
		}catch (TimeoutException toe) {
	
			wait.until( ExpectedConditions.elementToBeClickable(By.name("firstname")));
			driver.findElement(By.name("firstname")).click();
	
		}catch (Exception e) {
	
			throw(e);
	
		}

	}

}
