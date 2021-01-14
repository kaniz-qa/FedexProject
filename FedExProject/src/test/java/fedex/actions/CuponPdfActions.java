package fedex.actions;

import java.util.concurrent.TimeUnit;

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
	

	public void getCupon()  {		
		
	cuponEle.getCupon.click();
			
	//String link = "https://www.fedex.com/content/dam/fedex/us-united-states/FedEx-Office/images/2020/Q4/FedEx_SameDay_City_New_Customer_Coupons_447271949.pdf";
	//SetupDrivers.driver.get(link);
	
	SetupDrivers.driver.switchTo().frame(cuponEle.iFrame);
	
	cuponEle.downloadIcon.click();
	
		
	}
	
}
