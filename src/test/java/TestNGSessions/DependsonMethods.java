package TestNGSessions;

import org.testng.annotations.Test;

public class DependsonMethods {
	@Test
	public void login()
	{
		System.out.println("Login Test"); 
		
	}
	
	@Test(dependsOnMethods= "login")
	public void Home()
	{
		System.out.println("HomePage Test");
		int i=9/0;
	}
	
	@Test(dependsOnMethods= {"login","Home"})
	public void Search()
	{
		System.out.println("SearchContext Test");
	}
}
