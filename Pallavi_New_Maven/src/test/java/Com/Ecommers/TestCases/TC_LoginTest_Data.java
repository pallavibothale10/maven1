package Com.Ecommers.TestCases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import  Com.Ecommers.BaseClass.Ecommers_BaseClass;
import Com.Ecommers.TestCases.TC_LoginTestCases;
import Com.Ecommerce.Utilities.ExcelUtils;
import Com.Ecommers.BaseClass.Ecommers_BaseClass;
import Com.Ecommers.PageClasses.TC_Login;

public class TC_LoginTest_Data extends Ecommers_BaseClass {


		@Test(dataProvider="Logindata")
		public void Login(String User, String Pass, String Expected) {
			
			TC_Login TCL = new TC_Login(driver);
			
			TCL.clickLogin();
			logger.info("Click login button");
			
			TCL.registerEmail(User);
			logger.info("Enter Email");
			
			TCL.registerPassword(Pass);
			logger.info("Enter Passwrod");
			
			TCL.ClickloginrButton();
			logger.info("Click login");

		
//		String exe_title = "nopCommerce demo store";
//
//		String act_title = driver.getTitle();
//
//		if (result.equals("valid")) {
//
//			if (act_title.equals(exe_title)) {
//
//				driver.findElement(By.xpath("//a[@href=\"/logout\"]")).click();
//
//				Assert.assertTrue(true);
//				logger.info("login test pass");
//
//			} else {
//
//				assertTrue(false);
//				logger.info("login test failed");
//			}
//		} else if (result.equals("invalid")) {
//			if (act_title.equals(exe_title)) {
//				logger.info("login test failed");
//				assertTrue(false);
//			} else {
//				Assert.assertTrue(true);
//				logger.info("login test pass");
//			}
//		}
//
//	}
			String Act_Title=driver.getTitle();
			String Exp_Title="nopcommerce demo store";

					
					if(Expected.equals("Valid")) {
						if(Act_Title.equals(Exp_Title)) {
						
							Assert.assertTrue(true);
						logger.info("Login test case pass");
					}
					else {
						Assert.assertTrue(false);
						logger.info("login test case failed");
						}
					}
						else if(Expected.equals("Invaild")) {
							if(Act_Title.equals(Exp_Title)) {
								assertTrue(false);
								logger.info("Login test case pass");
						}
							else {
								Assert.assertTrue(true);
								logger.info("Login test case failed");
							}
					}
					
				}
	
	@DataProvider(name = "Logindata")
	public String[][] Getdata() throws IOException{
		
		//String Path = "C:\\Users\\A\\eclipse-workspace1\\Pallavi_New_Maven\\src\\test\\java\\Com\\Ecommers\\TestCases\\11Match_TestData.xlsx";
		
		String Path ="C:\\Users\\A\\Desktop\\Installation\\11Match_TestData.xlsx";
		
		int R1 = ExcelUtils.GetRowcount(Path, "Sheet1");
		int C1 = ExcelUtils.GetCellcount(Path, "Sheet1", 1);
		
		String logindata[][]= new String[R1][C1];
		
		for(int i=1; i<R1; i++) {
			
			for(int j=0; j<C1; j++) {
				
				logindata[i-1][j] = ExcelUtils.GetCelldata(Path, "Sheet1", i, j);
			}
		}
		return logindata;
	}
	
}