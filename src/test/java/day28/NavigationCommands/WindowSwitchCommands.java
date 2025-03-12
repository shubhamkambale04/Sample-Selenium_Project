package day28.NavigationCommands;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwitchCommands {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in");
		driver.manage().window().maximize();

		// click on the element that open a new window called child window
		driver.findElement(By.xpath("//input[@name='dataase']")).click();

		Set<String> winIDs = driver.getWindowHandles();

		// Approach 1

		List<String> winList = new ArrayList<String>(winIDs);
		String parentID = winList.get(0);
		String childID = winList.get(1);

		// switch to child window
		driver.switchTo().window(childID);
		System.out.println(driver.getTitle());

		// switch to parent window
		driver.switchTo().window(parentID);
		System.out.println(driver.getTitle());

		// Approach 2

		for (String winId : winIDs) {
			String title = driver.switchTo().window(winId).getTitle();
			if (title.equals("parent/child window title")) {
				System.out.println(driver.getCurrentUrl());
			}
		}
	}
}
