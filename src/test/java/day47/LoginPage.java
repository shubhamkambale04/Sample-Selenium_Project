package day47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// without using pagefactory
public class LoginPage {
	
	WebDriver driver;
	
	// 1 constructor
	LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	// 2 locators
	By username=By.xpath("//input[@placeholder='Username']");
	By password=By.xpath("//input[@placeholder='Password']");
	By button=By.xpath("//button[normalize-space()='Login']");
	
	// 3 Action methods
	public void setUsername(String user)
	{
		driver.findElement(username).sendKeys(user);
	}
	
	public void setPassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);	
	}
	
	public void clickLogin()
	{
		driver.findElement(button).click();;
	}

}
