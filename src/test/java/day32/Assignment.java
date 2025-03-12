package day32;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment {

	public static Select select;
	public static WebElement dropdown;
	public static WebElement text;

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("http://blazedemo.com");

		// 1) Search flights
		dropdown = driver.findElement(By.xpath("//select[@name='fromPort']"));
		select = new Select(dropdown);
		select.selectByIndex(5);

		dropdown = driver.findElement(By.xpath("//select[@name='toPort']"));
		select = new Select(dropdown);
		select.selectByIndex(4);

		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();

		// 2) Select flight from table

		int rows = driver.findElements(By.xpath("//table[@class='table']//tbody//tr")).size();
		System.out.println(rows);

		int cols = driver.findElements(By.xpath("//table[@class='table']//thead//th")).size();
		System.out.println(cols);

		// Create a list to store prices
		List<String> priceList = new ArrayList<>();

		for (int r = 1; r <= rows; r++) {
			String prices = driver.findElement(By.xpath("//table[@class='table']//tbody//tr[" + r + "]//td[6]"))
					.getText().replace("$", "").trim();
			priceList.add(prices);
		}
		System.out.println(priceList);

		// Sort the list in ascending order
		Collections.sort(priceList);
		System.out.println(priceList);

		// Get the minimum price (first element after sorting)
		String minPrice = priceList.get(0);
		System.out.println(minPrice);

		for (String targetPrice : priceList) {
			if (targetPrice == minPrice) {
				Thread.sleep(2000);
				driver.findElement(By.xpath("//table[@class='table']//tbody//tr[3]//td[1]")).click();
				break;
			}
		}

		driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Test User");
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("pune");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("pune");
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Maharashtra");
		driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("123456");

		dropdown = driver.findElement(By.xpath("//select[@id='cardType']"));
		select = new Select(dropdown);
		select.selectByIndex(1);

		driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("441265128596");

		text = driver.findElement(By.xpath("//input[@id='creditCardMonth']"));
		text.clear();
		text.sendKeys("8");
		text = driver.findElement(By.xpath("//input[@id='creditCardYear']"));
		text.clear();
		text.sendKeys("2025");

		driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("Test User");
		driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();

		WebElement confirmationMessage = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//h1[normalize-space()='Thank you for your purchase today!']")));

		String actualTitle = confirmationMessage.getText();
		String expectedTitle = "Thank you for your purchase today!";

		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Test Case Passed");
		} else {
			System.out.println(actualTitle);
		}
		
		// Close the browser
		driver.quit();
	}
}
