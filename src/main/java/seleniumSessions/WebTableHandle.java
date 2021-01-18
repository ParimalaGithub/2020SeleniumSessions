package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//*[@id="customers"]
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.findElement(By.xpath("//table[@id='customers']//tr")).click();
		//*[@id="customers"]/tbody/tr[1]/th[1]
		int size= driver.findElements(By.xpath("//table[@id='customers']//tr")).size()-1;
		System.out.println(size);
		System.out.println(driver.findElement(By.xpath("//*[@id='customers']")).getText());
		//*[@id="customers"]/tbody/tr[2]/td[1] //*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[2]/td[2]
		//*[@id="customers"]/tbody/tr[2]/td[3]
		System.out.println("***********************************");
	/*	String BeforeXPath = "//*[@id='customers']/tbody/tr[";
		String AfterXpath = "]/td[1]";
		for(int i=2;i<=size+1;i++)
		{
		String ActualXpath = BeforeXPath+i+AfterXpath;
		String RowValue=driver.findElement(By.xpath(ActualXpath)).getText();
		System.out.println(RowValue);
		}
		System.out.println("***********************************");
		
		//*[@id="customers"]/tbody/tr[2]/td[2]
		//*[@id="customers"]/tbody/tr[3]/td[2]
		String BeforeXPath1 = "//*[@id='customers']/tbody/tr[";
		String AfterXpath1 = "]/td[2]";
		for(int i1=2;i1<=size+1;i1++)
		{
		String ActualXpath1 = BeforeXPath1+i1+AfterXpath1;
		String RowValue1=driver.findElement(By.xpath(ActualXpath1)).getText();
		System.out.println(RowValue1);
		}
		//*[@id="customers"]/tbody/tr[2]/td[3]
		////*[@id="customers"]/tbody/tr[3]/td[3]
		System.out.println("***********************************");
		String BeforeXPath2 = "//*[@id='customers']/tbody/tr[";
		String AfterXpath2 = "]/td[3]";
		for(int i2=2;i2<=size+1;i2++)
		{
		String ActualXpath2 = BeforeXPath2+i2+AfterXpath2;
		String RowValue2=driver.findElement(By.xpath(ActualXpath2)).getText();
		System.out.println(RowValue2);
		}*/
		for(int j=1;j<=3;j++)
		{
		String BeforeXPath = "//*[@id='customers']/tbody/tr[";
		String AfterXpath = "]/td["+j+"]";
		for(int i=2;i<=size+1;i++)
		{
		String ActualXpath = BeforeXPath+i+AfterXpath;
		String RowValue=driver.findElement(By.xpath(ActualXpath)).getText();
		System.out.println(RowValue);
		}
		System.out.println("***********************************");
	}
	}
	

}
