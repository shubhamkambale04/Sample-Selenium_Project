package day42.TestNG;

import org.testng.annotations.Test;

public class MyFirstTestCase {
	
	@Test
	void openapp()
	{
	System.out.println("opening browser");	
	}
	
	@Test(priority=1)
	void login()
	{
		System.out.println("login");
	}
	
	@Test(priority=2)
	void logout()
	{
		System.out.println("logout");
	}

}
