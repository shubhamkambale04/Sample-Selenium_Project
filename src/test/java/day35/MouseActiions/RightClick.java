package day35.MouseActiions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// perform Right Click Action
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// Visiting the URL
		Thread.sleep(2000);
		driver.get("https://www.softwaretestingmentor.com/automation-practice-page-right-click-demo/");
		Thread.sleep(2000);

		// Instantiating the Actions Class
		Actions actions = new Actions(driver);

		// Fetching or locating WebElement to perform right-click using the desired
		// locators
		WebElement btnElement = driver
				.findElement(By.xpath("//h1[contains(text(),'Automation Practice Page – Right Click Demo')]"));

		// Right click the button to display Context Menu
		actions.contextClick(btnElement).perform();

		System.out.println("Context Menu displayed");

		// Code To click on a specific option from the Context menu once right-click is
		// performed.
		Thread.sleep(2000);
		WebElement elementOpen = driver
				.findElement(By.xpath("//div[@class='col-xs-12 col-sm-12 col-md-8 awaken-content-float']//li[1]"));
		elementOpen.click();

		// Accept the Alert
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		System.out.println("Right click Alert Accepted Successfully ");

		// Terminating the operation
		driver.close();
	}
}
