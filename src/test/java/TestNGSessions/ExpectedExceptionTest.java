package TestNGSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionTest {
@Test(expectedExceptions=Exception.class)
public void loginTest()
{
	System.out.println("Login test....started");
	int i= 9/0;
	System.out.println("Login test....ended");
}
@Test(expectedExceptions=ArithmeticException.class)
public void loginTest1()
{
	System.out.println("Login test....started");
	int i= 9/0;
	System.out.println("Login test....ended");
}
@Test(expectedExceptions=NullPointerException.class)
public void loginTest2()
{
	System.out.println("Login test....started");
	int i= 9/0;
	System.out.println("Login test....ended");
}
@Test(expectedExceptions=Throwable.class)
public void loginTest3()
{
	System.out.println("Login test....started");
	int i= 9/0;
	System.out.println("Login test....ended");
}
}
