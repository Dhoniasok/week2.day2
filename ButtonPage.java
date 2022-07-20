package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonPage {
	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver (); 
		 driver.get("http://leafground.com/"); 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.manage().window().maximize();  
		 driver.findElement(By.xpath("(//img[@class='wp-categories-icon svg-image'])[2]")).click();
		 System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));
		 System.out.println("The url is :" +driver.getCurrentUrl());
	}

}



