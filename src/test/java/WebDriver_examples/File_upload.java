package WebDriver_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_upload {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver(); // it is going to open new Chrome Browser
		
		driver.get("https://apps17.sutisoft.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("rajeshv@sutisoft.in");
		
		driver.findElement(By.id("userpassword")).sendKeys("test@1234");
		
		driver.findElement(By.xpath("//button[@class='btn login-btn']")).click();
		
		driver.findElement(By.xpath("(//img[@id='acuserImg'])[1]")).click();
		
		driver.findElement(By.xpath("//ul[@id='userDropDownMenuId']/li[2]")).click();
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\dell\\Desktop\\Interview Questions.png");
		
		


	}

}
