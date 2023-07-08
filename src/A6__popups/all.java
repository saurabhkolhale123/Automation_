package A6__popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class all {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
		
		driver.findElement(By.name("promptalertbox1234")).click();	
		
		Alert alt = driver.switchTo().alert();
		
		alt.accept();
    
		
		
	}
}
