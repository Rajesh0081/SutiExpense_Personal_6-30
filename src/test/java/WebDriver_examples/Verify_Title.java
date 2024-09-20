package WebDriver_examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Title {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://apps17.sutisoft.com/");
		
	String title=	driver.getTitle();
	System.out.println(title);
	
	
	if (driver.getTitle().equals("Login | SutiExpense")) {
		System.out.println("tile is matched ");
		
	} else {

		System.out.println("Title is not matched"+driver.getTitle());
	}

	}

}
