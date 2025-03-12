package day30.HandlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://ui.vision/demo/webtest/frames/");

		// Frame5
		WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("maven");
		
		// click on link to open new iframe
		driver.findElement(By.linkText("https://a9t9.com")).click();
		
		// switch to inner frame
		WebElement iframe = driver.findElement(By.xpath("//div[@id='header']"));
		driver.switchTo().frame(iframe);
		
		// check logo presence
		boolean status=driver.findElement(By.xpath("//a[@id='logo']")).isDisplayed();
		System.out.println(status);
		
		
		
		driver.switchTo().defaultContent();

	}

}
