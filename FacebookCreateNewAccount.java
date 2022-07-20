package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookCreateNewAccount {


	public static void main(String[] args) throws InterruptedException {
		// Download drive for path and setup
		WebDriverManager.chromedriver().setup();
		// object
		 ChromeDriver driver=new ChromeDriver (); 
		// URL for Facebook
		 driver.get("https://en-gb.facebook.com/"); 
		// to maximize
		 driver.manage().window().maximize();    
		 // Add implicit wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 // Click on Create New Account button
		 driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		 //Enter the first name
		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Asok");
		 //Enter the last name
		 driver.findElement(By.xpath("(//div[text()='Surname']/following::input[1])")).sendKeys("Dhoni");
		 //Enter the mobile number
		 driver.findElement(By.xpath("(//div[text()='Mobile number or email address']/following::input[1])")).sendKeys("8940892284");
		 //Enter the password
		 driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Asok@1234");
		 //Handle all the three drop downs
		 WebElement dropdown = driver.findElement(By.xpath("//select[@id='day']"));
			Select select = new Select(dropdown);
		 // using ByVisibleText
			select.selectByVisibleText("19");  
			 driver.findElement(By.xpath("//select[@id='day']")).click();
		 // dropdown for 2nd element	 
		 WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='month']"));
				Select select1 = new Select(dropdown1);
	    // using ByValue
				select1.selectByValue("11");  
				 driver.findElement(By.xpath("//select[@id='month']")).click();
		// dropdown	for 3rd element
	     WebElement dropdown2 = driver.findElement(By.xpath("//select[@id='year']"));
	        Select select2 = new Select(dropdown2);		 
	    // using ByIndex
	        select2.selectByValue("1997");  
			 driver.findElement(By.xpath("//select[@id='year']")).click(); 
			 
	   // Select the radio button "Male" 
		 driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click(); 
		 
	  // A normal click will do for this step
		 driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		 
	// to get the title page 
		 String name = driver.getTitle();
		 {
			 System.out.println(" The title of the page is " +name);
		 }
	}

}
