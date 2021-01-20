package fedex.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingWindowElements {

	
	@FindBy(xpath = "//thead/tr[1]/th[4]/div[1]/div[1]/div[1]/a[1]/img[1]")
	public WebElement returnPkg;
	
	
	@FindBy(xpath = "//body/div[2]/div[2]/div[1]/div[4]/div[1]/div[2]/div[13]/div[1]/a[1]")
	public WebElement createLabel;
	
	
	@FindBy(xpath = "//input[@id='fx-from-name']")
	public WebElement yourName;
	
	
	@FindBy(xpath = "//input[@id='fx-to-name']")
	public WebElement returnName;
	
	
	@FindBy(xpath = "//button[@id='fx-address-button']")
	public WebElement continueButton;
	
	
	@FindBy(xpath = "//*[@id=\"fx-from-hideable-addr-section\"]/div[6]/span")
	public WebElement errorMsg;
	
	
	
	
}
