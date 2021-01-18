package seleniumSessions;

import java.awt.Window;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement UserName = driver.findElement(By.id("login1"));
		UserName.sendKeys("asgjhasa");
		WebElement Signin = driver.findElement(By.name("proceed"));
		Signin.click();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		if(text.equals("Please enter your password"))
		{
			System.out.println("correct message-PASS");
		}
		else
			System.out.println("incorrect message-FAIL");
		alert.accept();
	}

}
