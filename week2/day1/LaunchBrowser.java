package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
public static void main(String[] args) {
	
	//creating object 
	ChromeDriver driver=new ChromeDriver();
	
	//launch URL
	driver.get("https://www.facebook.com/");
	
	//maximize the window
	driver.manage().window().maximize();
}
}
