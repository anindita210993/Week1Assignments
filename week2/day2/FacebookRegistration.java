package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		// Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Add an implicit wait to ensure the web page elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click on the Create new account button
		
		driver.findElement(By.linkText("Create new account")).click();
		
		//Enter the First name. 
		driver.findElement(By.name("firstname")).sendKeys("Anandita");
		
		//Enter the Surname. 
		driver.findElement(By.name("lastname")).sendKeys("Mazumdar");
		
		//Enter the Mobile number or email address.
		driver.findElement(By.name("reg_email__")).sendKeys("8236456789");
		
		//Enter the New password.
		driver.findElement(By.id("password_step_input")).sendKeys("Abcdefgh@123");
		
		//Handle all three dropdowns in Date of birth
		WebElement dateOf = driver.findElement(By.id("day"));
		Select object = new Select(dateOf);
		object.selectByIndex(21);
		
		WebElement monthOf = driver.findElement(By.id("month"));
		Select object1 = new Select(monthOf);
		object1.selectByValue("9");
		
		WebElement yearOf = driver.findElement(By.id("year"));
		Select object2 = new Select(yearOf);
		object2.selectByVisibleText("1993");
		
		//Select the radio button in Gender.
		//driver.findElement(By.xpath("//i[@class = 'img sp_98fCI7IVTTz sx_c4643a']")).click();
	

	}

}
