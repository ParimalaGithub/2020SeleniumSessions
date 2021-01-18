package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
	
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		/*WebElement email = driver.findElement(By.className("login-email"));
		email.sendKeys("testqa774@gmail.com");
		WebElement Password = driver.findElement(By.className("login-password"));
		Password.sendKeys("testqa774@gmail.com");
		//id concept
		/*WebElement email1 = driver.findElement(By.id("username"));
		email1.sendKeys("testqa774@gmail.com");
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Test123456$");*/
		//*********************
		//xpath
		/*WebElement email1 = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		email1.sendKeys("testqa774@gmail.com");
		WebElement Password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		Password.sendKeys("Test123456$");*/
		//********************
		//Css Selector #username #password
		/*WebElement email1 = driver.findElement(By.cssSelector("#username"));
		email1.sendKeys("testqa774@gmail.com");
		WebElement Password = driver.findElement(By.cssSelector("#password"));
		Password.sendKeys("Test123456$");*/
		//link text	
		/*WebElement Signup = driver.findElement(By.linkText("Sign up"));
		Signup.click();*/
		WebElement Signup = driver.findElement(By.partialLinkText("Sign"));
		Signup.click();
		
		
	}

}
