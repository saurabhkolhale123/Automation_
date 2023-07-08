package B__1Handel_dropdown_bymouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropdowns {
	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
	
	Actions act=new Actions(driver);
	
	act.moveToElement(login).perform();
	
	WebElement order = driver.findElement(By.xpath("//div[text()='Orders']"));
	
		act.click(order).perform();
		
		
		
		
		
		
		
		
		
		
	}

}
