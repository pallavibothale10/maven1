package Com.Ecommers.TestCases;

import org.testng.annotations.Test;


import Com.Ecommers.BaseClass.Ecommers_BaseClass;
import Com.Ecommers.PageClasses.TC_Login;

public class TC_LoginTestCases extends Ecommers_BaseClass{

	@Test
	public void Login() {
		
		TC_Login TCL = new TC_Login(driver);
		
		TCL.clickLogin();
		logger.info("Click login button");
		
		TCL.registerEmail(UserName);
		logger.info("Enter Email");
		
		TCL.registerPassword(PassWord);
		logger.info("Enter Passwrod");
		
		TCL.ClickloginrButton();
		logger.info("Click login");

		
	}
}
