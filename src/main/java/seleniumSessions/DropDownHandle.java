package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		WebElement date= driver.findElement(By.xpath("//tbody/tr[22]/td[3]/select[1]"));
		SelectbyValue(date,"10");
		//Select select= new Select(day);
		//select.selectByValue("10");
		//DOB_Month4303cce6
		WebElement Year= driver.findElement(By.xpath("//tbody/tr[22]/td[3]/select[3]"));
		//Select select2= new Select(Year);
		//select2.selectByValue("1981");
		SelectbyValue(Year,"1981");
		
		WebElement Month= driver.findElement(By.xpath("//tbody/tr[22]/td[3]/select[2]"));
		//Select select1= new Select(Month);
		//select1.selectByIndex(1);
		//DOB_Year4303cce6
		SelectbyValue(Month,"05");
		
	}
	public static void SelectbyValue(WebElement Element, String value)
	{
		Select select= new Select(Element);
		select.selectByValue(value);	
		
	}

}
