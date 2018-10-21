package WebDriverCommands;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FindElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\firefox\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.wpengine.com/Automation-practice-form/");
     
		String message = driver.findElement(By.xpath("//div[@class='wpb_wrapper']//span[1]//em")).getText();
		System.out.println(message);
		
		driver.findElement(By.name("firstname")).sendKeys("Pallavi"); 
		driver.findElement(By.name("lastname")).sendKeys("H");
 
//		driver.findElement(By.partialLinkText("Partial")).click();
//		System.out.println("Partial Link Test Pass");
// 
//		// Convert element in to a string 
//		String sClass = driver.findElements(By.tagName("button")).toString();
//		System.out.println(sClass);
// 
//		// Click on "Link Text" link
//		driver.findElement(By.linkText("Link Test")).click();
//		System.out.println("Link Test Pass");
		
		List<WebElement> rdb_gender = driver.findElements(By.name("sex"));
		boolean isSelected = rdb_gender.get(0).isSelected();
		if(isSelected) {
			rdb_gender.get(1).click();
		} else {
			rdb_gender.get(0).click();
		}
		
		WebElement rdb_experience0 = driver.findElement(By.id("exp-0"));
		rdb_experience0.click();
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("10/5/2018");
		
		List<WebElement> chk_Professions = driver.findElements(By.name("profession"));
		int iSize = chk_Professions.size();
		
		for(int i=0; i < iSize ; i++ ){
			String profession = chk_Professions.get(i).getAttribute("value");
			
			if (profession.equalsIgnoreCase("Automation Tester")){
				chk_Professions.get(i).click();
				break;
			}
		}
		
		WebElement uploadElement = driver.findElement(By.xpath("//input[@type=\"file\"]"));

        uploadElement.sendKeys("E:\\JAVA\\output.txt");
		
		WebElement chk_automation_tool = driver.findElement(By.cssSelector("input[value='Selenium IDE']"));
		chk_automation_tool.click();
		
		Select continents = new Select(driver.findElement(By.id("continents")));
		continents.selectByVisibleText("Europe");
		
		Select selenium_commands = new Select(driver.findElement(By.name("selenium_commands")));
		 
		selenium_commands.selectByIndex(0); 
		selenium_commands.deselectByIndex(0);
 
		selenium_commands.selectByVisibleText("Navigation Commands");
		selenium_commands.deselectByVisibleText("Navigation Commands");
 
		List<WebElement> options = selenium_commands.getOptions();
		int iListSize = options.size();
 
		for(int i = 0; i < iListSize ; i++){
			String value = selenium_commands.getOptions().get(i).getText();
 
			System.out.println(value);
 
			selenium_commands.selectByIndex(i);
		}
 
		selenium_commands.deselectAll();
		
	}
}
