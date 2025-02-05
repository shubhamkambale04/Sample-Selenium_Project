package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Checkboxes {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		driver.close();
		
		//WebElement on which drag and drop operation needs to be performed  
		WebElement fromWebElement = driver.findElement(By.xpath(""));
		  
		//WebElement to which the above object is dropped  
		WebElement toWebElement = driver.findElement(By.xpath(""));  
		  
		//Creating object of Actions class to build composite actions  
		Actions builder = new Actions(driver);  
		  
		//Building a drag and drop action  
		Action dragAndDrop = builder.clickAndHold(fromWebElement)  
		             .moveToElement(toWebElement)  
		             .release(toWebElement)  
		         .build();  
		  
		//Performing the drag and drop action  
		dragAndDrop.perform();  
		

	}

}
