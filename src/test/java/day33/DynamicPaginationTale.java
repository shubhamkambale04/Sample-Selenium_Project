package day33;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationTale {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

		driver.get("https://testautomationpractice.blogspot.com/#");

		// Find total number of pages
		List<WebElement> pages = driver.findElements(By.xpath("//ul[@id='pagination']/li/a"));
		int totalPages = pages.size();
		System.out.println("Total Pages: " + totalPages);

		for (int page = 1; page <= totalPages; page++) {
			// Click on the page number (Index starts from 0)
			if (page <= totalPages) {
				driver.findElement(By.xpath("//ul[@id='pagination']/li[" + (page + 0) + "]/a")).click();
				Thread.sleep(2000); // Wait for page load
				System.out.println("Page: " + page);
				System.out.println("ID\tName\t\tPrice\tSelect");

				// Find rows dynamically
				List<WebElement> rows = driver.findElements(By.xpath("//table[@id='productTable']//tbody/tr"));
				List<WebElement> cols = driver.findElements(By.xpath("//table[@id='productTable']//th"));

				// Iterate over rows and columns
				for (int r = 1; r <= rows.size(); r++) {
					// Print data except the last column (Checkbox)
					for (int c = 1; c <= cols.size() - 1; c++) { // Exclude last column (Checkbox)
						String tableData = driver
								.findElement(By.xpath("//table[@id='productTable']//tbody/tr[" + r + "]/td[" + c + "]"))
								.getText();
						System.out.print(tableData + "\t");
					}
					// Click the checkbox in the last column
					WebElement checkbox = driver
							.findElement(By.xpath("//table[@id='productTable']//tbody/tr[" + r + "]/td[4]/input"));
					checkbox.click();
					System.out.println();
				}
			}
		}
		driver.quit();
	}
}