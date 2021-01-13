package fedex.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import fedex.elements.RateVerifyElements;
import fedex.utilities.SetupDrivers;

public class RateVerifyActions {

	
	
	RateVerifyElements rateEle;
	
	public RateVerifyActions() {		
		this.rateEle = new  RateVerifyElements();
		PageFactory.initElements(SetupDrivers.driver, rateEle);
	}	

	
	public void pageOpen() {			
							
		SetupDrivers.driver.get("https://www.fedex.com/en-us/home.html");
		SetupDrivers.driver.manage().window().maximize();	
		SetupDrivers.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
	}

	
	public void shipRate() {
		
		rateEle.rateShip.click();
	}
	
	
	public void from() throws InterruptedException {
		rateEle.from.sendKeys("Norwich , CT , USA ");
		Thread.sleep(2000);
		rateEle.from.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		rateEle.from.sendKeys(Keys.ENTER);
		
	}
	
	public void to() throws InterruptedException {
		rateEle.to.sendKeys("New York, New York, 10007, United States");
		Thread.sleep(3000);
		rateEle.to.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		rateEle.to.sendKeys(Keys.ENTER);
		
	}
	
	public void check() {
		rateEle.checkBox.isDisplayed();
		rateEle.checkBox.click();
		
		//JavascriptExecutor js = (JavascriptExecutor)SetupDrivers.driver;
		//js.executeScript("arguments[0].click();", rateEle.checkBox);
		
		
		
	}
	
	public void selectPkg() {
		
		Select s1 = new Select(rateEle.pkgOpt);
		s1.selectByVisibleText("Your Packaging");
	}
	
	public void pkgNum() {
		
		Select s2 = new Select(rateEle.pkgNum);
		s2.selectByVisibleText("2");
	}
	
	public void pkgWeight() {
		
		rateEle.lb.sendKeys("3");
	}
	
	
	public void length() {
		rateEle.length.sendKeys("5");
		
	}
	
	
	public void weight() {
		rateEle.weight.sendKeys("3");
		
	}
	public void height() {
		
		rateEle.height.sendKeys("4");
	}
	
	
	
	public void shipDate() {
		Select s3 = new Select(rateEle.shipDate);
		s3.selectByVisibleText("Tuesday , January 12,2021");
		
	}
	
	public void showRateBtn() {
		
		rateEle.showRate.click();
	}
	
	public void showRateMsg() {
		
		
	}
	
	
}
