package WebDriverCommands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\firefox\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String URL = "https://www.amazon.in/";
		driver.get(URL);
		WebElement hoverOn = driver.findElement(By.id("nav-link-yourAccount"));
		Actions builder = new Actions(driver);
		builder.moveToElement(hoverOn).build().perform();
		 Set<String> handles= driver.getWindowHandles();
		 String  handle = driver.getWindowHandle(); 
		System.out.println(handle + handles);		 
		for (String handle1 : driver.getWindowHandles()) {
		
		System.out.println(handle1);
		
		driver.switchTo().window(handle1);
		
		}
//		WebElement ele = driver.findElement(By.id("nav_prefetch_yourorders"));
//		System.out.println(hoverOn.getText()+ele.getText());
	}
}
