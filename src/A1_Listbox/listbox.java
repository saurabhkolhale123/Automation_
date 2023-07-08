package A1_Listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox {
public static void main(String[] args) {
	

	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.facebook.com/");
	
	WebElement create=driver.findElement(By.xpath("//a[contains(@class,'_4jy0 ')]"));
	
	create.click();
	
	WebElement month = driver.findElement(By.xpath("//select[contains(@id,'month')]"));
	
	Select s=new Select(month);
	
	s.selectByVisibleText("Jan");
	
	s.deselectByValue("8");
	
}	
}
