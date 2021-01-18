package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //open the browser
		driver.get("http://google.com");// enter URL
		String title = driver.getTitle();
		System.out.println(title);
		//4.Validation Point
		if(title.equals("Google"))
		{
			System.out.println("title is correct");
		}
		else
		{
			System.out.println("title is wrong");
		}
		System.out.println(driver.getCurrentUrl());
		//driver.quit(); // close the browser
		driver.close();
		System.out.println(driver.getTitle());//Exception in thread "main" org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
	}
	

}
