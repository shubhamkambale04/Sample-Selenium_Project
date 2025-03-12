package day26.WebDriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		/*
		 * get(url)
		 * getTitle()
		 * getCurrentUrl()
		 * getPageSource()
		 * getWindowHandle()
		 * getWindowHandles()
		 */

		//get(url)
		driver.get("https://demo.automationtesting.in");
		
		//getTitle()
		String title=driver.getTitle();
		System.out.println(title);
		
		//getCurrentUrl()
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//getPageSource()
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
		
		//getWindowHandle()
		String winId=driver.getWindowHandle();
		System.out.println(winId);
		
		//getWindowHandles()
		Thread.sleep(5000);
		driver.findElement(By.linkText("")).click(); //navigate to another window
		Set<String> winIds=driver.getWindowHandles();
		System.out.println(winIds);
	}
}
