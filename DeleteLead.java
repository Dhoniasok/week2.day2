package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		
		// Download drive for path and setup
				WebDriverManager.chromedriver().setup();
		// object
				 ChromeDriver driver=new ChromeDriver (); 
		
		 // 	Launch the browser
				 driver.get("http://leaftaps.com/opentaps/control/main"); 
		 // to maximize
				 driver.manage().window().maximize();    
	    // Add implicit wait
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// 	Enter the Username
				 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		// Enter the password
				 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		//	Click Login
				 driver.findElement(By.xpath("//input[@type='submit']")).click();
		//	Click CRM/SFA link
				 driver.findElement(By.xpath("(//div[@id='label']//a[1])")).click();
	    //	Click Leads link
				 driver.findElement(By.xpath("(//div[@class='x-panel-header']//a)[2]")).click();
		//	Click Find leads
				 driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
		//	Click on Phone
				 driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//	Enter phone number
				 driver.findElement(By.xpath("//input[@id='ext-gen270']")).sendKeys("8940892285");
		//	Click find leads button	
				 driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
	    //   Capture lead ID of First Resulting lead
				 System.out.println(driver.findElement(By.xpath("//a[text()='14066']")).getText());
		//	Click First Resulting lead
				 driver.findElement(By.xpath("//a[text()='14066']")).click();
        //	Click Delete
				 driver.findElement(By.xpath("//a[text()='Delete']")).click();
        //	Click Find leads
				 driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
        // Enter captured lead ID
				 driver.findElement(By.xpath("//input[@name='id']")).sendKeys("14066");
       // Click find leads button
				 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
      //	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
				 System.out.println(driver.findElement(By.xpath("//div[text()='No records to display']")).getText());
      //	 Close the browser (Do not log out)
	 	        driver.close();
		
}
}
