package A4__Scroll_updown;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sc {
	public static void main(String[] args) throws IOException {
		

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://www.facebook.com/");
		 
		WebElement my = driver.findElement(By.xpath("//a[text()='Meta Quest']"));
		
		// ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,270)");		 
		 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",my);
	}
}
