package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcept {

	public static void main(String[] args) {
//open the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
	
		driver.get("http://google.com");// enter URL

		String title = driver.getTitle();
		System.out.println(title);
		driver.navigate().to("https://www.amazon.com");

		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.navigate().back();

		String title2 = driver.getTitle();
		System.out.println(title2);
		driver.navigate().forward();

		String title3 = driver.getTitle();
		System.out.println(title3);
		driver.navigate().back();

		String title4 = driver.getTitle();
		System.out.println(title4);
		driver.navigate().refresh();
		
	}

}
