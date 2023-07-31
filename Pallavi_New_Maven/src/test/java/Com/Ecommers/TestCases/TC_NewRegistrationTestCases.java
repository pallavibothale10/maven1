package Com.Ecommers.TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.google.common.collect.ImmutableMap;

import Com.Ecommers.BaseClass.Ecommers_BaseClass;
import Com.Ecommers.PageClasses.TC_NewRegistration;
import dev.failsafe.internal.util.Assert;
import net.bytebuddy.utility.RandomString;

public class TC_NewRegistrationTestCases extends Ecommers_BaseClass {
	
	
	@Test
	public void Registration() {
		
		
		TC_NewRegistration TCN = new TC_NewRegistration();
		
		TCN.Register();
		logger.info("Click Register button");
		
		TCN.SelectGender();
		logger.info("Select gender");

		TCN.SetFirstname("Suraj");
		logger.info("Enter firstname");

		TCN.SetLastname("Both");
		logger.info("Enter lastname");

		TCN.Select_Day();
		TCN.Select_Month();
		TCN.Select_Year();
		
		String Name= RandomString.make(5); //Generates a random string to use in the email field for uniqueness
		TCN.SetEmail(Name+"sbpb@gmail.com"); //to generate a random email address to avoid duplicate entries during registration.
		logger.info("Enter email");

		
		TCN.SetPassword("123ABCD");
		logger.info("Enter password");

		TCN.SetConfirmPassword("123ABCD");
		TCN.ClickRegisterButton();

		boolean ValidateText= driver.findElement(By.xpath("//div[contains(text(),\"Your registration completed\")]")).isDisplayed();
		System.out.println(ValidateText);
	}
	
	
	
}
