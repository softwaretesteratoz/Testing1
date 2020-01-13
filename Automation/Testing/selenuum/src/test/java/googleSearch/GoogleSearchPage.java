package googleSearch;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchPage {

	private static WebDriver driver = null;
	
	public static void main(String[] args) throws NullPointerException, InterruptedException {
		try {
		googlesearch();
		
		driver.close();
		}
		catch (NullPointerException e) {
			e.printStackTrace();
		}
	}
	
	public static void googlesearch () throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "/home/divyanshi/Downloads/Browser driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		LocaterClass.textbox(driver).sendKeys("Tarun Sarsode");
		Thread.sleep(3);
	//	LocaterClass.button(driver).sendKeys(Keys.RETURN); 
		LocaterClass.button(driver).click();
	}

}
