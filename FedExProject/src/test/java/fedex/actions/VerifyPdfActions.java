package fedex.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import fedex.elements.VerifyPdfElements;
import fedex.utilities.SetupDrivers;

public class VerifyPdfActions {

	
	VerifyPdfElements pdfEle;
	
	public VerifyPdfActions() {
		this.pdfEle = new VerifyPdfElements();
		PageFactory.initElements(SetupDrivers.driver, pdfEle);
	}
	
	
	public void pageOpen() {			
		
		SetupDrivers.driver.get("https://www.fedex.com/en-us/home.html");
		SetupDrivers.driver.manage().window().maximize();	
		SetupDrivers.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
	}
	
	public void menuSubmenu() {
		pdfEle.designPrintMenu.click();
		pdfEle.cuopnSubmenu.click();
		
	}
	
	
	public void scrollAndGetCupon() {
		
		
		
		pdfEle.getCuponBtn.click();
	}
	
	
	
	
}
