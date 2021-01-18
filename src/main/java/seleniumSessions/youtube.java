package seleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class youtube {

	

		WebDriver driver;
		
		@Test(priority=1)
		public void SetUp()
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().fullscreen();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.get("https://www.youtube.com/results?search_query=nursery+rhymes+for+babies");
					
		}
		@Test(priority=2, enabled=false)
		public void tearDown() {
			driver.quit();
		}

	}


