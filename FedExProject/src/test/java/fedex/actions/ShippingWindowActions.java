package fedex.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import fedex.elements.ShippingWindowElements;
import fedex.utilities.SetupDrivers;


public class ShippingWindowActions {

	
	
	ShippingWindowElements shippingWinEle;
	
	public ShippingWindowActions() {
		this.shippingWinEle = new ShippingWindowElements();
		PageFactory.initElements(SetupDrivers.driver, shippingWinEle);
	}
	
	public void pageOpen() {			
		
		SetupDrivers.driver.get("https://www.fedex.com/en-us/home.html");
		SetupDrivers.driver.manage().window().maximize();	
		SetupDrivers.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
	}
	
	public void returnPkg() throws InterruptedException {
		shippingWinEle.returnPkg.click();
		Thread.sleep(2000);
	}
	
	
	public void createLabel() throws InterruptedException {
		shippingWinEle.createLabel.click();
		Thread.sleep(2000);
		
		
	}
	
	public void returnInfo() throws InterruptedException {
		
		
		for (String winHandle : SetupDrivers.driver.getWindowHandles()) {
			SetupDrivers.driver.switchTo().window(winHandle);
		}
				
		shippingWinEle.yourName.sendKeys("Hello");
		Thread.sleep(2000);
		shippingWinEle.returnName.sendKeys("World");
		Thread.sleep(2000);
	}
	
	public void continueButton() throws InterruptedException {
		shippingWinEle.continueButton.click();
		Thread.sleep(2000);
	}
	
	public void errorMsg() throws InterruptedException {
		shippingWinEle.errorMsg.isDisplayed();
		Thread.sleep(2000);
	}
	
	
	
}
