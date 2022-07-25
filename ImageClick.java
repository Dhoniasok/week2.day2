package week2.day2;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageClick {


	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver ();
		 driver.get("http://leafground.com/"); 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.manage().window().maximize();  
		 driver.findElement(By.xpath("//a[@href='pages/Image.html']")).click();
		 System.out.println(driver.findElement(By.xpath("//img[@src='../images/home.png']")).getAttribute("src"));
		 driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		 System.out.println("The url is :" +driver.getCurrentUrl());
	}

}
