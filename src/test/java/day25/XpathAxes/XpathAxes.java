package day25.XpathAxes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		/*
		  
		 //tagname[@attribute='value']/following-sibling::siblingtag
		 //tagname[@attribute='value']/preceding-sibling::siblingtag

 
		 
		 */
	}

}
