package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://mrbool.com/");
		
		Actions action= new Actions(driver);
		
		WebElement element = driver.findElement(By.className("menulink"));
		
		action.moveToElement(element).build().perform();
		
		Thread.sleep(2000);
		
		
		
		WebElement element1 = driver.findElement(By.cssSelector("#headermenudesktop > ul > li > ul > li:nth-child(2) > a"));
		
		element1.click();
		System.out.println(driver.getCurrentUrl());
		
	}

}
