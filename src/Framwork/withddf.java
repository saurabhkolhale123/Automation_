package Framwork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class withddf {public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	FileInputStream file=new FileInputStream("D:\\ddf.xlsx");
	   Sheet sh=  WorkbookFactory.create(file).getSheet("Sheet1");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://www.policybazaar.com/?pb_source=google_brand&pb_medium=ppc&pb_term=Policy%20bazar&pb_campaign=PB_Misspell00Brand&gad=1&gclid=CjwKCAjwg-GjBhBnEiwAMUvNWzW1a0vYWILglh6YvuAArhYGUOxGPZz3G8k7TjPt_ZB_UJ9tT_2YGxoCkH8QAvD_BwE");
	driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	
	     String num= sh.getRow(0).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys(num);
	driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
	
	String pwd=sh.getRow(0).getCell(1).getStringCellValue();
	driver.findElement(By.xpath("(//input[@name='password'])")).sendKeys(pwd);
	
	driver.findElement(By.xpath("//a[@id='login-in-with-password']")).click();
	
	Thread.sleep(2000);
	
	WebElement myaccount = driver.findElement(By.xpath("(//div[text()='My Account'])"));
	
	
	Actions act=new Actions(driver);
	
	act.moveToElement(myaccount).perform();
	
	WebElement myprofile = driver.findElement(By.xpath("//span[text()=' My profile ']"));
	
	
   
	act.click(myprofile).perform();
	
	Set<String> ids = driver.getWindowHandles();   //switch to child window
	ArrayList< String> al=new ArrayList<>(ids);
	driver.switchTo().window(al.get(1));
	
	String actText=driver.findElement(By.xpath("//input[@value='sherlock holmes']")).getAttribute("value");
	System.out.println(actText);
	
	String expText=sh.getRow(0).getCell(2).getStringCellValue();
	
	System.out.println(actText.equals(expText));
	
	
		
	
	
	
}
}
