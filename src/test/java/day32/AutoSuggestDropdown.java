package day32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("http://www.google.com");

		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(3000);

		List<WebElement> options = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
		System.out.println(options.size());
		
		for (WebElement option : options) {
			
		    String op = option.getText().trim();
		    System.out.println(op);
		    if (op.equalsIgnoreCase("selenium")) { 
		        option.click();
		        break; // Stop loop after selecting "selenium"
		    }
		}

		driver.quit();
	}
}
