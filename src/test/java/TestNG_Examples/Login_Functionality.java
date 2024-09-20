package TestNG_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_Functionality {
	public WebDriver driver;
	
	
	@BeforeTest
	public void launch() throws Exception {
		 driver=new EdgeDriver();
		driver.get("https://apps17.sutisoft.com/");
		Thread.sleep(3000);
		
	}
	
	
	
	@AfterTest
	public void close() {
		driver.close();
	}
	
	
	@Test
	public void login() throws Exception {
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("rajeshv@sutisoft.in");
		
		driver.findElement(By.id("userpassword")).sendKeys("test@1234");
		
		driver.findElement(By.xpath("//button[@class='btn login-btn']")).click();

		
	}

}
