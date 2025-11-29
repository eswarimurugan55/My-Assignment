package week3.day2;
 
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Editlead 
{

	public static void main(String[] args)
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
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf Solutions");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Eshwari");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Murugan");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Vishnu");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Manual&Automation Tester");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("eswarimurugan55@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9876543313");
		
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateDropdown = new Select(state);
		stateDropdown.selectByVisibleText("London");
		  
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		
		WebElement descriptionField = driver.findElement(By.id("updateLeadForm_description"));
	    descriptionField.clear();
	    
	    driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Important note: Lead updated successfully.");
	    driver.findElement(By.className("smallSubmit")).click();
	    
	    String title = driver.getTitle();
        System.out.println("Resulting Page Title: " + title);

        driver.quit();
        
  }

}

	


