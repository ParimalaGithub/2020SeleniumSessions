package seleniumSessions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotConcepts {

	public static void main(String[] args) throws InterruptedException, Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		
		WebElement email1 = driver.findElement(By.id("username"));
		WebElement Password = driver.findElement(By.id("password"));
		WebElement loginbutton = driver.findElement(By.id("loginBtn"));
		
		Actions action = new Actions(driver);
		action.sendKeys(email1, "testqa774@gmail.com").build().perform();
		action.sendKeys(Password,"Test123456$").build().perform();
		//action.click(loginbutton).build().perform();

		 /*File SrcFile = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(SrcFile, new File(".//target//screenshots//Page.png"));*/
		TakeScreenShot(email1,"email1");
		TakeScreenShot(Password,"pwd1");
		TakeScreenShot(loginbutton,"login1");
		
	}

	public static void TakeScreenShot(WebElement element, String FName)
	{
		File SrcFile = ((TakesScreenshot)(element)).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(SrcFile, new File(".//target//screenshots//"+FName+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
