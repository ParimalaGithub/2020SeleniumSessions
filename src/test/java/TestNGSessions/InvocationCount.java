package TestNGSessions;

import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount=10)
	public void Test1()
	{
		System.out.println("Execution 1");
	}

}
