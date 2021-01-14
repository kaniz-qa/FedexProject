package fedex.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TrackingElements {
	
	
	
	
	
	@FindBy(xpath = "/html/body/div[1]/header/div/div/nav/div/ul/div[2]/li/a/span")
	public WebElement tracking;
	
	
	
	@FindBy(xpath = "//input[@id='trackingModuleTrackingNum']")
	public WebElement trackingText;
	
	
	@FindBy(xpath = "//button[contains(text(),'TRACK')]")
	public WebElement trackingBtn;

}
