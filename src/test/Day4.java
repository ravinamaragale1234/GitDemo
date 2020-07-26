package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day4 {

	
	@Test
	public void WebHomeLoan()
	{
		System.out.println("WebHomeLoan");
	}
	
	@Test
	public void MobileHomeLoan()
	{
		System.out.println("MobileHomeLoan");
	}
	
	@Test
	public void APIHomeLoan()
	{
		System.out.println("APIHomeLoan");
	}
	
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("I will execute first");
	}
}
