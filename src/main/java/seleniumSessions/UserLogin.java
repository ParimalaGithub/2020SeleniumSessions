package seleniumSessions;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserLogin {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//By username = By.id("username");
		doLogin(driver,getUserMap(),"Patient");
	}
	public static Map<String, String> getUserMap()
	{
		Map<String,String> userMap = new HashMap<String,String>();
		userMap.put("admin", "admin_admin");
		userMap.put("Patient", "tom@gmail.com_Test123$");
		userMap.put("Doctor", "Spaulding@gmail.com_TestDoc123$");
		return userMap;
	}
	public static void doLogin(WebDriver driver,Map<String, String> userMap,String UserKey)
	{
		driver.findElement(By.id("username")).sendKeys(userMap.get(UserKey).split("_")[0]);
		driver.findElement(By.id("password")).sendKeys(userMap.get(UserKey).split("_")[1]);
	}

}
