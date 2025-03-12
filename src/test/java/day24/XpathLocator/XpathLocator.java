package day24.XpathLocator;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		/*
		 * //tagname[@Attribute='value'] 
		 * //*[@Attribute='value']
		 * 
		 * //tagname[@attribute1='value1' and @attribute2='value2']
		 * //tagname[@attribute1='value1' or @attribute2='value2']
		 * 
		 * //tagname[contains(@attribute, 'partial_value')]
		 * //tagname[starts-with(@attribute, 'value')]
		 * 
		 * //tagname[text()='Exact Text']
		 * 
		 * //tagname[normalize-space()='Exact Text']
		 * 
		 * //tagname)[1] 
		 * //tagname)[last()]
		 * 
		 */

	}

}
