package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver ();
		 driver.get("http://leafground.com/"); 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.manage().window().maximize();  
		 driver.findElement(By.xpath("//h5[text()='Drop down']")).click();
		 WebElement dropdown = driver.findElement(By.id("dropdown1"));
			Select select = new Select(dropdown);
			select.selectByVisibleText("Selenium");  
			 driver.findElement(By.id("dropdown1")).click();
			 System.out.println("The url is :" +driver.getCurrentUrl());
	}

}
