package WebDriverCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAndMouseEvent {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\firefox\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String URL = "http://www.facebook.com/";
		driver.get(URL);
		WebElement txtUserName = driver.findElement(By.xpath("//input[@type=\"email\"]"));
		Actions builder = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Action seriesOfActions = builder
				.click(txtUserName)
				.keyDown(Keys.SHIFT)
				.sendKeys("pallavi")
				.keyUp(Keys.SHIFT)
				.doubleClick(txtUserName)
				.contextClick()
				.sendKeys(Keys.PAGE_DOWN)
				.build();
		
		seriesOfActions.perform();
	}

}
