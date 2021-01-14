package fedex.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CuponPdfElements {

	
	
	@FindBy(xpath = "/html/body/div[1]/header/div/div/nav/div/ul/div[3]/li/a/span")
	public WebElement designPrintMenu;
	
	
	@FindBy(xpath = "//a[contains(text(),'Get Coupons & Deals')]")
	public WebElement cuponDeal;
	
	
	@FindBy(xpath = "//a[contains(text(),'get coupon')]")
	public WebElement getCupon;
	
	@FindBy(css = "body")
	public WebElement backMainLink;
	
	
	
	
	
}
