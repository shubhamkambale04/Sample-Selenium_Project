package day26.WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in");
		driver.manage().window().maximize();

		Thread.sleep(5000);
		driver.findElement(By.linkText("")).click();

		// Close it closes the current opened window only
		driver.close();

		// quit it closes all the windows
		driver.quit();
	}
}
