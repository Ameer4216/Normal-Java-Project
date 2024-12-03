package org.vikadan;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vikadan {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://books.vikatan.com/");

		List<WebElement> books = driver
				.findElements(By.xpath("//div[starts-with(@class,'booklist_books-image__Ne3td')]//img"));

		for (WebElement AllBooks : books) {
			System.out.println(AllBooks.getAttribute("alt"));
		}
	}

}
