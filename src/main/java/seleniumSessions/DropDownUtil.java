package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownUtil {

	public ArrayList<String> listOfValues(WebElement WE)
	{
		System.out.println("================================================================================================");
		Select select = new Select(WE);
		List<WebElement>TotalList=select.getOptions();
		ArrayList<String> ar = new ArrayList<String>();
		System.out.println(TotalList.size());
		for(int i=0;i<TotalList.size();i++)
		{
			String text = TotalList.get(i).getText();
			ar.add(text);
		}
		return ar;
	}
	public void SelectbyValue(WebElement Element, String value)
	{
		Select select= new Select(Element);
		select.selectByValue(value);	
		
	}
	public void SelectValuewithoutSelect(WebDriver driver,String locator, String value)
	{
		List<WebElement> WE = driver.findElements(By.xpath(locator));
		System.out.println(WE.size());
				for(int i=0;i<WE.size();i++)
				{
					String text = WE.get(i).getText();
					System.out.println(text);
					if(text.equals(value))
					{
						WE.get(i).click();
						break;
					}
				}
	}
	public  ArrayList<String> RightClickAction(WebDriver driver,String locator)
	{
		List<WebElement> target1= driver.findElements(By.xpath(locator));
		ArrayList<String> ar = new ArrayList<String>();
		 System.out.println(target1.size());
		 for(int i=0;i<target1.size();i++)
		 {
			 String ar1 =target1.get(i).getText(); ar.add(ar1);
		 }
		
		return ar;
	}
	

}
