package Com.Ecommers.TestCases;

import org.testng.annotations.Test;

import Com.Ecommers.BaseClass.Ecommers_BaseClass;
import Com.Ecommers.PageClasses.PageClass_Addtocart_Books;
import Com.Ecommers.PageClasses.TC_Login;

public class TC_Addtocart_Books extends Ecommers_BaseClass {
	
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
	
	PageClass_Addtocart_Books AB = new PageClass_Addtocart_Books();
	
	AB.Books_Tab();
	logger.info("Click button");
	AB.Addtocart_Tab();
	logger.info("Click Addtocart");
	AB.Element();
	logger.info("Click element");
	AB.Product_Tab();
	logger.info("Click product");

}
}