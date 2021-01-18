package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllLinks {

	public static void main(String[] args) {
		WebElement element;
		List<WebElement> element1;
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		 element = driver.findElement(By.name("q"));
        element.sendKeys("SoftwareTestingHelp");
        element.sendKeys(Keys.ENTER);
        element1= driver.findElements(By.tagName("a"));
        System.out.println(element1.size());
        for(WebElement link2:element1)
        {
        	System.out.println(link2.getAttribute("href"));
        	System.out.println(link2.getText());
        }
        

	}

}
