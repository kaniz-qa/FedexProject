package fedex.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import fedex.elements.AboutToHomeElements;
import fedex.utilities.SetupDrivers;

public class AboutToHomeActions {

	
	
	AboutToHomeElements aboutHomeEle;
	
	
	public AboutToHomeActions() {		
		this.aboutHomeEle = new  AboutToHomeElements();
		PageFactory.initElements(SetupDrivers.driver, aboutHomeEle);
	}	

	
	public void pageOpen() {			
							
		SetupDrivers.driver.get("https://www.fedex.com/en-us/home.html");
		SetupDrivers.driver.manage().window().maximize();	
		SetupDrivers.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
	}
	
	public void aboutFedex() throws InterruptedException {
		Thread.sleep(3000);
		aboutHomeEle.aboutFedex.click();
		Thread.sleep(3000);
	}
	
	public void seeHisLink() throws InterruptedException {
		aboutHomeEle.seeHisBtn.click();
		Thread.sleep(3000);
		//SetupDrivers.driver.navigate().to("https://www.fedex.com/en-us/home.html");
		SetupDrivers.driver.navigate().back();
		SetupDrivers.driver.navigate().back();
		
	}
	
	public void aboutText() {
		
		JavascriptExecutor jse = (JavascriptExecutor)SetupDrivers.driver;
		jse.executeScript("window.scrollTo( document.body.scrollHeight,0)");
		
		aboutHomeEle.aboutText.isDisplayed();
		
	}
	
	
}
