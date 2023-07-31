package Com.Ecommers.BaseClass;

import java.util.concurrent.TimeUnit;



import Com.Ecommerce.Configuration.ReadConfiguration;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;

import com.beust.jcommander.Parameter;
import com.google.common.collect.ImmutableMap;
import net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.apache.log4j.PropertyConfigurator;

public class Ecommers_BaseClass {
	
	
	public static WebDriver driver;
	public static Logger logger;
	// An instance of the Logger class from the log4j framework used for logging
	
	ReadConfiguration readconfig = new ReadConfiguration();
	
	public String BaseURL =readconfig.getApplicationURL();
    public String UserName =readconfig.MethodUsername();
    public String PassWord =readconfig.MethodPassword();
    
    public String ChromeDriver =readconfig.getChromepath();
    public String FirefoxDriver =readconfig.getFirefoxpath();
    public String EdgeDriver =readconfig.getEdgepath();
	
	@BeforeMethod
	
	@Parameters("Browser")
//	String Browsername
	public void intialization(String Browsername ) {
		
		
		logger = logger.getLogger("Automation Framework");
		//used to initialize the logger object from the log4j framework and associate it with a specific name
		//logger: This is a static variable of type Logger defined in the class
		// getLogger is a Static method return type logger 
		// to create object 
		
		PropertyConfigurator.configure("C:\\Users\\A\\eclipse-workspace1\\Pallavi_New_Maven\\src\\test\\resources\\Configuration\\log4j.properties");

		//PropertyConfigurator is a class provided by the log4j framework that helps to configure log4j using a properties file.
	    //configure() is a static method of the PropertyConfigurator class
		
		if(Browsername.equals("Chrome")) {
			System.setProperty("webdriver.driver.chrome", ChromeDriver);
			driver = new ChromeDriver();
		}else if(Browsername.equals("FireFox")) {
			System.setProperty("webdriver.gecko.chrome", FirefoxDriver);
			driver = new FirefoxDriver();
		}else if(Browsername.equals("Edge")) {
			System.setProperty("webdriver.gecko.chrome", EdgeDriver);
			driver = new EdgeDriver();
		}
		System.setProperty("webdriver.driver.chrome", ChromeDriver);
		driver = new ChromeDriver();
		
	    logger.info("Open Browser");
	    
		driver.manage().window().maximize();
	    logger.info("Maximize the Browser");

		driver.get(BaseURL);
	    logger.info("Open Application");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void Teardown() throws InterruptedException {
		
		Thread.sleep(3000);
		
		//driver.quit();
		
	}
	
	

}
