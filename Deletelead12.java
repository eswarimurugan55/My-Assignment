package week3.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Deletelead12
{
       public static void main(String[] args) throws InterruptedException
       {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/.");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
	    driver.findElement(By.xpath("//span[text()='Phone']")).click();
	    driver.findElement(By.name("phoneNumber")).sendKeys("9344295390");
	    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    
	    Thread.sleep(2000);
	    
	    WebElement leadElement = driver.findElement( By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
        String leadID = leadElement.getText();
        System.out.println("Captured Lead ID: " + leadID);
        
        leadElement.click();
        
        driver.findElement(By.linkText("Delete")).click();
        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.name("id")).sendKeys(leadID);
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        
        Thread.sleep(2000);
        
        String message = driver.findElement(By.className("x-paging-info")).getText();
        
        if (message.equals("No records to display")) {
            System.out.println("Lead deleted successfully!");
        } else {
            System.out.println("Lead deletion failed." + message);
        }

        driver.quit();	
	}
}


