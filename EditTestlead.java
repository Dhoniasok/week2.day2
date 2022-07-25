package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditTestlead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();

		String title = driver.getTitle();
		System.out.println("The title of the current page is : " + title);

		// Enter the email address
		driver.findElement(By.id("email")).sendKeys("afde@gmail.com");

		// Append the text
		driver.findElement(By.xpath("(//label[text()='Append a text and press keyboard tab']/following::input)[1]")).sendKeys(Keys.TAB);

		// to check the attribute of the tag using getAttribute
		System.out.println("The attribute of the value is : " + driver.findElement(By.name("username")).getAttribute("value"));

		// to clear the text
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();

		// Edit field is disabled
		boolean enabled = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();

		if (enabled) {
			System.out.println("Confirm that field is enabled");

		} else {
			System.out.println("Confirm that field is NOT enabled !!!");
		}
}
}
