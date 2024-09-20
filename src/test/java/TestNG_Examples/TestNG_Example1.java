package TestNG_Examples;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG_Example1 {
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("This is a before suite method");
	}
	
	
	
	
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("This is a after suite method");	
	}
	
	@Test 
	public void main() {
		System.out.println("This is a main method");
	}

}
