package A5__iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ii {
public static void main(String[] args) {
	
	
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_intro_inner_html_quotes");
	
	driver.switchTo().frame("iframeResult");
	
	driver.findElement(By.xpath("//button[@type='button']")).click();
	
//	driver.switchTo().parentFrame();
	driver.switchTo().defaultContent();
	
	driver.findElement(By.xpath("//a[@id=\"menuButton\"]")).click();
	
	
	driver.findElement(By.xpath("//span[contains(text(),'Change Orientation')]")).click();
	
	
	
	
	
}
}
