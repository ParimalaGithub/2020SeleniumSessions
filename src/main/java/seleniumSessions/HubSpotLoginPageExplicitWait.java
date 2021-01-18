package seleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HubSpotLoginPageExplicitWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		WebDriverWait wait1 = new WebDriverWait(driver,10);
		wait1.until(ExpectedConditions.titleContains("Hub"));
		
		
		System.out.println(driver.getTitle());
		
		By email1 = By.id("username");
		By Passord= By.id("password");
		By loginbutton = By.id("loginBtn");
		
		//WebElement email1 = driver.findElement(By.id("username"));
		//WebElement Password = driver.findElement(By.id("password"));
		//WebElement loginbutton = driver.findElement(By.id("loginBtn"));
		
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.presenceOfElementLocated(email1));
		
		//email1.sendKeys("sdhg");
	}

}
