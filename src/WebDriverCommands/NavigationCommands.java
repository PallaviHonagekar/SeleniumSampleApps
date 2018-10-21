package WebDriverCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\firefox\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/Automation-practice-form/");
		driver.navigate().to("http://toolsqa.com/automation-practice-table/");
		driver.navigate().back();
		driver.navigate().refresh();

	}

}
