package B__3Handel_dynamic_ele;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dyna {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("redmi 9");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	String text=driver.findElement(By.xpath("(//a[@class='_1fQZEK']//span)[8]")).getText();
	System.out.println(text);
}
}
