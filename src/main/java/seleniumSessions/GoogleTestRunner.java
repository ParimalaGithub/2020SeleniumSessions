package seleniumSessions;

public class GoogleTestRunner {

	public static void main(String[] args) {
		
		Thread t1= new GoogleFeaturthread("chrome thread", "chrome");
		Thread t2= new GoogleFeaturthread("FireFox thread", "firefox");
		System.out.println("Thread Started.......");
		t1.start();
		t2.start();
	}

}
/*//i18n-string
//"Please enter your log in code"
.....................
Sequence:
..........
Before Suite
Before Test
Before class

Before Method
Test1
After Method

Before Method
Test2
After Method

Before Method
Test3
After Method

After Class
After Test
After Suite
.....................................
Executed only once
...................
Before Suite
Before Test
Before class

After Class
After Test
After Suite
.......................

Executed many times
Before Method
Test1
After Method*/