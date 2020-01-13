package googleSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocaterClass {

	private static WebElement element = null;
	
	static WebElement textbox(WebDriver driver) {
		
		WebElement elemnet = driver.findElement(By.xpath("/html//form[@id='tsf']//div[@class='a4bIc']/input[@role='combobox']"));
		return elemnet;
	}
	
	static WebElement button(WebDriver driver) {
		WebElement button = driver.findElement(By.name("btnK"));
		return element;
	}

	
}
