package day47;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//using pagefactory
public class LoginPage1 {
	
	WebDriver driver;
	
	// 1 constructor
	LoginPage1(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// 3 locators
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement txt_username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txt_password;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btn_login;
	
	// 3 Action methods
	public void setUsername(String user)
	{
		txt_username.sendKeys(user);
	}
	
	public void setPassword(String pwd)
	{
		txt_password.sendKeys(pwd);	
	}
	
	public void clickLogin()
	{
		btn_login.click();;
	}

}
