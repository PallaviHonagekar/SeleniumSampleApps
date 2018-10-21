package WebDriverCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\firefox\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();

		String URL = "http://www.dhtmlx.com/docs/products/dhtmlxTree/index.shtml";

		driver.get(URL);

		driver.manage().window().maximize();

		WebElement From = driver.findElement(By.xpath("//div[@id='treebox1']//table//table//table/tbody/tr[3]/td[@colspan='3']/table/tbody/tr/td/span[contains(text(),'Robert Crais')]"));

		WebElement To = driver.findElement(By.xpath("//div[@id='treebox2']//table//table//table/tbody/tr/td/span"));

		Actions builder = new Actions(driver);
		builder.dragAndDrop(From, To).build().perform();
		
//		Action dragAndDrop = builder.clickAndHold(From)
//							.moveToElement(To)		
//							.release(To)					
//							.build();
//
//		dragAndDrop.perform();


	}

}
