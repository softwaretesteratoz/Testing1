package selenuum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowaserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","/home/divyanshi/Downloads/Browser driver/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.deepplay.org");
	}

}
