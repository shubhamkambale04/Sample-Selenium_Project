package day45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderDemo {

	WebDriver driver;

	@BeforeClass
	void setUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(dataProvider="dp")
	void testLogin(String email, String pwd) throws InterruptedException {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);

		boolean status = driver.findElement(By.xpath("")).isDisplayed();
		if (status == true) {
			driver.findElement(By.xpath("")).click();
			Assert.assertTrue(true);
		} else {
			Assert.fail();
		}

	}

	@AfterClass
	void tearDown() {
		driver.close();
	}

	//creating the test data and retuning the data. this is hardcoded type data
	@DataProvider(name="dp", indices= {0,3}) // indices attribute is used for control the input execution
	Object[][] loginData() {
		Object data[][] = { { "abc@gmail.com", "pass123" }, { "abc1@gmail.com", "pass124" },
				{ "abc2@gmail.com", "pass125" }, { "abc3@gmail.com", "pass126" } };
		return data;
	}
}