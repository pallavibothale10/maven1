
package Com.Ecommers.PageClasses;

import java.io.IOException;
import java.net.CookieHandler;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Ecommers.BaseClass.Ecommers_BaseClass;

public class PageClass_BrokenLinks extends Ecommers_BaseClass{
	public WebDriver driver;

	public PageClass_BrokenLinks(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(tagName = "a") // links
	public List<WebElement> AllLinks;

	public void getLinks() throws IOException {

		System.out.println("Total links -->" + AllLinks.size());

		int Bronkenlinks = 0;

		for (WebElement getLinks : AllLinks) {

			// By using the href we can get the URL of the required link
			String url = getLinks.getAttribute("href");

			if (url == null || url.isEmpty()) {

				System.out.println("url is empty or null");
			}

			URL LinkURL = new URL(url);
			CookieHandler.setDefault(new CookieManager(null, CookiePolicy.ACCEPT_ALL));

			// Create the object ULR object"LinkURL"

			// HttpURLConnection httpscode = (HttpURLConnection) LinkURL.openConnection();
			// //

			HttpURLConnection httpscode = (HttpURLConnection) LinkURL.openConnection();
			httpscode.connect();
			// 200--ok
			// 400--bad request

			if (httpscode.getResponseCode() >= 400) {

				System.out.println(httpscode.getResponseCode() + "--->" + url + "is--> broken link");
				Bronkenlinks++;

			} else {

				System.out.println(httpscode.getResponseCode() + "--->" + url + "is--> Valid link");

			}

		}
		System.out.println("No. of broken links-->" + Bronkenlinks);

	}
}
