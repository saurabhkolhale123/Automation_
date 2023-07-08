package A1_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ll {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
			
	driver.findElement(By.xpath("driver.findElement(By.xpath(\"//a[@id='u_0_0_ic']\"))")).click();
	
	
	WebElement month = driver.findElement(By.xpath("driver.findElement(By.xpath(\"//select[@id='month']\"))"));
	
	Select s=new Select(month);
	
	s.selectByVisibleText("Feb");
	Thread.sleep(1500);
	s.selectByValue("8");
	Thread.sleep(1000);
	
s.selectByIndex(3);



	
	
}
}
