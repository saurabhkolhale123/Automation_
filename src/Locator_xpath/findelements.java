package Locator_xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelements {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
//		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("9876453");
//		
//		
//		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("1234");
//		
//		driver.findElement(By.xpath("//button[text()=\"Log in\"]")).click();
		
		driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
