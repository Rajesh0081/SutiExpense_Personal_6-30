package WebDriver_examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_2 {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//ul[@class='oxd-main-menu']/li)[3]")).click();
		
		Thread.sleep(2000);
		
		WebElement element=driver.findElement(By.xpath("(//div[@class='oxd-select-text--after'])[3]"));
		
		element.click();
		
		
		//Select lstbox=new Select(element);
		
			Actions act=new Actions(driver);
			act.sendKeys(Keys.ARROW_DOWN).build().perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.ARROW_DOWN).build().perform();
			act.sendKeys(Keys.ENTER).build().perform();
			
			
			
		
		

	}

}
