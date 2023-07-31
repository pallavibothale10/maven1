package Com.Ecommers.PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Ecommers.BaseClass.Ecommers_BaseClass;

public class TC_Login extends Ecommers_BaseClass {

	
	public TC_Login (WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath="//a[contains(text(),\"Log in\")]")
	public WebElement LoginTab;
	
	@FindBy(xpath="//input[@class=\"email\"]")
	public WebElement RegEmail;
	
	@FindBy(xpath="//input[@class=\"password\"]")
	public WebElement RegPassword;
	
	@FindBy(xpath="//a[contains(text(),\"Log in\")]")
	public WebElement Loginbutton;


	public void clickLogin() {
		LoginTab.click();
	}
	
	public void registerEmail(String RegEmailID) {
		RegEmail.sendKeys(RegEmailID);
	}

	public void registerPassword(String RegPassWord) {
		RegPassword.sendKeys(RegPassWord);
	}
	public void ClickloginrButton() {
		Loginbutton.click();
	}
	
	
	
}
