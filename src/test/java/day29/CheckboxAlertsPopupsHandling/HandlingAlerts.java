package day29.CheckboxAlertsPopupsHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {
	public static WebDriver driver;
	public static Alert myalert ;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");
		
		// 1) simple alert
		driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
		myalert=driver.switchTo().alert();
		Thread.sleep(2000);
		String txt=myalert.getText();
		System.out.println(txt);
		myalert.accept();
		Thread.sleep(5000);

		// 2) confirmation alert
		driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
		myalert = driver.switchTo().alert();
		Thread.sleep(2000);
		//myalert.accept();
		myalert.dismiss();
		Thread.sleep(5000);
		
		// 3) prompt alert
		driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
		myalert = driver.switchTo().alert();
		Thread.sleep(2000);
		myalert.sendKeys("Harry Potter");
		myalert.accept();
		//myalert.dismiss();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
