package seleniumSessions;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWait {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://classic.crmpro.com/");
		By username = By.name("username");
		By password = By.name("password");
		/*Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(15)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		wait.until(new Function<WebDriver, WebElement>(){

			@Override
			public WebElement apply(WebDriver t) {
				// TODO Auto-generated method stub
				return null;
			}
			
		});*/
	
	}
	

}
