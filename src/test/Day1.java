package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day1 {

	@AfterClass
	public void demo()
	{
		System.out.println("After Class");
	}
	
	
	@Test
	public void demo2()
	{
		System.out.println("Test");
	}
	
	@BeforeSuite
	public void testSiute1()
	{
		System.out.println("Testing before suite");
	}
}
