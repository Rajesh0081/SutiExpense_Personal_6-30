package WebDriver_examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://apps17.sutisoft.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("rajeshv@sutisoft.in");

	}

}
