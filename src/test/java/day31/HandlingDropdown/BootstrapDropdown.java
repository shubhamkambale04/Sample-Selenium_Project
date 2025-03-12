package day31.HandlingDropdown;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");

		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();

		// 1) sigle option select
		driver.findElement(By.xpath("//input[@value='Python']")).click();

		// 2) capture all options
		List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		System.out.println(options.size());

		// 3) print options
		for (WebElement option : options) {
			System.out.println(option.getText());
		}
		
		// 4) multi select option
		for(WebElement option : options)
		{
			String op=option.getText();
			if(op.equals("Java") || op.equals("Oracle"))
			{
				option.click();
			}
		}
		
		driver.quit();
	}
}
