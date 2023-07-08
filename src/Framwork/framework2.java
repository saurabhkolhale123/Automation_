package Framwork;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class framework2 {
public static void main(String[]args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.policybazaar.com/?pb_source=google_brand&pb_medium=ppc&pb_term=Policy%20bazar&pb_campaign=PB_Misspell00Brand&gad=1&gclid=CjwKCAjwg-GjBhBnEiwAMUvNWzW1a0vYWILglh6YvuAArhYGUOxGPZz3G8k7TjPt_ZB_UJ9tT_2YGxoCkH8QAvD_BwE");
	
	driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	
	driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys("9420746653");
	
	driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
	
	driver.findElement(By.xpath("(//input[@name='password'])")).sendKeys("Saurabh@123");
	
	driver.findElement(By.xpath("//a[@id='login-in-with-password']")).click();
	
	Thread.sleep(2000);
	WebElement myaccount = driver.findElement(By.xpath("//div[text()='My Account']"));
	
	Actions act=new Actions(driver);
	Thread.sleep(2000);

	act.moveToElement(myaccount).perform();
	
	driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
	Thread.sleep(1000);
	Set<String> ids = driver.getWindowHandles();
	ArrayList< String> al=new ArrayList<>(ids);
	
   driver.switchTo().window(al.get(1));
   
	String acttext=driver.findElement(By.xpath("//input[@type='text']")).getAttribute("value");
	Thread.sleep(2000);
	//System.out.println(acttext);
	String exptext="sherlock holmes";
	
	System.out.println(acttext.equals(exptext));
	
	
	
	
}
}
