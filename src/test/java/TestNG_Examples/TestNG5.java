package TestNG_Examples;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG5 {
	
@BeforeMethod
	
	public void beforesuite() {
		System.out.println("This is a before method ");
	}
	
	
	
	
	
	@AfterMethod
	public void aftersuite() {
		System.out.println("This is a after method");	
	}
	
	@Test (enabled = true)
	public void main() {
		System.out.println("This is a main method");
	}

	

	@Test (dependsOnMethods = "main" )
	public void main2() {
		System.out.println("This is a main2 method");
	}
	
	@Test (dependsOnMethods = "main2" )
	public void main3() {
		System.out.println("This is a main3 method");
	}


}
