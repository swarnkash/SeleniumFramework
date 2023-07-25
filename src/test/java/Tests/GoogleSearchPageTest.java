package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import PagesAndObjects.*;

public class GoogleSearchPageTest {

	private static WebDriver driver = null;
	
	public static void main(String[] args) {
	
		RunGoogleSearchPageTest();
	}
	
	public static void RunGoogleSearchPageTest() {
		
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		GoogleSearchPageObjects pageTest = new GoogleSearchPageObjects(driver);
		
		driver.get("http://google.com");
	
		pageTest.EnterText("Farhan Akhtar");
		pageTest.ClickReturn();
		
	}

}
