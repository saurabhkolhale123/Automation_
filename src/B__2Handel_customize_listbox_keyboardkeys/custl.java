package B__2Handel_customize_listbox_keyboardkeys;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class custl {
	public static void main(String[] args) {
		

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
		WebElement create=driver.findElement(By.xpath("//a[contains(@class,'_4jy0 ')]"));
		
		create.click();
		
		WebElement month = driver.findElement(By.xpath("//select[contains(@id,'month')]"));
		month.click();
		Actions act=new Actions(driver);
		
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		act.sendKeys(Keys.ARROW_DOWN).perform();	
//		act.sendKeys(Keys.ARROW_DOWN).perform();	act.sendKeys(Keys.ARROW_DOWN).perform();
//		
//		for(int i=0;i<=4;i++)
//		{
//			act.sendKeys(Keys.ARROW_DOWN).perform();
//		}
		
		
		act.sendKeys(Keys.HOME).perform();
		
		
		
		
		
		
		
	}
}
