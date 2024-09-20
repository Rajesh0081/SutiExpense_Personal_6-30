package WebDriver_examples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alert_Example1 {

	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		Alert alt=driver.switchTo().alert();
		
		alt.accept();

	}

}
