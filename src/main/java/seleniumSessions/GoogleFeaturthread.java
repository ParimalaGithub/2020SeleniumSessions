package seleniumSessions;

public class GoogleFeaturthread extends Thread {

	public String browserName;
	GooglePage googlePage;
	public GoogleFeaturthread(String ThreadName, String browserName)
	{
		super(ThreadName);
		this.browserName = browserName;
		googlePage = new GooglePage();

	}
	@Override
	public void run()
	{
	System.out.println("thread -started "+ Thread.currentThread().getName());
	try
	{
		Thread.sleep(2000);
		googlePage.setUp(this.browserName);
		googlePage.googleSearchTest();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		googlePage.teardown();
	}
	System.out.println("thread -ended "+ Thread.currentThread().getName());
	}
	}

