package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day2 {
	
	@Test(timeOut=4000)
	public void webTest()
	{
		System.out.println("Login");
	}
	
	@AfterTest
	public void starting()
	{
		System.out.println("I will execute last");
	}
	
	@AfterSuite
	public void testSiute2()
	{
		System.out.println("Testing after suite");
	}
	@Test(dependsOnMethods= {"webTest"})
	public void abcTest()
	{
		System.out.println("Logout");
	}

}
