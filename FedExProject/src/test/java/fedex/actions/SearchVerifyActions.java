package fedex.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;


import fedex.elements.SearchVerifyElements;
import fedex.utilities.SetupDrivers;

public class SearchVerifyActions {

	
	SearchVerifyElements searchEle;
	
	public SearchVerifyActions() {		
		this.searchEle = new  SearchVerifyElements();
		PageFactory.initElements(SetupDrivers.driver, searchEle);
	}	

	
	public void pageOpen() {			
							
		SetupDrivers.driver.get("https://www.fedex.com/en-us/home.html");
		SetupDrivers.driver.manage().window().maximize();	
		SetupDrivers.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
	}
	
	public void searchIcon() {
		
		searchEle.searchIcon.click();
	}
	
	public void searchText() {
		searchEle.searchText.sendKeys("645645645757");
		
	}

	public void enterText() {
		
		searchEle.searchText.sendKeys(Keys.ENTER);
	}
	
	
	public void errorMsg() {
		searchEle.errorMsg.getText();
	
	}
	
	
	
}
