package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		
		//Launching as a guest
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		
		//Launching ChromeBrowser
		ChromeDriver driver = new ChromeDriver();
		
		//loading the URL
		driver.get("http://leaftaps.com/opentaps/");
		
		//Maximize the screen
		driver.manage().window().maximize();
		
		//Enter a username and password
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//click on login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click on the Accounts tab
		driver.findElement(By.linkText("Accounts")).click();
		
		//Click on the create account button
		driver.findElement(By.linkText("Create Account")).click();
		
		//Enter an account name
		driver.findElement(By.id("accountName")).sendKeys("ABC LIMITED");
		
		//Enter a description as "Selenium Automation Tester."
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		
		//Select "ComputerSoftware" as the industry
		//Step 1: Find the element
		WebElement dropDownElement = driver.findElement(By.name("industryEnumId"));
		//Create the object
		Select options = new Select(dropDownElement);
		//Use the method
		options.selectByIndex(3);
		
		//Select "S-Corporation" as ownership using SelectByVisibleText
		WebElement dropDownElement1 =  driver.findElement(By.name("ownershipEnumId"));
		Select options1 = new Select(dropDownElement1);
		options1.selectByVisibleText("S-Corporation");
		
		//Select "Employee" as the source using SelectByValue
		
		WebElement dropDownElement2 = driver.findElement(By.id("dataSourceId"));
		Select options2 = new Select(dropDownElement2);
		options2.selectByValue("LEAD_EMPLOYEE");
		
		//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
		WebElement dropDownElement3 = driver.findElement(By.id("marketingCampaignId"));
		Select options3 = new Select(dropDownElement3);
		options3.selectByIndex(6);
		
		//Select "Texas" as the state/province using SelectByValue.
		WebElement dropDownElement4 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select options4 = new Select(dropDownElement4);
		options4.selectByValue("TX");
		
		//Click the "Create Account" button.
		driver.findElement(By.className("smallSubmit")).click();
		
		
		//Verify that the account name is displayed correctly.
		//Close the browser window.
		System.out.println("Account Created");
		driver.close();
	
		

	}

}
