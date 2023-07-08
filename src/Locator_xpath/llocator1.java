package Locator_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class llocator1 {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("skkolhale60@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("iamdevil");
		
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
