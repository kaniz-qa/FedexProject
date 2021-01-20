package fedex.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllProductElements {

	
	@FindBy(xpath = "//span[contains(text(),'Design & Print')]")
	public WebElement designPrintMenu;
	
	@FindBy(xpath = "//a[contains(text(),'ALL PRODUCTS & SERVICES')]")
	public WebElement allProduct;
	
	@FindBy(xpath = "//body/div[2]/div[3]/div[1]/div[3]/div[1]/div[3]/*[1]")
	public WebElement caroselIcon;
	
	
	@FindBy(xpath = "/html/body/div[2]/div[3]/div[1]/div[3]/div/div[2]/div/div[1]/div/div[3]/div/div/div/div/div[2]/div[3]/div/a")
	public WebElement actionButton;
	
	@FindBy(xpath = "//a[contains(text(),'Banners')]")
	public WebElement bannerLink;
	
	@FindBy(xpath = "//body/div[2]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/a[1]")
	public WebElement saveNow;
	
	@FindBy(xpath = "//video[@id='646bf024b1a4f10f515311e48e140cf3_html5_api']")
	public WebElement video;
	
	
	
	
}
