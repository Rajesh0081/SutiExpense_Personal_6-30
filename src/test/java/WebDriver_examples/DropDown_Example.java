package WebDriver_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Example {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		
		Thread.sleep(5000);
		
//		Select lstbox=new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[7]/div/div/div/div[2]/div/svg")));
//		//lstbox.selectByIndex(3);
//		
//		Thread.sleep(2000);
//		//lstbox.selectByValue("4");
//		lstbox.selectByVisibleText("Green");
		
				Select lstbox=new Select(driver.findElement(By.xpath("//div[@class='css-1hwfws3'])[3]")));

	}

}
