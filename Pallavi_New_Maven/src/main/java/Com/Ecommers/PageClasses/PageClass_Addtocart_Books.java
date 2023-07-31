package Com.Ecommers.PageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Ecommers.BaseClass.Ecommers_BaseClass;

public class PageClass_Addtocart_Books extends Ecommers_BaseClass {

	public PageClass_Addtocart_Books() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[contains(text(),\"Books\")] ")
	public WebElement Click_Books;

	@FindBy(xpath = "//button[contains(text(),\"Add to cart\")] ")
	public WebElement Addtocart;

	@FindBy(id = "topcartlink")
	public WebElement Elementadd;

	@FindBy(xpath = "//a[contains(text(),\"Fahrenheit 451 by Ray Bradbury\")]")
	public WebElement Product;

	public void Books_Tab() {
		Click_Books.click();
	}

	public void Addtocart_Tab() {
		Addtocart.click();
	}

	public void Element() {
		Elementadd.click();
	}

	public void Product_Tab() {
		Click_Books.isDisplayed();
	}

}
