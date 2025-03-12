package day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");

		// 1) find total number of rows in table
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println(rows);

		// 2) find total number of column in table
		int cols = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println(cols);

		// 3) Read data from specific row and column
		String subject = driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]//td[3]")).getText();
		System.out.println(subject);

		// 4) read data from all rows and columns
		System.out.println("BookName" + "\t" + "Author" + "\t" + "Subject" + "\t" + "Price");
		for (int r = 2; r <= rows; r++) {
			for (int c = 1; c <= cols; c++) {
				String tableData = driver
						.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[" + c + "]")).getText();
				System.out.print(tableData + "\t");
			}
			System.out.println();
		}

		// 5) print book names who's author name is Amit
		for (int r = 2; r <= rows; r++) {
			String authorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[2]"))
					.getText();
			if (authorName.equals("Amit")) {
				String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[1]"))
						.getText();
				System.out.println(bookName + "\t" + authorName);
			}
		}

		// 6) find the price of books
		for (int r = 2; r <= rows; r++) {
			String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[4]")).getText();
			System.out.println("Single book price:"+price);
		}
		
		// 7) total price of all books
		int totalPrice=0;
		for (int r = 2; r <= rows; r++) {
			String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[4]")).getText();
			totalPrice=totalPrice+Integer.parseInt(price);
		}
		System.out.println("Total price of the books:"+totalPrice);
		
		driver.quit();
	}
}
