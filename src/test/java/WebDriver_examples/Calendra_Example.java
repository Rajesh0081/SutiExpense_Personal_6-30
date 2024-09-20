package WebDriver_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendra_Example {

	public static void main(String[] args) throws Exception {
		String month="August 2001";
		
		WebDriver driver=new ChromeDriver(); // it is going to open new Chrome Browser
		
		driver.manage().window().maximize();
		
		driver.get("https://apps17.sutisoft.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("rajeshv@sutisoft.in");
		
		driver.findElement(By.id("userpassword")).sendKeys("test@1234");
		
		driver.findElement(By.xpath("//button[@class='btn login-btn']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[@class='nav-link'])[3]")).click();
		
		driver.findElement(By.xpath("//input[@name='fromDate']")).click();

		while(true) {
		String text=driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]")).getText();
		
		if(text.matches(month)) {
			break;
		}
		else {
			driver.findElement(By.xpath("(//th[@class='prev'])[1]")).click();
		}
		}
		
		driver.findElement(By.xpath("(//td[@class='day'])[2]")).click(); // 16 th day
	}

}
