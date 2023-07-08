package B__2Handel_customize_listbox_keyboardkeys;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class cust {
	public static void main(String[] args) throws InterruptedException {
		
       WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
         Thread.sleep(3000);

		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		Thread.sleep(3000);

		 driver.findElement(By.xpath("//select[@id=\"month\"]")).click();
		
		Actions act=new Actions(driver);
//		//Thread.sleep(3000);
//		act.click(month).perform();
		
		act.sendKeys(Keys.ARROW_UP).perform();
		act.sendKeys(Keys.ARROW_UP).perform();
		act.sendKeys(Keys.ARROW_UP).perform();
		act.sendKeys(Keys.ARROW_UP).perform();

//		for(int i=1;i<=4;i++)
//		{
//			act.sendKeys(Keys.ARROW_UP).perform();
//			Thread.sleep(500);
//
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
