package day46;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

// 1) create test case
// 2) create listener class
// 3) create xml file and which include both test case & listener class

@Listeners(day46.Listener.class)
public class TestCase {
	WebDriver driver;

	@BeforeClass
	void setUp() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@Test(priority = 1)
	void testLogo() {
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(status, true);
	}

	@Test(priority = 3, dependsOnMethods = { "testAppUrl" })
	void testHomePageTitle() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "OrangeHRM");
	}

	@Test(priority = 2)
	void testAppUrl() {
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com");
	}

	@AfterClass
	void tearDown() {
		driver.quit();
	}

}
