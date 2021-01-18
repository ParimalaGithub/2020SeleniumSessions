package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Util util = new Util(driver);
		driver.get("https://app.hubspot.com/login");
		String title= util.WaitForTitle("Hub",10);
		System.out.println(title);
		//Thread.sleep(5000);
		
	
		By username = By.id("username");
		By password = By.id("password");
		By Login = By.id("loginBtn");
		
		/*util.getElement(username).sendKeys("jdgjd");
		util.getElement(password).sendKeys("egwgheh");
		util.getElement(Login).click();*/
		util.WaitForElement(username,10);
		util.doSendKeys(username, "test123@gmail.com");
		util.doSendKeys(password, "TestTest");
		util.WaitForElement(username,5);
		util.doClick(Login);
				
		
	}

}
