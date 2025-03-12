package day28.NavigationCommands;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Enter search term
		WebElement txt = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		txt.sendKeys("selenium");

		// Click search button
		WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
		search.click();

		Thread.sleep(3000);

		// count total links
		List<WebElement> links = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']/a"));
		int linkCount = links.size();
		System.out.println("Total links available: " + linkCount);

		// Store main window ID
		String mainWindow = driver.getWindowHandle();

		// Click on each link one by one
		for (WebElement link : links) {
			link.click();
			Thread.sleep(3000); // Wait for new tab/window to open
		}

		// get window ID's
		Set<String> winIds = driver.getWindowHandles();
		System.out.println(winIds);

		String targetWindow1 = "Selenium (software) - Wikipedia"; // Corrected case
		String targetWindow2 = "Selenium - Wikipedia";

		// Print window titles before closing
		System.out.println("Titles before closing:");
		for (String winId : winIds) {
			driver.switchTo().window(winId);
			String title = driver.getTitle();
			System.out.println(title);
			if (title.equals(targetWindow1) || title.equals(targetWindow2)) {
				driver.close();
			}
		}

		// Ensure the driver switches to an active window
		Set<String> remainingWindows = driver.getWindowHandles();

		// Print window titles after closing
		System.out.println("Titles after closing:");
		for (String winId : remainingWindows) {
			driver.switchTo().window(winId);
			System.out.println(driver.getTitle());
		}

		// Switch back to the main window
		driver.switchTo().window(mainWindow);
		Thread.sleep(1000); // Wait before clicking next link
	}
}
