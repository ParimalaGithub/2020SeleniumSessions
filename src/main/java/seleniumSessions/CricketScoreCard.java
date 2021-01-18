package seleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricketScoreCard {

	public static void main(String[] args) {
	//https://www.espncricinfo.com/series/18042/scorecard/1226952/sydney-thunder-women-vs-sydney-sixers-women-48th-match-womens-big-bash-league-2020-21
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/8048/scorecard/1237181/delhi-capitals-vs-mumbai-indians-final-indian-premier-league-2020-21");
		//driver.get("https://www.espncricinfo.com/series/18042/scorecard/1226952/sydney-thunder-women-vs-sydney-sixers-women-48th-match-womens-big-bash-league-2020-21");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		scoreCard(driver,"S Dhawan");
		
	}

	public static void  scoreCard(WebDriver driver, String name )
	{
		//ArrayList<String> a = new ArrayList<String>(); 

	
		List<WebElement> myList= driver.findElements(By.xpath("//a[contains(text(),'"+name+"')]//parent::td//following-sibling::td"));
		System.out.println(myList.size());
		for(int i=1;i<myList.size();i++)
		{
			  
				System.out.print(myList.get(i).getText()+"\t");
		}
		
		
	}
}
