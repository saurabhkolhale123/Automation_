package Framwork;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class framework1 {
	public static void main(String[]args) throws InterruptedException
	{
		   //without ddf
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            driver.get("https://www.policybazaar.com/");		
              driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		
		driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys("9420746653");
		driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
		
		driver.findElement(By.xpath("(//input[@name='password'])")).sendKeys("Saurabh@123");
		driver.findElement(By.xpath("//a[@id='login-in-with-password']")).click();
		
		Thread.sleep(2000);
		
		WebElement myaccount = driver.findElement(By.xpath("(//div[text()='My Account'])"));
		
		
	   
		Actions act=new Actions(driver);
		
		act.moveToElement(myaccount).perform();
		
		WebElement myprofile = driver.findElement(By.xpath("//span[text()=' My profile ']"));
//	
		act.click(myprofile).perform();
		
		
		Set<String> ids = driver.getWindowHandles();
		ArrayList< String> al=new ArrayList<>(ids);
		
	    driver.switchTo().window(al.get(1));
		
		String actText=driver.findElement(By.xpath("//input[@value='sherlock holmes']")).getAttribute("value");
		
		String expText="sherlock ";
		
		System.out.println(actText.equals(expText));
		
		
			
		
		
	}
}
