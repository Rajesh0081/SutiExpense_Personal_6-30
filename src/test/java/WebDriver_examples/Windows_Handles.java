package WebDriver_examples;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Handles {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver(); // it is going to open new Chrome Browser
		driver.manage().window().maximize();
		driver.get("https://apps17.sutisoft.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("rajeshv@sutisoft.in");
		
		driver.findElement(By.id("userpassword")).sendKeys("test@1234");
		
		driver.findElement(By.xpath("//button[@class='btn login-btn']")).click();
		
		driver.findElement(By.xpath("(//a[@class='nav-link'])[7]")).click();
		
		driver.findElement(By.xpath("(//a[@class='dropdown-item'])[17]")).click();
		
		Set<String> window=driver.getWindowHandles();
		
		Iterator<String> it=window.iterator();
		
		String parent=it.next();
		
		String child=it.next();
		
		//String gc=it.next();
		
		//String bc=it.next();
		
		driver.switchTo().window(parent);
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//a[@class='nav-link'])[6]")).click();
		
		

	}

}
