package fedex.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import fedex.elements.VerifyPdfElements;
import fedex.utilities.SetupDrivers;

public class VerifyPdfActions {

	
	VerifyPdfElements pdfEle;
	
	public void VerifyPdfActions() {
		
		this.pdfEle = new VerifyPdfElements();
		PageFactory.initElements(SetupDrivers.chromeDriver, pdfEle);
	}
	
	public void fedexHomePage() {
		SetupDrivers.chromeDriver.get("https://www.fedex.com/en-us/home.html");
		SetupDrivers.chromeDriver.manage().window().maximize();
		SetupDrivers.chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	public void searchIcon() {
		
		pdfEle.searchIcon.click();
	}
	
	public void searchText() {
		
		pdfEle.searchText.sendKeys("34534632656");
	}
	
	public void pressEnter() {
		
		pdfEle.searchText.sendKeys(Keys.ENTER);
	}
	
	
	
}
