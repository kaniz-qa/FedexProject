package fedex.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import fedex.elements.CuponPdfElements;
import fedex.elements.LanguageElements;
import fedex.utilities.SetupDrivers;

public class LanguageActions {

	
	
	LanguageElements langEle ;
	
	
	public LanguageActions() {		
		this.langEle = new  LanguageElements();
		PageFactory.initElements(SetupDrivers.driver, langEle);
	}	

	
	public void pageOpen() {			
							
		SetupDrivers.driver.get("https://www.fedex.com/en-us/home.html");
		SetupDrivers.driver.manage().window().maximize();	
		SetupDrivers.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
	}
	
	public void languageBtn() throws InterruptedException {
		langEle.language.click();
		Thread.sleep(2000);
	}
	
	
	public void selectLang() throws InterruptedException {
		
		
		
		langEle.selectEspaniol.click();
		Thread.sleep(2000);
		
	}
	
	public void espaniolText() {
		langEle.spanishText.isDisplayed();
		
	}
	
	
	
	
}
