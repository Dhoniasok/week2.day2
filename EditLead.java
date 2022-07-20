package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
	    // 	Enter first name
				 driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Asok");
		// Click Find leads button
				 driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		// Click on first resulting lead
				 driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		// Verify title of the page
				 String name = driver.getTitle();
				 {
					 System.out.println(" The title of the page is " +name);
				 }
		//  Click Edit
				 driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
		// Change the company name
				 driver.findElement(By.xpath("(//input[@class='inputBox'])[1]")).clear();
				 driver.findElement(By.xpath("(//input[@class='inputBox'])[1]")).sendKeys("Infosys");
		// Click Update
				 driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
	   // Confirm the changed name appears
				 System.out.println(driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText());
				
		// Close the browser (Do not log out)
				 driver.close();

	}
}

