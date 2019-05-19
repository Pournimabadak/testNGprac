package TestSuite;

import org.testng.annotations.Test;

public class TC01 {

	
	@Test(priority = 1)
	public void login()
	{
		System.out.println("login");
	}
	
	@Test(priority = 2)
	public void radios()
	{
		System.out.println("radios");
	}
	
	@Test(priority = 3)
	public void dropdown()
	{
		System.out.println("dropdown");
	}
}
