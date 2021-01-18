package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandles {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://londonfreelance.org/courses/frames/index.html");
		List<WebElement> elementFrame=driver.findElements(By.tagName("frame"));
		System.out.println("Number of Frames : "+elementFrame.size());
		//WebElement element = driver.findElement(By.name("main"));
		
		//driver.switchTo().frame(element);
		
		driver.switchTo().frame("main");
		
		//driver.switchTo().frame(2);
		
		WebElement WE = driver.findElement(By.cssSelector("body > h2"));
		System.out.println(WE.getText());
		
		driver.switchTo().defaultContent();
		
	}

}
