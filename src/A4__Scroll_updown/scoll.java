package A4__Scroll_updown;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scoll {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.facebook.com/");
		
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,250)");
		
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-250)");
		
		
		
		
		
		
		
	}

}
