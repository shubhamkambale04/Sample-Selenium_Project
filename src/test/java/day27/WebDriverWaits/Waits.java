package day27.WebDriverWaits;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	// NoSuchElementException- Element is not present on the page (synchronization
	// issue)
	// ElementNotFoundException- Locator is incorrect

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// Thread.Sleep()
		Thread.sleep(5000);
		driver.findElement(By.xpath("")).sendKeys("Admin");

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("")).sendKeys("Admin");

		// Explicit Wait
		// declaration
		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// use
		WebElement txtusername = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		txtusername.sendKeys("Admin");

		WebElement txtpassword = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		txtpassword.sendKeys("admin");

		WebElement loginbtn = myWait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		loginbtn.click();

		// fluent wait
		Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);

		WebElement txtuname=mywait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath(""));
			}
		});
		
		txtuname.sendKeys("Admin");

		//quit driver
		driver.quit();
	}
}
