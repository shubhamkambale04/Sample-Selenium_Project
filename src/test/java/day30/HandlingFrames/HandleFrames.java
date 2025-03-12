package day30.HandlingFrames;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	/*
	 * driver.switchTo.frame(id);
	 * driver.switchTo.frame(name);
	 * driver.switchTo.frame(WebElement);
	 */
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://ui.vision/demo/webtest/frames/");

		// Frame1 passed frame as a webelement
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1); // switch to frame1
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("welcome");
		driver.switchTo().defaultContent(); // go back to the page

		// Frame2
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Hello World");
		driver.switchTo().defaultContent();

		// Frame3
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("selenium");
		
		// switch to inner frame by using index
		driver.switchTo().frame(0);
		
		// inner frame webelements
		driver.findElement(By.xpath("//span[text()='I am a human']")).click();
		driver.findElement(By.xpath("//span[@class='aDTYNe snByac n5vBHf OIC90c' and text()='Web Testing']")).click();
		WebElement dropdown=driver.findElement(By.xpath("//span[text()='Choose']"));
		dropdown.click();
		Thread.sleep(2000);
		// Get the list of options
        List<WebElement> options = driver.findElements(By.xpath("//div[@class='OA0qNb ncFHed QXL7Te']"));
        options.get(0).click();
        
		//driver.findElement(By.xpath("//span[text()='Clear form']")).click();
		// Wait for the popup to appear
        Thread.sleep(2000); 
        // Handle the popup by clicking "Clear form" or "Cancel"
        //driver.findElement(By.xpath("//span[text()='Cancel']")).click();
			
        // click on next button
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		// click on back button
		driver.findElement(By.xpath("//span[text()='Back']")).click();
        
		// switch back to main page
        driver.switchTo().defaultContent();
		
		// Frame4
		WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frame4);
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("java");
		driver.switchTo().defaultContent();

		// Frame5
		WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("maven");
		driver.switchTo().defaultContent();

	}
}
