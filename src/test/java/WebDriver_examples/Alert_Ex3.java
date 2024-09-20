package WebDriver_examples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Ex3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//ul[@class='nav nav-tabs nav-stacked']/li[3]")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
	Alert alt=	driver.switchTo().alert();
	
	alt.sendKeys("I am Nikhil");
	
	alt.accept();

	}

}
