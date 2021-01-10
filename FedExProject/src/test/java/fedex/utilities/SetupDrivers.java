package fedex.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupDrivers {

	
	public static WebDriver driver;
	
	public static void setChromeDriver() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
				
	}
	
	
	
	public static void closeDriver() {
		driver.quit();
	}
	
	
	
}
