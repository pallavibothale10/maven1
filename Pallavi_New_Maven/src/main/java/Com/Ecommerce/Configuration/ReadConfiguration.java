package Com.Ecommerce.Configuration;


import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import Com.Ecommerce.Configuration.ReadConfiguration;

public class ReadConfiguration {
	Properties pro;

	public ReadConfiguration() {
		File src = new File("C:\\Users\\A\\eclipse-workspace1\\Pallavi_New_Maven\\src\\test\\resources\\Configuration\\Configure.properties");
// string path = "" ;
		pro = new Properties();
		try {
			FileInputStream fis = new FileInputStream(src);
			try {

				pro.load(fis);
				
			} catch (IOException e) {
				
				e.printStackTrace();
				
			} // read a properties list(key and element pairs from the input byte stram
			
		} catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
	}

	public String getApplicationURL() {

		String URL = pro.getProperty("BaseURL");
		return URL;
	}

	public String MethodUsername() {

		String Username = pro.getProperty("UserName");
		return Username;
	}

	public String MethodPassword() {

		String Password = pro.getProperty("PassWord");
		return Password;
	}

	public String getChromepath() {

		String Chromepath = pro.getProperty("ChromeDriver");
		return Chromepath;
	}

	public String getFirefoxpath() {
		String Firefoxpath = pro.getProperty("FirefoxDriver");
		return Firefoxpath;
	}
	public String getEdgepath() {
		String Edgepath = pro.getProperty("EdgeDriver");
		return Edgepath;
	}

}
