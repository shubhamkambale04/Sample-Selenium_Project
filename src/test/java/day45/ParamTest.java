package day45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//1 created test case
//2 created xml file to run the test cases
//3 passed browser name parameter from xml file and received in setUp() method
//4 execute test case on multiple browser(serial execution one after another)
//5 parallel execution (add parallel parameter at suite level tag to run the parallel test execution) 

public class ParamTest {

	WebDriver driver;

	@BeforeClass
	@Parameters({ "browser" })
	void setUp(String br) throws InterruptedException {
		if (br.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (br.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (br.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("Browser not supported");
			throw new SkipException("Skipping tests as browser is not supported: " + br); // Stop further execution
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}

	@Test(priority = 1)
	void testLogo() {
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(status, true);
	}

	@Test(priority = 2)
	void testTitle() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "OrangeHRM");
	}

	@Test(priority = 3)
	void testURL() {
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterClass
	void tearDown() {
		driver.close();
	}

}
