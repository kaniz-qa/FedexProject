package fedex.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RateVerifyElements {

	
	
	@FindBy(xpath = "//span[contains(text(),'Rate & Ship')]")
	public WebElement rateShip;
	
	@FindBy(xpath = "//input[@id='fromGoogleAddress']")
	public WebElement from;
	
	
	@FindBy(xpath = "//input[@id='toGoogleAddress']")
	public WebElement to;
	
	@FindBy(xpath = "//label[@id='shippingToResidenceAddressLabel']")
	public WebElement checkBox;
	
	@FindBy(xpath = "//select[@id='package-details__package-type']")
	public WebElement pkgOpt;
	
	
	@FindBy(xpath = "//select[@id='package-details__quantity-0']")
	public WebElement pkgNum;
	
	@FindBy(xpath = "//input[@id='package-details__weight-0']")
	public WebElement lb;
	
	
	
	@FindBy(xpath = "//*[@id=\"package-details__dimensions-0\"]/input[2]")
	public WebElement weight;
	
	@FindBy(xpath = "//*[@id=\"package-details__dimensions-0\"]/input[3]")
	public WebElement height;
	
	
	@FindBy(xpath = "//*[@id=\"package-details__dimensions-0\"]/input[1]")
	public WebElement length;
	
	
	
	
	@FindBy(xpath = "//select[@id='packageShipDate']")
	public WebElement shipDate;
	
	
	@FindBy(xpath = "//button[@id='e2ePackageDetailsSubmitButtonRates']")
	public WebElement showRate;
	
	
	@FindBy()
	public WebElement rateInfo;
	
	
	
	
	
}
