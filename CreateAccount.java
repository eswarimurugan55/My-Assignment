package Assignment2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/.");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click(); 
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Jothi");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		WebElement industry = driver.findElement(By.name("industryEnumId"));
	    Select industryDropdown = new Select(industry);
	    industryDropdown.selectByVisibleText("Computer Software");
	     
	    WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
	    Select ownershipDropdown = new Select(ownership);
	    ownershipDropdown.selectByVisibleText("Partnership");
	     
	    WebElement source = driver.findElement(By.id("dataSourceId"));
	    Select sourceDropdown = new Select(source);
	    sourceDropdown.selectByValue("LEAD_EMPLOYEE");
	     
	    WebElement marketing = driver.findElement(By.id("marketingCampaignId"));
	    Select marketingDropdown = new Select(marketing);
	    marketingDropdown.selectByIndex(6); 

	    WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
	    Select stateDropdown = new Select(state);
	    stateDropdown.selectByValue("TX");
	     
	    driver.findElement(By.className("smallSubmit")).click();
	     
	    WebElement accountName = driver.findElement(By.linkText("Eshuu (10663)"));
	    String verifyName = accountName.getText();
	    System.out.println(verifyName + ": Account Name displayed correctly");
	     
	    driver.close();
 
	}

}

