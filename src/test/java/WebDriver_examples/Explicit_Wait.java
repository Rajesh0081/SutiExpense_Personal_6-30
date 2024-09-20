package WebDriver_examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver(); // it is going to open new Chrome Browser
		
		driver.get("https://apps17.sutisoft.com/");
		
		Thread.sleep(6000);
		
		driver.findElement(By.name("username")).sendKeys("rajeshv@sutisoft.in");
		
		driver.findElement(By.id("userpassword")).sendKeys("test@1234");
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn login-btn']"))).click();

	}

}
