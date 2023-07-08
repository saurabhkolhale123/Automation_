package WebElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webe {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	WebElement create=driver.findElement(By.xpath("//a[contains(@class,'_4jy0 ')]"));
	
	create.click();
	
	String text=create.getText();
	create.isDisplayed()
	;boolean select=create.isSelected();
	boolean result=create.isEnabled();
	System.out.println(result);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
