package fedex.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatePrintProfileElements {

	
	
	
	//@FindBy(xpath = "/html/body/div[1]/header/fedex-alert/div/div/span[2]")
	//public WebElement cookieEle;
	
	
	@FindBy(xpath = "/html/body/div[1]/header/div/div/nav/div/ul/div[3]/li/a/span")
	public WebElement designPrintMenu;
	
	
	@FindBy(xpath = "//a[contains(text(),'Custom Design Templates')]")
	public WebElement designTempleteSubmenu;
	
	
	@FindBy(xpath = "//span[contains(text(),'Sign Up or Log In')]")
	public WebElement signupLogin;
	
	@FindBy(xpath = "//span[contains(text(),'create a print profile')]")
	public WebElement createPrintLink;
	
	
	@FindBy(xpath = "//input[@id='custom-input-2']")
	public WebElement firstName;
	
	@FindBy(xpath = "//input[@id='custom-input-3']")
	public WebElement lastName;
	
	@FindBy(xpath = "//input[@id='custom-input-4']")
	public WebElement email;
	
	@FindBy(xpath = "//input[@id='custom-input-5']")
	public WebElement phone;
	
	@FindBy(xpath = "//input[@id='custom-input-6']")
	public WebElement userid;
	
	@FindBy(xpath = "//input[@id='custom-input-8']")
	public WebElement password;
	
	@FindBy(xpath = "//input[@id='custom-input-7']")
	public WebElement repassword;
	
	
	@FindBy(xpath = "/html/body/app-root/div/div/app-register/app-register-form/div/div/div[2]/form/div[5]/edl-checkbox/label/div[1]/edl-icon\r\n" + 
			"	")
	public WebElement checkBox;
	
	@FindBy(xpath = "/html/body/app-root/div/div/app-register/app-register-form/div/div/div[2]/form/div[6]/button")
	public WebElement submitBtn;
	
	
	
}
