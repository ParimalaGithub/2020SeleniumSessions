package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJetMove2Element {

	public static void main(String[] args) throws InterruptedException {
		//ctl00_HyperLinkLogin
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");driver.manage().window().maximize();
	
		Actions action= new Actions(driver);
		WebElement target = driver.findElement(By.cssSelector("#ctl00_HyperLinkLogin"));
	
		action.moveToElement(target).build().perform();
		//SpiceClub Members
	
		WebElement target1 = driver.findElement(By.partialLinkText("SpiceClub"));
		Actions action1= new Actions(driver);
		action1.moveToElement(target1).build().perform();
		//Member Login
		Thread.sleep(2000);
		WebElement target2 = driver.findElement(By.linkText("Member Login"));
		
		//action.moveToElement(target2).build().perform();
		target2.click();
		
		
	}

}
