package TestNGSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest2 {

	WebDriver driver;
	
	@BeforeMethod
	public void SetUp()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://app.hubspot.com/login");
				
	}
	@Test
	public void loginPageTitleTest()
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.titleContains("HubSpot"));
		String title = driver.getTitle();
		System.out.println("Page Title is:"+title);
		Assert.assertEquals(title, "HubSpot Login"); 
				
	}
	@Test
	public void signUpLinkTest()
	{
		boolean flag= driver.findElement(By.linkText("Sign up")).isDisplayed();
		Assert.assertTrue(flag);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
