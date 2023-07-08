package B__1Handel_dropdown_bymouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ddd {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	
	driver.switchTo().frame("demo-frame lazyloaded");
	WebElement img2 = driver.findElement(By.xpath("(//img[@width=\"96\"])[2]"));
	WebElement trash = driver.findElement(By.xpath("//div[@id=\"trash\"]"));
	Actions act=new Actions(driver);;
	
	act.dragAndDrop(img2, trash).perform();
	
	
	
	
}
}
