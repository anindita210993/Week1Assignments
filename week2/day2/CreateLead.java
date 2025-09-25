package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

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
				
				//Click on the "Leads" tab
				driver.findElement(By.linkText("Leads")).click();
				
				//Click on the "Create Lead" button
				driver.findElement(By.linkText("Create Lead")).click();
				
				//Enter a FirstName
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anindita");
				
				//Enter a LastName
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mazumder");
				
				//Enter a CompanyName.
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf limited");
				
				//Enter a Title
				driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Lead created");
				
				//Click the "Create Lead" button
				driver.findElement(By.name("submitButton")).click();
				
				//Verify that the Title is displayed correctly
				//Close the browser window
				
				driver.close();
				
				

	}

}
