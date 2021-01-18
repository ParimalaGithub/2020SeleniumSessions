package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickMouseAction {

	public static void main(String[] args) {
		//https://swisnl.github.io/jQuery-contextMenu/demo.html

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
				WebElement target = driver.findElement(By.className("context-menu-one"));
		Actions action = new Actions(driver);
		action.contextClick(target).build().perform();
		List<WebElement> target1= driver.findElements(By.xpath("//ul/li[contains(@class,'context-menu-item')]/span"));
		
		 System.out.println(target1.size());
		 for(int i=0;i<target1.size();i++)
		 {
			 System.out.println(target1.get(i).getText());
		 }
	}

}
