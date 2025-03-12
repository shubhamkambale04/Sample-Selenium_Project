package day26.WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * isDisplayed()
		 * isEnabled()
		 * isSelected()
		 */

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		
		//isDisplayed()
		boolean logo=driver.findElement(By.xpath("")).isDisplayed();
		System.out.println(logo);
		
		//isEnabled()
		boolean textbox=driver.findElement(By.xpath("")).isEnabled();
		System.out.println(textbox);
		
		//isSelected()
		// before selection
		WebElement male_rd=driver.findElement(By.xpath(""));
		WebElement female_rd=driver.findElement(By.xpath(""));
		
		String b_male= String.valueOf(male_rd.isSelected());
		String b_female=String.valueOf(female_rd.isSelected());
		System.out.println(b_male);
		System.out.println(b_female);

		// After selection
		male_rd.click();
		System.out.println(male_rd.isSelected());
		System.out.println(female_rd.isSelected());
		
		female_rd.click();
		System.out.println(male_rd.isSelected());
		System.out.println(female_rd.isSelected());
		
		Thread.sleep(5000);
		driver.quit();
	}
}
