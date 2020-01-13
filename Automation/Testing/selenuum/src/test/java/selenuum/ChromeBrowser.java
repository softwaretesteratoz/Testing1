package selenuum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
	
	public static void main(String[] args)
	{
		
		String Projectpath = System.getProperty("user.dir");
		System.out.println("Projectpath : "+Projectpath);
		
		System.setProperty("webdriver.chrome.driver", "/home/divyanshi/Downloads/Browser driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.deepplay.org");
	}

}
