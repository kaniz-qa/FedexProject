package fedex.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerifyPdfElements {

	
	@FindBy(xpath = "//span[contains(text(),'Design & Print')]")
	public WebElement searchIcon;
	
	
	@FindBy(xpath = "//input[@id='fxg-search-text']")
	public WebElement searchText;
	
	

	
	
	
}
