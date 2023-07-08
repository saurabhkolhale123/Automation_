package A4__Scroll_updown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sss {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www/facebook.com/");
	
	
	 ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)");
	
	 ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-350)");

	 ((JavascriptExecutor)driver).executeScript("window.scrollBy(200,0)");

	 ((JavascriptExecutor)driver).executeScript("window.scrollBy(-200,0)");

}
}
