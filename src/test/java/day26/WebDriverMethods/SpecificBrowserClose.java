package day26.WebDriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecificBrowserClose {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in");
		driver.manage().window().maximize();

		Thread.sleep(5000);
		driver.findElement(By.linkText("")).click();

		// get all window ID's
		Set<String> winIds = driver.getWindowHandles();

		String targetWindow = "title of window";

		// we have to close specific window
		for (String winid : winIds) {
			driver.switchTo().window(winid);
			String title = driver.getTitle();
			System.out.println(title);
			//String currentUrl=driver.getCurrentUrl();
			if (title.equals(targetWindow)) {
				driver.close();
				break;
			}
		}
	}
}
