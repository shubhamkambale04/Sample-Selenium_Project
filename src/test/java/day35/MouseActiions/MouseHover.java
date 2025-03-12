package day35.MouseActiions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHover {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);

		// Initialize Actions class
		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Perform mouse hover
		WebElement source = driver.findElement(By.xpath("//span[normalize-space()='Account & Lists']"));
		action.moveToElement(source).perform();

		// Wait for "Your Orders" to be clickable
		WebElement target = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Your Orders']")));

		// Click on "Your Orders"
		action.moveToElement(target).click().build().perform();

		System.out.println("Clicked on 'Your Orders' successfully.");

		// Close the browser
		driver.quit();

	}
}