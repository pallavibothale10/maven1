package Com.Ecommers.TestCases;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Com.Ecommers.BaseClass.Ecommers_BaseClass;
import Com.Ecommers.PageClasses.PageClass_AddToCart;
import Com.Ecommers.PageClasses.TC_Login;

public class TC_AddToCart extends Ecommers_BaseClass {

	@Test
	public void AddProduct() throws InterruptedException {

		logger.info("Open URL");
		
		//create obj of test class and call the methods for login
		
		TC_Login TCL = new TC_Login(driver);

		Thread.sleep(3000);
		
		TCL.clickLogin();
		logger.info("Click login button");
		Thread.sleep(3000);

		TCL.registerEmail(UserName);
		logger.info("Enter Email");
		Thread.sleep(3000);

		TCL.registerPassword(PassWord);
		logger.info("Enter Passwrod");
		Thread.sleep(3000);

		TCL.ClickloginrButton();
		logger.info("Click on login");
		Thread.sleep(3000);

		PageClass_AddToCart PCA = new PageClass_AddToCart(); // object of page class

		
		Actions act=new Actions(driver);
		
		WebElement Computer=driver.findElement(By.xpath("//a[contains(text(),\"Computers \")]"));
		
		act.moveToElement(Computer).perform();
		logger.info("mousehover on computer");
		
		PCA.NoteBook();
		logger.info("Clicked on Notebook text");
		
		Thread.sleep(5000);
		
		PCA.SelectProduct();
		logger.info("product selected");
		
		PCA.AddedToCart();
		logger.info("Verified message");
		
		PCA.productAdded();
		logger.info("Product visible in cart");
		
		WebElement Ele=driver.findElement(By.xpath("//span[contains(text(),\"Shopping cart\")]"));
		
		Actions Act=new Actions(driver);
		act.moveToElement(Ele).build().perform();
		PCA.Product();
	
		
     //   PCA.Computer_Tab();
//		Actions act = new Actions(driver);
//
//		WebElement Computer = driver.findElement(By.xpath("//a[contains(text(),\\\"Computers \\\")]"));
//
//		act.moveToElement(Computer).perform();
//		logger.info("mouseover on computer");
//
//		PCA.NoteBook();
//		logger.info("Click on notebook text");
//
//		Thread.sleep(2000);
//
//		PCA.SelectProduct();
//		logger.info("product selected");
//
//		Thread.sleep(2000);
//
//		PCA.AddToCartProduct();
//		logger.info("Add to cart");
//
//		Thread.sleep(2000);
//
//		PCA.ProductAdded();
//		logger.info("verified msg");
//
//		Thread.sleep(2000);
//
//		PCA.CloseTab();
//		logger.info("Click on close tab");
//
//		WebElement element = driver.findElement(By.xpath("//span[contains(text(),\"Shopping cart\")]"));
//		Actions Act = new Actions(driver);
//		Act.moveToElement(element).build().perform();
//
//		PCA.Product();

	}

}
