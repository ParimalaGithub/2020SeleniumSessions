package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutSelect {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		List<WebElement> WE = driver.findElements(By.xpath("//tbody/tr[22]/td[3]/select[1]/option"));
		System.out.println(WE.size());
				for(int i=0;i<WE.size();i++)
				{
					String text = WE.get(i).getText();
					System.out.println(text);
					if(text.equals("25"))
					{
						WE.get(i).click();
						break;
					}
				}

	}

}

