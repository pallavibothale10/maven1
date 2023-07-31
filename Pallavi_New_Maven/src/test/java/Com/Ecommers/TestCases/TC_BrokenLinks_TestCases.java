package Com.Ecommers.TestCases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Ecommers.BaseClass.Ecommers_BaseClass;
import Com.Ecommers.PageClasses.PageClass_BrokenLinks;

public class TC_BrokenLinks_TestCases extends Ecommers_BaseClass {
	

	
//	public void setup() {
//
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
//
//		driver = new ChromeDriver();
//
//		driver.get("https://demo.nopcommerce.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//	}

	@Test
	public void TestMethod() throws IOException, InterruptedException {
		PageClass_BrokenLinks PCB = new PageClass_BrokenLinks(driver);
		PCB.getLinks();

	}

//	@AfterMethod
//	public void Teardown() throws InterruptedException {
//		Thread.sleep(5000);
//		// driver.close();
//	}
}
