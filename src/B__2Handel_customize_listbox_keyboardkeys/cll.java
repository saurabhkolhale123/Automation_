package B__2Handel_customize_listbox_keyboardkeys;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class cll {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.facebook.com/");
	
 WebElement v1 = driver.findElement(By.xpath("(//a[@role=\"button\"])[2]"));
	
	v1.click();
	
	WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
	
	Actions act=new Actions(driver);
	
	act.click(month).perform();
	
	act.sendKeys(Keys.ARROW_UP).perform();
	act.sendKeys(Keys.ARROW_UP).perform();
	act.sendKeys(Keys.ARROW_UP).perform();

	
	
	
	
	
	
	
	
	
	
}
}
