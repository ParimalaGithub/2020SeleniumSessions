package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpath2 {

	public static void main(String[] args) {
		//div[@class='private-form__input-wrapper']//following::div
		//div[@class='input-group']/input[@name='username']
		//div[@class='input-group']//following ::input[@name='username']
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		System.out.println(driver.findElement(By.xpath("//input[@name='username']//parent::div")).getText());
		driver.findElement(By.xpath("//input[@name='username']//parent::div")).click();
		driver.findElement(By.xpath("//div[@class='input-group']//child::input")).click();
		//driver.findElement(By.xpath("//div[@class='input-group']//following::input)[1]")).click();
		//driver.findElement(By.xpath("//div[@class='input-group']/input[@name='username]")).click();
	}

}
