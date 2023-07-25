package PagesAndObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class GoogleSearchPageObjects {
	
	WebDriver driver = null;
	
	By serchTextBox = By.name("q");
	By googleSearchButton = By.name("btnK");
	
	public GoogleSearchPageObjects (WebDriver driver) {
		this.driver = driver;
	}
	
	public void EnterText (String Text) {
		driver.findElement(serchTextBox).sendKeys(Text);
	}
	
	public void ClickReturn () {
		driver.findElement(serchTextBox).sendKeys(Keys.RETURN);
	}

}
