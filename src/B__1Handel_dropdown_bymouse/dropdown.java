package B__1Handel_dropdown_bymouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropdown {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.flipkart.com/");
	
  driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
	
	
	Actions act=new Actions(driver);
	
	
	WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
	
	act.moveToElement(login).perform();
	
	WebElement pro = driver.findElement(By.xpath("//a[@class=\"_2kxeIr _1pY_1Z\"]"));
	
	act.click(pro).perform();
}
}
