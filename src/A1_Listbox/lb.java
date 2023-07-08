package A1_Listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class lb {
public static void main(String[] args) throws InterruptedException {
	
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.facebook.com/");
	
 WebElement v1 = driver.findElement(By.xpath("(//a[@role=\"button\"])[2]"));
	
	v1.click();
	
	WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
	
	Select s=new Select(month);
	
	s.selectByVisibleText("Jan");
	
	Thread.sleep(1000);
	
	s.deselectByIndex(1);
	
	s.selectByValue("8");
	
	
	
	
	
	
	
	
	
	
	
	
}
}
