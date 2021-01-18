package com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpTest {

	WebDriver driver;
	By SignUp = By.linkText("Sign up");
	By CreateYourAccout= By.linkText("Create your free account");
	By HaveanAccount =By.xpath("//span[contains(text(),'Have an account? ')]");
	@BeforeTest
	@Parameters({"url","browserName"})
	public void setup(String url, String browsername)
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
		driver.get(url);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void verifyCreateAccountTest()
	{
		//driver.findElement(SignUp).click();
		System.out.println(driver.findElement(CreateYourAccout).getText());
		driver.findElement(HaveanAccount).click();
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
}
