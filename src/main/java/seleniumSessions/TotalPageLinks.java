package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalPageLinks {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.com");
		List<WebElement>Linklists=driver.findElements(By.tagName("a"));
		int n= Linklists.size();
		System.out.println(n);
		for(int i=0;i<n;i++)
		{
			System.out.println(Linklists.get(i).getText());
		}
	}

}