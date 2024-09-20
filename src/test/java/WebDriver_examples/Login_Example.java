package WebDriver_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Login_Example {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver(); // it is going to open new Chrome Browser
		
		driver.get("https://apps17.sutisoft.com/");
		
		Thread.sleep(60000);
		
		driver.findElement(By.name("username")).sendKeys("rajeshv@sutisoft.in");
		
		driver.findElement(By.id("userpassword")).sendKeys("test@1234");
		
		driver.findElement(By.xpath("//button[@class='btn login-btn']")).click();

	}

}
