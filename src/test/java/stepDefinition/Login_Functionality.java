package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Functionality {
	public WebDriver driver;
	
	@Given("Open SutiExpense Application")
	public void launch() {
		 driver=new EdgeDriver();
		driver.get("https://apps17.sutisoft.com/");
	}
	
	
	@When("Providing Valid Username and password")
	public void login() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("rajeshv@sutisoft.in");
		
		driver.findElement(By.id("userpassword")).sendKeys("test@1234");
		
		driver.findElement(By.xpath("//button[@class='btn login-btn']")).click();
	}
	
	
	@Then("Login Page should display")
	public void close() {
		driver.close();
	}

}
