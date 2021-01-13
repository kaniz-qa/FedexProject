package fedex.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchVerifyElements {

	
	
	@FindBy(xpath = "//header/div[1]/div[1]/nav[1]/div[1]/div[1]/div[1]/div[2]/a[1]/span[1]/img[1]")
	public WebElement searchIcon;
	
	
	@FindBy(xpath = "//input[@id='fxg-search-text']")
	public WebElement searchText;
	
	
	@FindBy(xpath = "//span[contains(text(),'No record of this tracking')]")
	public WebElement errorMsg;
	
	
	
}
