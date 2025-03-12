package day29.CheckboxAlertsPopupsHandling;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAuthenticatedPopup {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://the-internet.herokuapp.com/basic_auth");
		Thread.sleep(2000);
		
		//Authicated url
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	
		Thread.sleep(2000);
		driver.quit();
	}

}
