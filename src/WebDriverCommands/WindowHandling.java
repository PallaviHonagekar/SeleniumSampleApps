package WebDriverCommands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\firefox\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent window's handle -> " + parentWindowHandle);
		WebElement clickElement = driver.findElement(By.id("button1")); 
 
		for(int i = 0; i < 3; i++)
		{
			clickElement.click();
			Thread.sleep(3000);
		}
 
		Set<String> allWindowHandles = driver.getWindowHandles();
		String lastWindowHandle = "";
		for(String handle : allWindowHandles)
		{
			System.out.println("Switching to window - > " + handle);
			System.out.println("Navigating to google.com");
			driver.switchTo().window(handle); //Switch to the desired window first and then execute commands using driver
			driver.get("http://google.com");
			lastWindowHandle = handle;
		}
 
		//Switch to the parent window
		driver.switchTo().window(parentWindowHandle);
		//close the parent window
		driver.close();
		System.out.println(parentWindowHandle);
		//at this point there is no focused window, we have to explicitly switch back to some window.
		driver.switchTo().window(lastWindowHandle);
		driver.get("http://toolsqa.wpengine.com");

	}

}
