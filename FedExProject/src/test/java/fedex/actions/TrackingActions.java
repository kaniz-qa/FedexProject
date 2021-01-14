package fedex.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;


import fedex.elements.TrackingElements;
import fedex.utilities.SetupDrivers;

public class TrackingActions {

	TrackingElements trackEle;
	
	
	public TrackingActions() {		
		this.trackEle = new  TrackingElements();
		PageFactory.initElements(SetupDrivers.driver, trackEle);
	}	

	
	public void pageOpen() {			
							
		SetupDrivers.driver.get("https://www.fedex.com/en-us/home.html");
		SetupDrivers.driver.manage().window().maximize();	
		SetupDrivers.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
	}
	
	
	public void trackingLink() {
		trackEle.tracking.click();
	}
	
	public void trackingText() {
		trackEle.trackingText.sendKeys("3453456456457");
	}

	public void trackingBtn() {
	
		trackEle.trackingBtn.click();
		
	}
	
	
	
}
