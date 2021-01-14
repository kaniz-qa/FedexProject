package fedex.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;


import fedex.elements.CuponPdfElements;
import fedex.utilities.SetupDrivers;

public class CuponPdfActions {

	CuponPdfElements cuponEle;
	
	
	public CuponPdfActions() {		
		this.cuponEle = new  CuponPdfElements();
		PageFactory.initElements(SetupDrivers.driver, cuponEle);
	}	

	
	public void pageOpen() {			
							
		SetupDrivers.driver.get("https://www.fedex.com/en-us/home.html");
		SetupDrivers.driver.manage().window().maximize();	
		SetupDrivers.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
	}
	
	
	
	public void menuSubmenu()  {		
		
	cuponEle.designPrintMenu.click();
	cuponEle.cuponDeal.click();
	
		
	}
	

	public void getCupon() throws InterruptedException  {		
		
	cuponEle.getCupon.click();
	Thread.sleep(3000);
	
	// new tab
	
	
	    String windowHandle = SetupDrivers.driver.getWindowHandle();
	    SetupDrivers.driver.switchTo().window(windowHandle);
	   
	
	
	  
	    cuponEle.backMainLink.sendKeys(Keys.CONTROL +"\t");
	    SetupDrivers.driver.switchTo().defaultContent();
	
	
	}
	
}
