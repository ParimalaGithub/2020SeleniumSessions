package seleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowPopuphandleAssignment2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String ParentWindowId= it.next();
		System.out.println("ParentWindowID: "+ ParentWindowId);
		
		String ChildWindowID= it.next();
		System.out.println("ChildWindowID(Popup#3): "+ ChildWindowID);
		
		driver.switchTo().window(ChildWindowID);
		System.out.println("ChildWindowID(Popup#3): " +driver.getCurrentUrl());
		System.out.println("child Window Title: " +driver.getTitle());
		driver.close();
		
		driver.switchTo().window(ParentWindowId);
		driver.findElement(By.linkText("Good PopUp #4")).click();
		Set<String> handles1 = driver.getWindowHandles();
		Iterator<String> it1 = handles1.iterator();
		String newParentWindowId= it1.next();
		System.out.println("New ParentWindowID: "+newParentWindowId);
		
		String ChildWindowID2= it1.next();
		System.out.println("ChildWindowID(Popup#4): "+ChildWindowID2);
		driver.switchTo().window(ChildWindowID2);
		System.out.println("child Window current URL: " +driver.getCurrentUrl());
		System.out.println("child Window Title: " +driver.getTitle());
		driver.close();
		
		//driver.switchTo().window(ParentWindowId);
		driver.switchTo().window(newParentWindowId);
		System.out.println("Parent Window current URL: " +driver.getCurrentUrl());
		System.out.println("Parent Window Title:  " +driver.getTitle());
		
		
	}

}
