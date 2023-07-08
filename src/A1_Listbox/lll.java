package A1_Listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class lll {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
		
		WebElement day = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		
		Select s=new Select(day);
		
		s.selectByVisibleText("3");
		
		Thread.sleep(1);
		s.selectByValue("4");
		Thread.sleep(1);

		s.selectByIndex(4);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
