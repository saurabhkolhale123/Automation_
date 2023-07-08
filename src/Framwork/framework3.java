package Framwork;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class framework3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@type=\"number\"])[2]")).sendKeys("9420746653");

		driver.findElement(By.xpath("(//span[text()=\"Sign in with Password\"])[2]")).click();

		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Saurabh@123");

		
	    driver.findElement(By.xpath("//span[text()='Sign in']")).click();
	    
	   WebElement myacc = driver.findElement(By.xpath("//div[text()='My Account']"));
		Actions act=new Actions(driver);
		
		act.moveToElement(myacc).perform();
		
		driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
		
		Set<String> ids = driver.getWindowHandles();
		
		ArrayList< String> al=new ArrayList<>(ids);
		
		driver.switchTo().window(al.get(1));
		
		
	String acttext=driver.findElement(By.xpath("//input[@name=\"personName\"]")).getAttribute("value");
	
	  System.out.println(acttext);
	
	  String exptext="sherlock holmes";
	
	if (acttext.equals(exptext))
	{
		System.out.println("tc pass");
	}
	
	else {System.out.println("tc fail");}
	
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
