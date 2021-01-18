package seleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowPopuphandleAssignment {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		driver.findElement(By.linkText("Good PopUp #4")).click();
		
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		String ParentWindowID= it.next();
		System.out.println("ParentWindowID: "+ ParentWindowID);
		
		String ChildWindowID= it.next();
		System.out.println("ChildWindowID(Popup#3): "+ ChildWindowID);
		
		String ChildWindowID2= it.next();
		System.out.println("ChildWindowID(Popup#4): "+ ChildWindowID2);
		
		driver.switchTo().window(ChildWindowID);
		System.out.println("child Window current URL: " +driver.getCurrentUrl());
		System.out.println("child Window Title: " +driver.getTitle());
		driver.close();
		
		
		driver.switchTo().window(ChildWindowID2);
		System.out.println("child Window current URL: " +driver.getCurrentUrl());
		System.out.println("child Window Title: " +driver.getTitle());
		driver.close();
		
		
		driver.switchTo().window(ParentWindowID);
		System.out.println("Parent Window current URL: " +driver.getCurrentUrl());
		System.out.println("Parent Window Title:  " +driver.getTitle());
		driver.close();
		
		
		
		
		
		
		
	}

}
