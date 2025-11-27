package Assignment2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;



public class FbCreateAccount 
{

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("eshwari");
		driver.findElement(By.name("lastname")).sendKeys("murugan");
		
		WebElement day = driver.findElement(By.id("day"));
	    Select dayDropdown = new Select(day);
	    dayDropdown.selectByVisibleText("23");
	    
	    WebElement month = driver.findElement(By.id("month"));
	    Select monthDropdown = new Select(month);
	    monthDropdown.selectByVisibleText("Dec");
	    
	    
	    WebElement year = driver.findElement(By.id("year"));
	    Select yearDropdown = new Select(year);
	    yearDropdown.selectByVisibleText("1996");
	    
	    driver.findElement(By.xpath("//label[text()='Female']")).click();
	    
	    driver.findElement(By.name("reg_email__")).sendKeys("eswarimurugan55@gmail.com");
	    
	   
	    
	    
	 
		

	}


}
