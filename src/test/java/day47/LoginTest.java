package day47;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver driver;

	@BeforeClass
	void setUp() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
	}

	@Test
	void testLogin() {
		
		// without using pagefactory
		/*
		LoginPage lp = new LoginPage(driver);
		lp.setUsername("Admin");
		lp.setPassword("admin123");
		lp.clickLogin();
		*/
		// using pagefactory
		LoginPage1 lp1 = new LoginPage1(driver);
		lp1.setUsername("Admin");
		lp1.setPassword("admin123");
		lp1.clickLogin();

		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}

	@AfterClass
	void tearDown() {
		driver.quit();
	}

}
