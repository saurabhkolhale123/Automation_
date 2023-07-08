package A6__popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class alert1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://nxtgenaiacademy.com/alertandpopup/");
	
	
	driver.findElement(By.name("promptalertbox1234")).click();
	
	Alert alt = driver.switchTo().alert();
	alt.sendKeys("ok");
	Thread.sleep(4000);
	alt.accept();
	
	
	
}
}
