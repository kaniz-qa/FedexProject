package fedex.actions;

import java.util.concurrent.TimeUnit;

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
	
	public void designPrintMenu() {
		pdfEle.designAndPrintMenu.click();
		
	}
	
	public void cuponSubmenu() {
		pdfEle.cuponSubMenu.click();
		
	}
	
	
	
	
	public void getCuponBtn() {
		pdfEle.getCuponBtn.click();
	}
	
	
	
	
}
