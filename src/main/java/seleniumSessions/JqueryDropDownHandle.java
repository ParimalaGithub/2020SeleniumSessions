package seleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		//justAnInputBox
		driver.findElement(By.id("justAnInputBox")).click();
		//selectChoiceValues(driver,"choice 2");
		//selectChoiceValues(driver,"choice 2 3");
		//selectChoiceValues(driver,"choice 6 2 3");
		selectChoiceValues(driver,"choice 5","choice 2","choice 2 3","choice 6 2 3");
		selectChoiceValues(driver,"ALL");
		
	}
	
		public static void selectChoiceValues(WebDriver driver,String... value)
		{
		List<WebElement>choiceList = driver.findElements(By.xpath("//div[@class='comboTreeDropDownContainer']//ul//li/span[@class='comboTreeItemTitle']"));
		// //body/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/span[2]
		System.out.println(choiceList.size());
		if(!value[0].equalsIgnoreCase("ALL"))
		{
		for(int i=0;i<choiceList.size();i++)
		{
			System.out.println(choiceList.get(i).getText());
			String text= choiceList.get(i).getText();
			for(int j= 0;j<value.length;j++)
			{
			if(text.equals(value[j]))
			{
				choiceList.get(i).click();
				break;
			}
			}
		}
		}
		else
		{
			for(int j=0;j<choiceList.size();j++)
			{
				System.out.println(choiceList.get(j).getText());
				
					choiceList.get(j).click();
					
			}
		}
	}

}

