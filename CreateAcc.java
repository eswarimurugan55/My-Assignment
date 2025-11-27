package Assignment2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAcc 
{
	   public static void main(String[] args) throws InterruptedException
	    {

	       
	        ChromeDriver driver = new ChromeDriver();
	        driver.get("http://leaftaps.com/opentaps/");

	        
	        driver.manage().window().maximize();
	        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	        driver.findElement(By.id("password")).sendKeys("crmsfa");
	        driver.findElement(By.className("decorativeSubmit")).click();
	        driver.findElement(By.linkText("CRM/SFA")).click();
	        driver.findElement(By.linkText("Accounts")).click();
	        driver.findElement(By.linkText("Create Account")).click();
	        driver.findElement(By.id("accountName")).sendKeys("TestLeaf Selenium Account");
	        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	        
	        WebElement industry = driver.findElement(By.name("industryEnumId"));
	        Select dd1 = new Select(industry);
	        dd1.selectByVisibleText("ComputerSoftware");

	        WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
	        Select dd2 = new Select(ownership);
	        dd2.selectByVisibleText("S-Corporation");

	        WebElement source = driver.findElement(By.id("dataSourceId"));
	        Select dd3 = new Select(source);
	        dd3.selectByValue("LEAD_EMPLOYEE");

	        WebElement marketing = driver.findElement(By.id("marketingCampaignId"));
	        Select dd4 = new Select(marketing);
	        dd4.selectByIndex(6);  // "eCommerce Site Internal Campaign"

	        WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
	        Select dd5 = new Select(state);
	        dd5.selectByValue("TX"); // Texas

	        driver.findElement(By.className("smallSubmit")).click();

	        String accName = driver.findElement(By.id("sectionHeaderTitle_accounts")).getText();
	        System.out.println("Account created successfully: " + accName);

	        driver.close();
	    }
	}




