package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\firefox\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
		WebElement uploadElement = driver.findElement(By.xpath("//input[@type=\"file\"]"));

        //uploadElement.sendKeys("E:\\JAVA\\output.txt");

        //driver.findElement(By.id("terms")).click();

        driver.findElement(By.name("send")).click();

	}
}
