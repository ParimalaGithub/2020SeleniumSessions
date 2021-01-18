package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollUpDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("SoftwareTestingHelp");
        element.sendKeys(Keys.ENTER);
        js.executeScript("window.scrollBy(1000,0)");
        js.executeScript("window.scrollBy(0,1000)");
        //js.executeScript("window.scrollBy(3000,0)");
		

	}

}
