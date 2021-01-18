package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetDropDownMethods {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement date= driver.findElement(By.xpath("//tbody/tr[22]/td[3]/select[1]"));
		listOfValues(date);
		WebElement Year= driver.findElement(By.xpath("//tbody/tr[22]/td[3]/select[3]"));
		listOfValues(Year);
		WebElement Month= driver.findElement(By.xpath("//tbody/tr[22]/td[3]/select[2]"));
		listOfValues(Month);
		
		/*Select select = new Select(date);
		List<WebElement>dateList=select.getOptions();
		System.out.println(dateList.size());
		for(int i=0;i<dateList.size();i++)
		{
			System.out.println(dateList.get(i).getText());
		}*/
		}
	public static void listOfValues(WebElement WE)
	{
		System.out.println("================================================================================================");
		Select select = new Select(WE);
		List<WebElement>TotalList=select.getOptions();
		System.out.println(TotalList.size());
		for(int i=0;i<TotalList.size();i++)
		{
			System.out.println(TotalList.get(i).getText());
		}
	}

}
