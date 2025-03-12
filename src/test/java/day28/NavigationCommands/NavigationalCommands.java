package day28.NavigationCommands;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) throws MalformedURLException {

		/*
		 * navigate.to(url) 
		 * navigate.back() 
		 * navigate.forward() 
		 * navigate.refresh()
		 */

		WebDriver driver = new ChromeDriver();

		// Approach 1
		// URL myurl=new URL("https://demo.nopcommerce.com/");
		// driver.navigate().to(myurl);
		
		// Approach 2
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.navigate().to("https://www.google.com");
		
		//navigate.back()
		driver.navigate().back();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//navigate.forward()
		driver.navigate().forward();
		String url1=driver.getCurrentUrl();
		System.out.println(url1);
		
		//navigate.refresh()
		driver.navigate().refresh();
		
		driver.quit();
	}
}
