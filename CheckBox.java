package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver ();
		 driver.get("http://leafground.com/"); 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.manage().window().maximize();  
		 driver.findElement(By.xpath("//h5[text()='Checkbox']")).click();
		 driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		 driver.findElement(By.xpath("(//input[@type='checkbox'])[11]")).click();
		 System.out.println("The url is :" +driver.getCurrentUrl());

}
}