import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		
		By serchTextBox = By.name("q");
//		By googleSearchButton = By.name("btnK");
		
		driver.findElement(serchTextBox).sendKeys("Kashi Swarnkar");
		driver.findElement(serchTextBox).sendKeys(Keys.RETURN);
//		driver.findElement(googleSearchButton).click();
		
		
		driver.close();
		
		System.out.println("Test Executed Successfully !");

	}

}
