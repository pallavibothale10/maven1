package Com.Ecommers.PageClasses;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Com.Ecommerce.Utilities.GenericUtils;
import Com.Ecommers.BaseClass.Ecommers_BaseClass;

public class PageClass_AddToCart extends Ecommers_BaseClass {
	
	public PageClass_AddToCart () {
		
		PageFactory.initElements(driver, this);
	
	}

	public WebElement Computer;

	@FindBy(xpath="//a[contains(text(),\"Notebooks \")]")
	public WebElement Notebook;

	@FindBy(xpath="//a[contains(text(),\"Apple MacBook Pro 13-inch \")]")
	public WebElement SelectMacbook;

	@FindBy(id="add-to-cart-button-4")
	public WebElement Addtocart;

	@FindBy(id="topcartlink")
	public WebElement Elementadded;


	public void NoteBook() {
		Notebook.click();
	}
	public void SelectProduct() {
		GenericUtils.ClickElementUsingJavaScript(SelectMacbook,driver);
	}
	public void AddedToCart() {
		Addtocart.click();
	}
	public void productAdded() {
		Elementadded.isDisplayed();
	}
	
	public void Product() {
		
		By input1=By.xpath("//img[@alt=\"Picture of Apple MacBook Pro 13-inch\"]");
		boolean result=GenericUtils.Waitforelement(driver,input1,20).isDisplayed();
		
		if(result==true) {
			logger.info("add to cart test case pass");
			Assert.assertTrue(true);
		}
		else {
			logger.info("add to cart test case failed");
			Assert.assertTrue(false);
		}
	}

	
	
	
	
}
