package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class GmailTestAutomation {
	WebDriver driver;
	
	@BeforeClass
	public void getURL() {
		System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\firefox\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		String URL = "https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
		driver.get(URL);
		driver.manage().window().maximize();	
	}
		
	@Test
	public void sendMailTest() {
		WebDriverWait wait = new WebDriverWait(driver,20);
		
			wait.until(ExpectedConditions.elementToBeClickable(By.id("identifierId")));
			driver.findElement(By.id("identifierId")).sendKeys("pallavihonagekar@gmail.com");
			
			wait.until(ExpectedConditions.elementToBeClickable(By.id("identifierNext")));
			driver.findElement(By.id("identifierNext")).click();		
			
			wait.until(ExpectedConditions.elementToBeClickable(By.name("password")));
			driver.findElement(By.name("password")).sendKeys("bappa1993");
			
			wait.until(ExpectedConditions.elementToBeClickable(By.id("passwordNext")));
			driver.findElement(By.id("passwordNext")).click();
//			WebElement passwordNextBtn = driver.findElement(By.id("passwordNext"));
//			Point point = passwordNextBtn.getLocation();
//			Actions act= new Actions(driver);
//			act.moveByOffset(point.x,point.y).click().build().perform();
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='z0']/div[contains(text(),'Compose')]")));
			driver.findElement(By.xpath("//div[@class='z0']/div[contains(text(),'Compose')]")).click();
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//table[@class='GS']/tbody/tr[1]/td[@class='eV']/div/div/textarea")));
			driver.findElement(By.xpath("//table[@class='GS']/tbody/tr/td[@class='eV']/div/div/textarea")).sendKeys("pallavihonagekar@gmail.com");
			
			wait.until(ExpectedConditions.elementToBeClickable(By.name("subjectbox")));
			driver.findElement(By.name("subjectbox")).sendKeys("test mail");
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//table/tbody/tr/td[@class='Ap']//parent::div/following-sibling::div/div")));
			driver.findElement(By.xpath("//table/tbody/tr/td[@class='Ap']//parent::div/following-sibling::div/div")).sendKeys("Hello pallavi");
//	
//			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='aDh']/table/tbody/tr/td[1]/div")));
//			driver.findElement(By.xpath("//div[@class='aDh']/table/tbody/tr/td[1]/div")).click();
//			
//			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Sent')]")));
//			driver.findElement(By.xpath("//a[contains(text(),'Sent')]")).click();;
//			Actions action = new Actions(driver);
//			//action.moveToElement(ele).click().build().perform();
//			
//			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='ae4 UI']/div/div/table/tbody/tr[1]/td[@class='xY a4W']/div[@class='xS']/div/div[@class='y6']/span/span")));
//			wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@class='ae4 UI']/div/div/table/tbody/tr[1]/td[@class='xY a4W']/div[@class='xS']/div/div[@class='y6']/span/span"), "test mail"));
//			WebElement subjectOfMail = driver.findElement(By.xpath("//div[@class='ae4 UI']/div/div/table/tbody/tr[1]/td[@class='xY a4W']/div[@class='xS']/div/div[@class='y6']/span/span"));
//			String  actualSubject = subjectOfMail.getText();
////			System.out.println(actualSubject);
//			assertEquals(actualSubject, "test mail");
		
		
	}
}
