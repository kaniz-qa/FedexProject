package fedex.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerifyPdfElements {

	
	
	@FindBy(xpath = "//span[contains(text(),'Design & Print')]")
	public WebElement designPrintMenu;
	
	
	@FindBy(xpath = "//a[contains(text(),'Get Coupons & Deals')]")
	public WebElement cuopnSubmenu;
	
	
	@FindBy(xpath = "//a[contains(text(),'get coupon')]")
	public WebElement getCuponBtn;
	
	
	
	
}
