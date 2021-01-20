package fedex.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import fedex.elements.AllProductElements;
import fedex.utilities.SetupDrivers;
import io.cucumber.core.gherkin.Argument;

public class AllProductActions {

	AllProductElements allProEle;
	
	
	public AllProductActions() {
		
		this.allProEle = new AllProductElements();
		PageFactory.initElements(SetupDrivers.driver, allProEle);
		
	}
	
	public void homePage() {
		SetupDrivers.driver.get("https://www.fedex.com/en-us/home.html");
		SetupDrivers.driver.manage().window().maximize();
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
	} 
	
	
	public void designPringMenu() throws InterruptedException {
		
		allProEle.designPrintMenu.click();
		Thread.sleep(4000);	
		allProEle.allProduct.click();
		Thread.sleep(4000);	
		
	}
	
	public void caroselIcon() throws InterruptedException {
		allProEle.caroselIcon.click();
		Thread.sleep(4000);	
		allProEle.caroselIcon.click();
		Thread.sleep(4000);	
	}
	
	public void actLink() throws InterruptedException {
		
		allProEle.actionButton.click();
		Thread.sleep(4000);	
	}
	
	
	public void bannerLink() throws InterruptedException {
	
		//JavascriptExecutor js = (JavascriptExecutor)SetupDrivers.driver;
		//js.executeScript("window.scrollBy(0,400)", "");
		
		//Thread.sleep(4000);		
		allProEle.bannerLink.click();
		Thread.sleep(4000);	
	}
	
	
	public void saveNow() throws InterruptedException {
		
		allProEle.saveNow.click();
		Thread.sleep(4000);	
		
		//String  handle= SetupDrivers.driver.getWindowHandle();
		//SetupDrivers.driver.switchTo().window(handle);
		
	}
	
	public void video() throws InterruptedException {
		
		allProEle.video.click();
		Thread.sleep(4000);	
	}
	
	
	
	
}
