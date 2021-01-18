package seleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowPopUpHandle {
	public static void main(String[] args) {

		String ParentWindowID = null;String ChildWindowID = null;
		WebDriverManager.chromedriver().setup();
		//Good PopUp #3
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		ParentWindowID=it.next();
		System.out.println("Parent Window id: "+ParentWindowID);
		
		ChildWindowID=it.next();
		System.out.println("Parent Window id: "+ChildWindowID);
		
		driver.switchTo().window(ChildWindowID);
		System.out.println("child Window current URL: " +driver.getCurrentUrl());
		System.out.println("child Window Title: " +driver.getTitle());
		driver.close();
		
		driver.switchTo().window(ParentWindowID);
		System.out.println("Parent Window current URL: " +driver.getCurrentUrl());
		System.out.println("Parent Window Title:  " +driver.getTitle());
		driver.close();
		
		
	}

}
