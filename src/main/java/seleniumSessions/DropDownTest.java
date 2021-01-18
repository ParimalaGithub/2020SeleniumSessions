package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement date= driver.findElement(By.xpath("//tbody/tr[22]/td[3]/select[1]"));
		WebElement Month= driver.findElement(By.xpath("//tbody/tr[22]/td[3]/select[2]"));
		WebElement Year= driver.findElement(By.xpath("//tbody/tr[22]/td[3]/select[3]"));
		
		String bdate = "20-10-1981";
		String[] bdateval = bdate.split("-");
		DropDownUtil a = new DropDownUtil();
		
		a.SelectbyValue(date, bdateval[0]);
		a.SelectbyValue(Month, bdateval[1]);
		a.SelectbyValue(Year, bdateval[2]);
		
		ArrayList<String> DateList = a.listOfValues(date);
		System.out.println(DateList);
		ArrayList<String> monthList=a.listOfValues(Month);
		System.out.println(monthList);
		ArrayList<String> yearList=a.listOfValues(Year);
		System.out.println(yearList);
		
		String locator = "//tbody/tr[22]/td[3]/select[1]/option";
		a.SelectValuewithoutSelect(driver, locator,bdateval[0]);
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement target = driver.findElement(By.className("context-menu-one"));
		Actions action = new Actions(driver);
		action.contextClick(target).build().perform();
		String locator1 ="//ul/li[contains(@class,'context-menu-item')]/span";
		 ArrayList<String> output = a.RightClickAction(driver, locator1);
		
		

	}

}
