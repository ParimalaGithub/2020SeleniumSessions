package TestNGSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	//Before ----BS BT BC BM
	//Test  -----@Test
	//After -----AM AC AT AS
	
	WebDriver driver;
	By Username = By.id("username");
	By password = By.id("password");
	By login = By.id("loginBtn");
	By signup = By.linkText("Sign up");
	By loginPage = By.linkText("Please enter your log in code");
	@BeforeSuite
	public void enableconnection()
	{
		System.out.println("BeforeSuite-Enable Connection");
	}
	@BeforeClass
	public void enableDb()
	{
		System.out.println("BeforeClass-Enable DbConnection");
	}
	@BeforeTest()
	public void beforetest1()
	{
		System.out.println("BeforeTest-Enable DbConnection");
	}
	@BeforeMethod
	public void beforeMethod1()
	{
		System.out.println("BeforeMethod-Enable DbConnection");
	}
	
	@Test(priority=1,enabled=true)
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://app.hubspot.com");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	@Test(priority=2,enabled=true)
	public void signUpLinkTest()
	{
		Assert.assertTrue(driver.findElement(signup).isDisplayed());
		
	}
	@Test(priority=3,enabled=true)
	public void TitlePageTest()
	{
		Assert.assertEquals(driver.getTitle(),"HubSpot Login");
	}
	
	@Test(priority=4,enabled=false)
	public void LoginTest()
	{
		String LoginPageTitle; 
		driver.findElement(Username).sendKeys("testqa774@gmail.com");
		driver.findElement(password).sendKeys("Test123456$");
		driver.findElement(login).click();
		LoginPageTitle = driver.getTitle();
		Assert.assertEquals(LoginPageTitle, "Please enter your log in code");
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
	@AfterSuite
	public void disableconnection()
	{
		System.out.println("AfterSuite-Enable Connection");
	}
	@AfterClass
	public void disableDb()
	{
		System.out.println("AfterClass-disable DbConnection");
	}
	@AfterTest(enabled=false)
	public void Aftertest1()
	{
		System.out.println("afterTest-disable DbConnection");
	}
	@AfterMethod()
	public void AfterMethod1()
	{
		System.out.println("AfterMethod-disable DbConnection");
	}

}
