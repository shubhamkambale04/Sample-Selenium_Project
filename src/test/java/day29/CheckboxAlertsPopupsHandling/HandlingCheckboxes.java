package day29.CheckboxAlertsPopupsHandling;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckboxes {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");

		// 1) select specific checkbox
		// driver.findElement(By.xpath("//input[@id='sunday']")).click();

		// 2) select all checkboxes
		List<WebElement> checkboxes = driver
				.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));

		
		/*
		 * // Approach 1 for (int i = 0; i < checkboxes.size(); i++) {
		 * checkboxes.get(i).click(); }
		 * 
		 */
		 // Approach 2 
		  for (WebElement checkbox : checkboxes) 
		  { 
			  checkbox.click(); 
		  }
		 /* 
		 * // 3) Define the checkboxes you want to select List<String>
		 * checkboxesToSelect = Arrays.asList("Monday", "Wednesday", "Friday");
		 * 
		 * for (WebElement checkbox : checkboxes) { // Get the associated label
		 * (assuming the label follows the checkbox) WebElement label =
		 * checkbox.findElement(By.xpath("following-sibling::label")); String title =
		 * label.getText().trim();
		 * 
		 * // If the checkbox label is in the list, select it if
		 * (checkboxesToSelect.contains(title)) { if (!checkbox.isSelected()) {
		 * checkbox.click(); System.out.println("Clicked: " + title); } } }
		 * 
		 * // 4) select last 3 checkboxes // 7-3=4 for (int i = 4; i <
		 * checkboxes.size(); i++) { checkboxes.get(i).click(); }
		 * 
		 * // 5) select first 3 checkboxes for (int i = 0; i < 3; i++) {
		 * checkboxes.get(i).click(); }
		 * 
		 */
		
		// 6) unselect checkoxes if they are selected
		for (WebElement checkbox : checkboxes) {
			if (checkbox.isSelected()) {
				checkbox.click();
			}
		}

		Thread.sleep(3000);
		driver.close();
	}
}
