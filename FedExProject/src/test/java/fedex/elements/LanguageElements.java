package fedex.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LanguageElements {

	
	@FindBy(xpath = "//button[@id='dropdownMenu']")
	public WebElement language;
	
	
	@FindBy(xpath = "//a[contains(text(),'Español')]")
	public WebElement selectEspaniol;
	
	@FindBy(xpath = "//h1[contains(text(),'Envío, gestión, rastreo, entrega')]")
	public WebElement spanishText;
	
}
