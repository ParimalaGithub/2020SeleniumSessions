package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsEvents {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		WebElement email1 = driver.findElement(By.id("username"));
		
		//email1.sendKeys("testqa774@gmail.com");
		WebElement Password = driver.findElement(By.id("password"));
		//Password.sendKeys("Test123456$");
		WebElement loginbutton = driver.findElement(By.id("loginBtn"));
		
		Actions action = new Actions(driver);
		action.sendKeys(email1, "testqa774@gmail.com").build().perform();
		action.sendKeys(Password,"Test123456$").build().perform();
		action.click(loginbutton).build().perform();
		

	}

}
