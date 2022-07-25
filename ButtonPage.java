package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonPage {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("The title of the current page is : " + title);

		// To find the color using getCssValue
		String cssValue = driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println("The color if the element is : " + cssValue);

		// Check the left hand corner of the element
		System.out.println("The size of Left hand corner of the element is : " + driver.findElement(By.xpath("//button[text()='Get Position']")).getLocation());

		// Check the size
		System.out.println("The height of the screen is : " + driver.findElement(By.id("size")).getSize());

		//  navigate to the next page
		driver.findElement(By.xpath("//button[text()='Go to Home Page']")).click();
	}

}



