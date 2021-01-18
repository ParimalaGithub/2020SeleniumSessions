package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util
{

	WebDriver driver;
	
	public Util(WebDriver driver)
	{
		this.driver = driver;
	}
	//This method is used to create the webEement on the basis of By locator
	public WebElement getElement(By locator)
	{
		WebElement element = null;
		
		try {
			 WaitForElement(locator, 10);
		 element = driver.findElement(locator);
		}
		catch(Exception e)
		{
			System.out.println("some exception occurred while creating the webelement....");
			System.out.println(e.getMessage());
		}
		return element;
	}
	
	// This method is used to click an element
	public void doClick(By locator)
	{
		
		try
		{
		getElement(locator).click();
		}
		catch(Exception e)
		{
			System.out.println("some exception occurred while creating the webelement....");
			System.out.println(e.getMessage());
		}
		
	}
	
	public void doSendKeys(By locator, String value)
	{
		try {
		
			getElement(locator).sendKeys(value);
		}
		catch(Exception e)
		{
			System.out.println("some exception occurred while creating the webelement....");
			System.out.println(e.getMessage());
		}
	}
	public void WaitForElement(By locator,int timeout)
	{
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	public String WaitForTitle(String actual,int timeout)
	{
	
	WebDriverWait wait1 = new WebDriverWait(driver,timeout);
	wait1.until(ExpectedConditions.titleContains("Hub"));
	return driver.getTitle();
	}
	
}
