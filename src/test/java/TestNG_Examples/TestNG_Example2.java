package TestNG_Examples;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Example2 {
	@BeforeTest
	
	public void beforesuite() {
		System.out.println("This is a before test method");
	}
	
	
	
	
	
	@AfterTest
	public void aftersuite() {
		System.out.println("This is a after test method");	
	}
	
	@Test 
	public void main() {
		System.out.println("This is a main method");
	}

}
