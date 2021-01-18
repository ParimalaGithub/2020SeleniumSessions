package com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	WebDriver driver;
	By Username = By.id("username");
	By password = By.id("password");
	By login = By.id("loginBtn");
	By signup = By.linkText("Sign up");
	By loginPage = By.linkText("Please enter your log in code");
	@BeforeTest
	@Parameters({"url","browserName"})
	public void setup(String url1, String browsername)
	{
		if(browsername.equals("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		}
		else if(browsername.equals("firefox"))
		{
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
		}
		driver.get(url1);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	@Test
	@Parameters({"username","password"})
	public void LoginTest1(String uName, String pwd)
	{
		String LoginPageTitle; 
		driver.findElement(Username).sendKeys(uName);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(login).click();
		LoginPageTitle = driver.getTitle();
		Assert.assertEquals(LoginPageTitle, "Please enter your log in code");
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	

}
