package WebDriverCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\firefox\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		String URL = "https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
		driver.get(URL);
		String title = driver.getTitle();
		String pageSource = driver.getPageSource();
		String currentURL = driver.getCurrentUrl();
		//System.out.println("Page Title : " + title + "\n Current URL : " + currentURL );
		//driver.findElement(By.xpath(".//*[@id='tabs-1']/div/p/a")).click();
		//driver.close();
   }
}