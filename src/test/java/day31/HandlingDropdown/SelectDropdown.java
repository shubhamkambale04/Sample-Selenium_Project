package day31.HandlingDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/#");

		WebElement dropdown=driver.findElement(By.xpath("//select[@id='country']"));
		Select select =new Select(dropdown);
		//select.selectByIndex(3);
		//select.selectByValue("japan");
		select.selectByVisibleText("France");
		
		// capture the dropdown options
		List<WebElement> options=select.getOptions();
		System.out.println(options.size());
		
		// printing the options
		for(WebElement option:options)
		{
			System.out.println(option.getText());
		}
		
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		driver.quit();
	}
}
