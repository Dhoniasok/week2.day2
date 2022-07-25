package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("The title of the current page is : " + title);

		// click on the java and SQL language
		System.out.println("Java is not selected : " + driver.findElement(By.xpath("(//div[@class='example']/preceding::input)[1]")).isSelected());

		// Click Java and SQL
		driver.findElement(By.xpath("(//div[@class='example']/preceding::input)[1]")).click();
		driver.findElement(By.xpath("(//div[@class='example']/preceding::input)[3]")).click();

		// confirm the selenium is selected or not
		System.out.println("Checking the selenium checkbox is selected or not : "+ driver.findElement(By.xpath("(//label[text()='Confirm Selenium is checked']/following::input)[1]")).isSelected());

		// de select the only checked
		driver.findElement(By.xpath("(//label[text()='DeSelect only checked']/following::input)[2]")).click();

		// Select all check box
		driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following::input)[1]")).click();
		driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following::input)[2]")).click();
		driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following::input)[3]")).click();
		driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following::input)[4]")).click();
		driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following::input)[5]")).click();
		driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following::input)[6]")).click();

}
}