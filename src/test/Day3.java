package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	@BeforeClass
	public void demo()
	{
		System.out.println("Before Class");
	}
	@Parameters({"URL"})
	@Test
	public void WebCarLoan(String urlname)
	{
		System.out.println("WebCarLoan");
		System.out.println(urlname);
	}
	
	@Test
	public void MobileCarLoan()
	{
		System.out.println("MobileCarLoan");
	}
	
	@Test
	public void APICarLoan()
	{
		System.out.println("APICarLoan");
	}
	
	@BeforeMethod
	public void before_every_method() 
	{
		System.out.println("I'm executing before every method in class Day 3");
	}
	
	@AfterMethod
	public void after_every_method() 
	{
		System.out.println("I'm executing after every method in class Day 3");
	}
}
