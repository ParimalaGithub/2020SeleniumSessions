package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class authenticationPopUp {

	public static void main(String[] args) {
		//https://the-internet.herokuapp.com/
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://admin-admin@the-internet.herokuapp.com/");

	}

}
