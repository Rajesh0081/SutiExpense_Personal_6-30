package TestNG_Examples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Ex3 {
@BeforeClass
	
	public void beforesuite() {
		System.out.println("This is a before class method");
	}
	
	
	
	
	
	@AfterClass
	public void aftersuite() {
		System.out.println("This is a after class method");	
	}
	
	@Test 
	public void main() {
		System.out.println("This is a main method");
	}

}
